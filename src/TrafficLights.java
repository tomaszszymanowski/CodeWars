public class TrafficLights {

    public static String updateLight(String current) {
        String nextLight = "";
        if (current.contains("green")) {
            nextLight = "yellow";
        }else if(current.contains("yellow")){
            nextLight = "red";
        }else if(current.contains("red")){
            nextLight = "green";
        }
        return nextLight;
    }





    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }
}