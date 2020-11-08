public class Plural {

    public static boolean isPlural(float f){

        boolean result = false;
        if(f % 2 ==0 ) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        * best practice

   public static boolean isPlural(float f){
   return (f != 1 );
  }
        * */

        System.out.println(isPlural((float) 100));
    }


}
