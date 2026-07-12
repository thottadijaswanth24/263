package arrays;

import java.util.Scanner;

public class max_subarray_sum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        /*
        for(i=0;i<n;i++)
        {
            int sum=0;
            for(j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        */
        //method 2
        int sum=0;
        int s_i=0;
        int d_i=0;
        int start=0;
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
            else
            {
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}
