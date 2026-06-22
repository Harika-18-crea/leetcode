class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<h){
            int m=(l+h)/2;
            if(nums[m]>nums[n-1]){
                l=m+1;
            }
            else{
                h=m;
            }
        }
        int r=l;
        l=0;h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            int t=(m+r)%n;
            if(nums[t]==target)
               return t;
            if(nums[t]<target)
               l=m+1;
            else
               h=m-1;
        }
        return -1;
    }
}