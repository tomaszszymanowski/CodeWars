import java.util.Arrays;

public class MenFromBoys2 {

    public static int[] menFromBoys(final int[] values) {

        // moje rozwiązanie

        int[] parzyste = new int[values.length];
        int[] nieparzyste = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                parzyste[i] = values[i];
            } else {
                nieparzyste[i] = values[i];
            }
        }

        Arrays.sort(parzyste);
        Arrays.sort(nieparzyste);

        int[] kopiaNieparzyste = Arrays.copyOf(nieparzyste, nieparzyste.length);
        // wstawianie parzystych na początek rosnąco
        for (int i = 0, j = 0; i < values.length; i++) {
            if (parzyste[i] != 0) {
                values[j] = parzyste[i];
                j++;
            }
            values[i] = 0;
        }

        // sortowanie malejące
        for (int j = values.length - 1, k = 0; j >= 0; j--, k++) {
            nieparzyste[k] = kopiaNieparzyste[values.length - 1 - k];
        }

        // wpisywanie nieparzystych
        for (int i = 0, j = 0; i < values.length; i++) {
            if (values[i] == 0) {
                values[i] = nieparzyste[j];
                j++;
            }
        }


        return values;
    }

    public static void main(String[] args) {
        int[] tab = menFromBoys(new int[]{14, 7, 3, 4, 12, 1});

        for (int num : tab) {
            System.out.println(num);
        }
    }
}
