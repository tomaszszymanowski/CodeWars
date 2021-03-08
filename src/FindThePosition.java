
public class FindThePosition {


    public static String position(char alphabet){

        int c = (int) alphabet - 96;
        return "Position of alphabet: "+  c ;
    }

    /*
    public static String position(char alphabet){
       return "Position of alphabet: " + ((int) alphabet - 96);
    }
    * */


    public static void main(String[] args) {

        System.out.println(position('z'));

    }
}
