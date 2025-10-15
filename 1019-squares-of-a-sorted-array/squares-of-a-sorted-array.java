class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int l=0,r=n-1,p=n-1;
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
            if(ls>rs){
                res[p]=ls;
                l++;
            }
            else{
                res[p]=rs;
                r--;
            }
            p--;
        }
        return res;
    }
}