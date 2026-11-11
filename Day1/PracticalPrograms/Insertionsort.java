import java.util.Scanner;

public class Insertionsort {

    static int[] insertionSort(int[] a) {

        int temp, j;

        for (int i = 1; i < a.length; i++) {

            temp = a[i];
            j = i;

            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        a = insertionSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}