package intro;

/**
 * f(0) = 0
 * f(1) = 1
 * f(2) = 1
 * f(n) = f(n-1) + f(n-2)
 */
public class Fibonacci {


    public static int recursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return recursive(n - 1) + recursive(n - 2);
    }


    public static int extraArray(int n) {
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }

    public static int tuple(int n) {
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i < n; i++) {
            f1 = f2;
            f2 = f1 + f2;
        }
        return f2;
    }

    // todo Matrix

    public static void main(String[] args) {
        System.out.println(recursive(6));
        System.out.println(extraArray(6));
        System.out.println(tuple(6));
    }
}
