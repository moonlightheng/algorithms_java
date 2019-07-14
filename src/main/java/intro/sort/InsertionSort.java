package intro.sort;

public class InsertionSort {


    public static void insertSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    int t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                } else {
                    break;
                }
            }
        }

    }


    public static void main(String[] args) {

        int[] a = new int[]{9, 8, 7, 6, 1, 5, 4, 3, 2, 1, 0};
        insertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
