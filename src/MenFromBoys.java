// solution from codewars
public class MenFromBoys {

    public static int[] menFromBoys(final int[] values) {
        int[] result = removeDuplicates(values);
        int count = 0;
        for (int i : result) {
            if ((i & 1) == 1) {
                count++;
            }
        }
        int[] odd = new int[count];
        int[] even = new int[result.length - count];
        int oddN = 0;
        int evenN = 0;
        for (int i : result) {
            if ((i & 1) == 1) {
                odd[oddN] = i;
                oddN++;
            } else {
                even[evenN] = i;
                evenN++;
            }
        }
        odd = sortOdd(odd);
        even = sortEven(even);
        for (int i = 0; i < even.length; i++) {
            result[i] = even[i];
        }
        for (int i = 0; i < odd.length; i++) {
            result[i + even.length] = odd[i];
        }
        return result;
    }

    public static int[] sortOdd(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
        }
        return array;
    }

    public static int[] sortEven(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
        }
        return array;
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (array[j] != array[i]) {
                    if (m != j) array[m] = array[j];
                    m++;
                }
            }
        }

        if (n != array.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = array[i];
            array = b;
        }
        return array;
    }
}
