class Solution {
    public void mergeArrays(int a[], int b[]) {   
        // code here
        int n=a.length;
        int m=b.length;
        /*int i=n-1;
        int j=0;
        while(i>=0&&j<m)
        {
            if(a[i]>b[j])
            {
                int t=a[i];
                a[i]=b[j];
                b[j]=t;
                i--;
                j++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        */
        int ans[]=new int[n+m];
        int index=0;
        int i=0;int j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                ans[index++]=a[i++];
            }
            else
            {
                ans[index++]=b[j++];
            }
        }
        while(i<n)
        {
            ans[index++]=a[i++];
        }
        while(j<m)
        {
            ans[index++]=b[j++];
        }
        int k;
        for(k=0;k<n+m;k++)
        {
            if(k<n)
            {
                a[k]=ans[k];
            }
            else
            {
                b[k-n]=ans[k];
            }
        }
    }
}
