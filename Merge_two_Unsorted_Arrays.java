package arrays;
class Solution {
    void merge(int a[],int lb,int mid,int ub)
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
    void mergesort(int a[],int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    public int[] sortedMerge(int[] a, int[] b) {
        // code here
        mergesort(a,0,a.length-1);
        mergesort(b,0,b.length-1);
        int n=a.length;
        int m=b.length;
        int i,j;
        i=0;
        j=0;
        int ans[]=new int[n+m];
        int index=0;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j])
            {
                ans[index]=a[i];
                i++;
            }
            else
            {
                ans[index]=b[j];
                j++;
            }
            index++;
        }
        while(i<n)
        {
            ans[index]=a[i];
            i++;
            index++;
        }
        while(j<m)
        {
            ans[index]=b[j];
            j++;
            index++;
        }
        return ans;
    }
}
//better for long test cases
/*
class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length;
        int m=b.length;
        int i,j;
        i=0;
        j=0;
        int ans[]=new int[n+m];
        int index=0;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j])
            {
                ans[index]=a[i];
                i++;
            }
            else
            {
                ans[index]=b[j];
                j++;
            }
            index++;
        }
        while(i<n)
        {
            ans[index]=a[i];
            i++;
            index++;
        }
        while(j<m)
        {
            ans[index]=b[j];
            j++;
            index++;
        }
        return ans;
    }
}
*/