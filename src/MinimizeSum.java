import java.util.Arrays;

public class MinimizeSum {
    // funkcja liczy najmniejszą sumę elementów tablicy
    //5*2 + 3*4 = 22
    // 2 3 4 5
    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int wynik = 0;

        for (int i = 0; i < passed.length / 2; i++) {
            wynik += passed[i] * passed[passed.length - 1 - i];
        }
        return wynik;
    }

}



