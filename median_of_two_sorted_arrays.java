package binary_search;
public class median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i,j;
        i=0;
        j=0;
        int ans[]=new int[n+m];
        int index=0;
        while(i<n&&j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[index]=nums1[i];
                i++;
            }
            else if(nums1[i]>=nums2[j])
            {
                ans[index]=nums2[j];
                j++;
            }
            else
            {
                ans[index]=nums1[i];
                i++;
                j++;
            }
            index++;
        }
        while(i<n)
        {
            ans[index]=nums1[i];
            i++;
            index++;
        }
        while(j<m)
        {
            ans[index]=nums2[j];
            j++;
            index++;
        }
        for(i=0;i<n+m;i++)
        {
            System.out.print(ans[i]+" ");
        }
        double temp=0;
        int mid=(n+m)/2;
        if((n+m)%2!=0)
        {
            temp=ans[mid];
        }
        else
        {
            temp=(double)(ans[mid]+ans[mid-1])/2;
        }
        return temp;
    }
    //better
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i, j;
        i = 0;
        j = 0;
        double temp = 0;
        int el1 = 0;
        int el2 = 0;
        int index = 0;
        int temp1 = 0;
        int temp2 = 0;
        int mid = (n + m) / 2;
        if ((n + m) % 2 != 0) {
            el2=mid;
        } else {
            el1 =mid-1;
            el2 = mid;
        }
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                if (index == el1) {
                    temp1 = nums1[i];
                }
                if (index == el2) {
                    temp2 = nums1[i];
                }
                i++;
                index++;
            } else {
                if (index == el1) {
                    temp1 = nums2[j];
                }
                if (index == el2) {
                    temp2 = nums2[j];
                }
                j++;
                index++;
            }

        }
        while (i < n) {
            if (index == el1) {
                temp1 = nums1[i];
            }
            if (index == el2) {
                temp2 = nums1[i];
            }
            i++;
            index++;
        }
        while (j < m) {

            if (index == el1) {
                temp1 = nums2[j];
            }
            if (index == el2) {
                temp2 = nums2[j];
            }
            j++;
            index++;
        }
        if ((n + m) % 2 != 0) {
            return temp2;
        }
        return (double) (temp1 + temp2) / 2;
    }
}
}
