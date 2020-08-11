import java.util.Arrays;

public class MergeIntegers {
    private MergeIntegers() {
    }

    public static void sort(Double[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, q, r);
            merge(a, p, q, r);
        }
    }

    private static void merge(Double[] a, int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q - 1;
        Double[] L = Arrays.copyOfRange(a, 0, n1);
        Double[] R = Arrays.copyOfRange(a, 0, n2);
        if (n1 >= 0) System.arraycopy(a, p - 1, L, 0, n1);
        if (n2 >= 0) System.arraycopy(a, q, R, 0, n2);
        L[n1] = Double.POSITIVE_INFINITY;
        R[n2] = Double.POSITIVE_INFINITY;
        int i = 0;
        int j = 0;
        for (int k = p - 1; k < r; k++) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
        }
    }

}
