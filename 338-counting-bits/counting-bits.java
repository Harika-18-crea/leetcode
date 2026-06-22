class Solution {
    public int[] countBits(int n) {
        int[] c=new int[n+1];
        for(int i=1;i<=n;i++){
            c[i]=c[i>>1]+(i&1);
        }
        return c;
    }
}