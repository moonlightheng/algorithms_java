package intro.sort;


// todo not work yet
public class MergeSort {


    public static void mergeSort(int[] a, int start, int end) {

        if (end - start >= 2) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, end);
        } else {
            if (end - start == 1) {
                if (a[start] > a[end]) {
                    int t = a[start];
                    a[start] = a[end];
                    a[end] = t;
                }
            }
        }

    }


    private static void merge(int[] a, int start, int end) {
        int i = 0;
        int ai = start;
        int mid = (end - start) / 2;
        int bi = mid + 1;
        int[] t = new int[end - start + 1];
        while (i < end - start + 1) {
            if (ai > mid) {
                t[i] = a[bi++];
            } else if (bi > end) {
                t[i] = a[ai++];
            } else if (a[ai] < a[bi]) {
                t[i] = a[ai++];
            } else  {
                t[i] = a[bi++];
            }
            i++;
        }
        for (int j = start; j < end + 1; j++) {
            a[j] = t[j - start];
        }

    }


    public static void main(String[] args) {

        int[] a = new int[]{9, 8, 7, 6, 1, 5, 4, 3, 2, 1, 0, 10, 11, 7, 16, 78, 12, 14, 32, 23, 24};
        mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
