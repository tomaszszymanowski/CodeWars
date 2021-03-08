import java.util.Arrays;

public class ArrayElement {


    public static int solve (int[] brr) {
        int[] arr = brr;

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j ++ ) {
                if (arr[i] == -arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }


        int element = 0;
        for(int num: arr) {
            if (num != 0) {
                element = num;
            }
        }
        return element;
    }
}
