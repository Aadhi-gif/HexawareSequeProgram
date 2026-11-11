import java.util.Scanner;

class Assignment1 {

    static int linearSearch(int[] a, int val) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == val) {
                return i;
            }
        }

        return -1;
    }
    static int binarySearch(int[]a,int val)
    {
        int min=0;
        int max=a.length-1;
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(a[mid]==val)
            {
                return mid;
            }
            else if(val<a[mid])
            {
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return -1;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int val = 29;
        int result2=binarySearch(a,val);
        int result1 = linearSearch(a, val);


        if (result1 != -1) {
            System.out.println("Found at index " + result1);
        } else {
            System.out.println("Not Found");
        }

        if(result2!=-1)
        {
            System.out.println("Found element at index "+result2);
        }
        else{
            System.out.println("Not Found");
        }
        sc.close();
    }
}