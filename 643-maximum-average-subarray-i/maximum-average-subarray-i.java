class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ws=0;
        for(int i=0;i<k;i++){
            ws+=nums[i];
        }
        int max=ws;
        for(int i=k;i<nums.length;i++){
            ws=ws-nums[i-k]+nums[i];
            max=Math.max(max,ws);
        }
        return (double) max/k;
    }
}