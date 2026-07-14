package sorting;
import java.util.*;    
public class merge_sort {
    void merge(int lb,int mid,int ub,int a[])
    {
        int n=a.length;
        int b[]=new int[n];
        int i=lb;
        int j=mid+1;
        int k=lb;
        while(i<=mid&&j<=ub)
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                i++;
            }
            else
            {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=ub)
        {
            b[k]=a[j];
            j++;
            k++;
        }
        for(k=lb;k<=ub;k++)
        {
            a[k]=b[k];
        }
    }
    void mergesort(int lb,int ub,int arr[])
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            mergesort(lb,mid,arr);
            mergesort(mid+1,ub,arr);
            merge(lb,mid,ub,arr);
        }
    }
    public static void main(String[] args) {
        merge_sort obj=new merge_sort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int lb=0;
        int ub=n-1;
        obj.mergesort(lb,ub,arr);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
