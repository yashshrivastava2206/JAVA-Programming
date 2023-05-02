class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int size=(len1+len2);
        int[] newArray= new int[size];
        int i=0;
        while(i!=len1){
            newArray[i]=nums1[i];
            i++;
        }
        int j=0;
        while(i!=size){
            newArray[i]=nums2[j];
            i++;j++;
        }
        Arrays.sort(newArray);
        if(size%2==0){
            // System.out.println("Hello");
            int mid1=size/2;
            int mid2=mid1-1;
        return (double)(newArray[mid1]+newArray[mid2])/2;
        }
        else
        return (double)newArray[size/2];
    }
}
