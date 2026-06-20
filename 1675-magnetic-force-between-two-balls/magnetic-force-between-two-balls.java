class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int l=1,h=position[n-1]-position[0];
        int res=0;
        while(l<=h){
            int mid=(l+h)/2;
            int c=1;
            int lp=position[0];
            for(int i=1;i<n;i++){
                if(position[i]-lp>=mid){
                    c++;
                    lp=position[i];
                }
                if(c==m){
                    break;
                }
            }
            if(c>=m){
                res=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}