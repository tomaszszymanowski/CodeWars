import java.util.Scanner;

public class BarGraph {
    public static void main(String[] args) {

        int numbersOfShops = 3;
        int numberOfStars = 0;
        String stars = "";

        int[] shopsSale = new int[numbersOfShops];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbersOfShops; i++) {
            System.out.print("podaj wartość sprzedaży dla sklepu nr " + (i + 1) + ":  ");
            shopsSale[i] = scanner.nextInt();
        }

        for (int j = 0; j < shopsSale.length; j++) {
            numberOfStars = shopsSale[j] / 100;
            System.out.print("sprzedaż sklepu nr" + (j + 1) + ":");
            for (int k = 0; k < numberOfStars; k++) {
                stars += "*";
                System.out.print(stars);
                stars = "";
            }
            System.out.println();

        }
    }
}

