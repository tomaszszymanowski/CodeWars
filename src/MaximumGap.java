import java.util.Arrays;

public class MaximumGap {
    // funkcja sortuje tablicę i zwraca najwiekszą wartość różnicy odejmowanych od siebie
    //  kolejnych elementów tablicy


    public static int maxGap(int[] numbers) {
        int luka = 0;

        Arrays.sort(numbers);
        for (int i = 0, j = numbers.length - 1, tmp; i < j; i++, j--) {
            tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
        }

        for (int j = 0; j < numbers.length - 1; j++) {
            if (j < numbers.length) {
                int wynik = numbers[j] - numbers[j + 1];
                if (luka < wynik) {
                    luka = wynik;
                }
            }
        }
        return luka;
    }

    public static void main(String[] args) {

        System.out.println(maxGap(new int[]{13, 10, 5, 2, 9}));

    }
}
/*
* best solution from code wars
*
* public static int maxGap(int[] numbers)
    {
        int maxGap = 0;
        Arrays.sort(numbers);
        for ( int i=1; i<numbers.length; i++)
           maxGap =  Math.max ( numbers[i]-numbers[i-1] , maxGap) ;

        return maxGap;
    }
    * */






