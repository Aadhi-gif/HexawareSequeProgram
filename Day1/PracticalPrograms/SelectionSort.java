import java.util.Scanner;

public class SelectionSort {
    static int[] selectionsort(int[]a)
    {
        int min,pos,temp;
        for(int i=0;i<a.length-1;i++)
        {
            min=a[i];
            pos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    pos=j;
                }

            }
            if(pos!=i)
            {
                temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
            }

        }
        return a;
    }
    public static void main(String[]args)
    {
            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        a=selectionsort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
