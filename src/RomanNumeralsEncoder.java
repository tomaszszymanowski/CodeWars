public class RomanNumeralsEncoder {


    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 999) {
            n -= 1000;
            sb.append("M");
        }

        if (n > 899 && n < 1000) {
            n -= 900;
            sb.append("CM");
        }

        if (n >= 500 && n < 900) {
            n -= 500;
            sb.append("D");
            while (n >= 100) {
                n -= 100;
                sb.append("C");
            }
        }

        if (n > 399 && n < 499) {
            n -= 400;
            sb.append("CD");
        }

        if (n >= 100 && n < 400) {
            while (n >= 100) {
                n -= 100;
                sb.append("C");
            }
        }

        if (n >= 90 && n < 100) {
            sb.append("XC");
            n -= 90;
        }

        if (n > 50 && n < 90) {
            sb.append("L");
            n -= 50;
            while (n >= 30) {
                n -= 10;
                sb.append("X");
            }
        }

        if (n >= 40 && n < 50) {
            n -= 40;
            sb.append("XL");
        }

        if (n >= 9 && n < 40) {
            while (n >= 10) {
                n -= 10;
                sb.append("X");
            }
        }

        if (n >= 9 && n < 10) {
            n -= 9;
            sb.append("IX");
        }
        if (n > 5 && n < 9) {
            n -= 5;
            sb.append("V");
            while (n >= 1) {
                n -= 1;
                sb.append("I");
            }
        }

        if (n == 5) {
            sb.append("V");
        }

        if (n == 4) {
            n -= 4;
            sb.append("IV");
        }
        if (n >= 1 && n < 5) {
            while (n >= 1) {
                n -= 1;
                sb.append("I");
            }
            n = 0;
        }

        return sb.toString();
    }



    /*
  String[][] c={
      {"","I","II","III","IV","V","VI","VII","VIII","IX"},
      {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
      {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
      {"","M","MM","MMM"}
  };

    public String solution(int num) {

      StringBuffer roman = new StringBuffer();
        roman.append(c[3][num / 1000 % 10]);
        roman.append(c[2][num / 100 % 10]);
        roman.append(c[1][num / 10 % 10]);
        roman.append(c[0][num % 10]);

        return roman.toString();
    }




   */


    public static void main(String[] args) {
        System.out.println(solution(1529));


    }
}
