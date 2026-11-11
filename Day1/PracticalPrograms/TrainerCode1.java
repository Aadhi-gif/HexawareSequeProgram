

import java.util.Scanner;

class TrainerCode1 {


    public static void main(String args[])
    {

        boolean flag=false;
        Scanner sc = new Scanner(System.in);

        int val=29;
        int a[]=new int[100];
        int i;
        System.out.println("Enter the size ");
        int n=sc.nextInt();

        for( i =0; i < n; i++)
            a[i] =sc.nextInt();






        for( i = 0; i < n; i++)
        {
            if(a[i]==val)
            {

                flag=true;
                break;
            }
        }


        if(flag==true)
        {

            System.out.println("Found");

        }
        else
        {
            System.out.println("Not Found");

        }

    }

}
