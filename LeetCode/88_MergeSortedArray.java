/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored 
inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first 
m elements denote the elements that should be merged, and the last n elements are set to 0 
and should be ignored. nums2 has a length of n.
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Not a merge Sort
        int[] sorted=new int[n+m];
        int j=0,k=0;
        for(int i=0;i<n+m;i++){
            if( k<n && j<m){
            if(nums1[j]<=nums2[k]){
                sorted[i]=nums1[j];
                j++;
            }
            
            else{
                sorted[i]=nums2[k];
                k++;
            }
            }
            else{
            if(k!=n && j==m){
                sorted[i]=nums2[k];
                k++;
            }
            else if(j!=m && k==n){
                sorted[i]=nums1[j];
                j++;
            }
            }
        }
        for(int i=0;i<m+n;i++)
            nums1[i]=sorted[i];
    }
}
