public class choinka {
    /*

     *
     ***
     *****
     *******
     *********
     ***********

     */
    public static void main(String[] args) {

        int n = 11;
        int warstwy = (n / 2) + 1;
        int gwiadkiWRzedzie = 1;

        for (int i = 0; i < warstwy; i++) {

            for (int j = 0; j < gwiadkiWRzedzie; j++) {
                System.out.print("*");

            }
            System.out.println();
            gwiadkiWRzedzie += 2;
        }
        System.out.println("__________________________");

        int i = 0;
        int j = 0;
        gwiadkiWRzedzie = 1;
        while (i < warstwy) {

            while (j < gwiadkiWRzedzie) {
                System.out.print("*");

                j++;
            }
            j = 0;
            System.out.println();
            gwiadkiWRzedzie += 2;

            i++;
        }


    }
}

