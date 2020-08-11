import java.util.Arrays;

public class InsertionIntegers {
    private InsertionIntegers() {
    }

    public static void sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            // insert a[j] into sorted sequence a[1...j-1]
            int i = j - 1;
            while (i > 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 2, 5, 2, 5, 100, 5};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
