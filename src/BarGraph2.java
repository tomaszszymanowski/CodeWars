import java.util.Scanner;

public class BarGraph2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String wykres = "";
        wykres += "WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY\r\n";

        int liczbaSklepow = 3;
        for(int numerSklepu = 1 ; numerSklepu <= liczbaSklepow ; numerSklepu++)
        {
            System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr " + numerSklepu + ": ");
            int sprzedaz = scanner.nextInt();
            int iloscGwiazdek = sprzedaz / 100;

            wykres += "Sklep nr " + numerSklepu + ": ";

            for(int i=0 ; i<iloscGwiazdek ; i++)
                wykres += "*";

            wykres += "\r\n";
        }

        System.out.println(wykres);
    }
}
