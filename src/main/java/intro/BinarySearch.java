package intro;

/**
 *  todo not work yet
 */
public class BinarySearch {


    /**
     * @param a
     * @param b
     * @return index of num, return -1 when not found
     */
    public static int find(int[] a, int b) {

        int l = 0;
        int r = a.length;
        int mid = (r + l) / 2;
        while (l < r) {
            if (a[mid] == b) {
                return mid;
            } else if (a[mid] > b) {
                r = mid ;
                mid = (r + l) / 2;
            } else if (a[mid] < b) {
                l = mid + 1;
                mid = (r + l) / 2;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 19, 19, 19, 20, 22, 25, 32, 51};
        System.out.println(find(a, 18));
    }
}
