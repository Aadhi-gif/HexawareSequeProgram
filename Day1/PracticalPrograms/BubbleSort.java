import java.util.Scanner;

public class BubbleSort {

    static int[] bubbleSort(int[] a) {

        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        a = bubbleSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}