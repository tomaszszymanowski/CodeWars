import java.util.ArrayList;
import java.util.List;

public class PipeFix {

    /*Task Given the a list of numbers,
    return the list so that the values increment by 1 for each index up to the maximum value.*/

    public static int[] pipeFix(int[] numbers) {

        List listOfInt = new ArrayList();
        listOfInt.add(numbers[0]);
        int counter = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            while (numbers[i] > counter) {
                counter++;
                listOfInt.add(counter);
            }
        }
        Integer[] arr = new Integer[listOfInt.size()];
        listOfInt.toArray(arr);

        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i].intValue();
        }
        return array;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 12};

        int[] newTab = pipeFix(numbers);
        for (int i : newTab) {
            System.out.print(i + ", ");
        }

    }

}
