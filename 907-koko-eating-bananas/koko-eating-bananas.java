class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1000000000;
        while(l<=r){
            int m=l+(r-l)/2;
            if(isOk(piles,m,h)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
    boolean isOk(int piles[],int k,int h){
        int th=0;
        for(int n:piles){
            th+=Math.ceil((double)n/k);
        }
        return th<=h;
    }
}