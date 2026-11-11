import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("How many number do you need as input");
        int a=sc.nextInt();
        System.out.println(a);
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print("The array elements are:"+arr[i]);
        }
    }
}