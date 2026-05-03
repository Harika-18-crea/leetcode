class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int f=1,s=2,ways=0;
        for(int i=3;i<=n;i++){
            ways=f+s;
            f=s;
            s=ways;
        }
        return ways;
    }
}