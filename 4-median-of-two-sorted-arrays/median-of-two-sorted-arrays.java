class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n=nums2.length;
        int l=0,h=m;
        while(l<=h){
            int i=(l+h)/2;
            int j=(m+n+1)/2-i;
            int l1=(i>0)?nums1[i-1]:Integer.MIN_VALUE;
            int r1=(i<m)?nums1[i]:Integer.MAX_VALUE;
            int l2=(j>0)?nums2[j-1]:Integer.MIN_VALUE;
            int r2=(j<n)?nums2[j]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if((m + n) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
            }
            else if(l1>r2){
                h=i-1;
            }
            else{
                l=i+1;
            }
        }
        return l;
    }
}