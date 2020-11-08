public class Holiday {

    public static int dutyFree(int normPrice, int discount, int hol) {
        float savings = (normPrice * (float) discount) / 100;

        int result = (int) (hol / savings);
        System.out.println(savings);

        return result;
    }

    public static void main(String[] args) {

        System.out.println(dutyFree(17,10,500));
    }
}

/*
* best solution
    public static int dutyFree(int normPrice, int discount, int hol) {

    return (int)(hol / (normPrice / 100.0f * discount));
  }
*
*
* */