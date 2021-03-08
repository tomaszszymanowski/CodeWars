public class FindMinAndMax {

    public int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i] < min){
                min = list[i];
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i] < max){
                max = list[i];
            }
        }
        return max;
    }
/*

    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length-1];
    }
*/


}
