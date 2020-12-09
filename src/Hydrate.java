public class Hydrate {
    // program liczy wypite drinki i sugeruje wypić tyle samo szklanek wody.
    public static String hydrate(String drinkString) {

        char[] array = drinkString.toCharArray();
        int glassOfWater = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number >= 48 && number <= 57) {
                glassOfWater += Integer.parseInt(String.valueOf(array[i]));
            }
        }
        if(glassOfWater > 1){
            return glassOfWater + " glasses of water";
        }
        return glassOfWater + " glass of water";
    }


    public static void main(String[] args) {

        System.out.println(hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));

    }
}

/* Code Wars Solution
* public class Drinkin {
    public String hydrate(String drinkString) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(drinkString);

        int waterGlasses = 0;

        while (matcher.find()){
            waterGlasses += Integer.valueOf(matcher.group());
        }
        return (waterGlasses > 1)? waterGlasses +" glasses of water" : waterGlasses +" glass of water";
    }
}
* */



