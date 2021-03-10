public class DetectQuestion {
    public static boolean detect (String comment){
        // your code
        String matrx = "Can someone explain";
        char lastChar = '?';
        char firstChar = comment.charAt(0);
        boolean bigFirst = Character.isUpperCase(firstChar);

        String newStr = "";
        if(comment.length()> 19){
            newStr = comment.substring(0,19);
        }
        else return false;
        if(newStr.equals(matrx) &&  comment.charAt(comment.length()-1) == lastChar && bigFirst == true ){
            return true;
        }
        return false;
    }


    /*
    class Codewars {
    static boolean detect(final String comment){
        return comment.startsWith("Can someone explain");
    }
}
    * */


}
