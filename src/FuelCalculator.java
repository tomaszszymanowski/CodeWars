public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLitre) {
        double salePrice = 0;
        double total =0;

        if(litres >= 2 && litres < 4){
            salePrice = pricePerLitre - 0.05;
            total = salePrice * litres;
        }

        if(litres >= 4 && litres < 6){
            salePrice = pricePerLitre - 0.10;
            total = salePrice * litres;
        }

        else if(litres >= 6 && litres < 8){
            salePrice = pricePerLitre - 0.15;
            total = salePrice * litres;
        }

        else if(litres >= 8 && litres < 10){
            salePrice = pricePerLitre - 0.20;
            total = salePrice * litres;
        }

        else if(litres >= 10 && litres < 12){
            salePrice = pricePerLitre - 0.25;
            total = salePrice * litres;
        }

        else if(litres >= 12){
            salePrice = pricePerLitre - 0.25;
            total = salePrice * litres;
        }

        double totalRoundOff = Math.round(total * 100.0) / 100.0;
        return totalRoundOff;
    }


    public static void main(String[] args) {
        System.out.println(fuelPrice(2,9.97));
    }
}
