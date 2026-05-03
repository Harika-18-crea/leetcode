class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean[] primes=new boolean[n];
        Arrays.fill(primes,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(primes[i]){
                for(int j=i*i;j<n;j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primes[i]){
                c++;
            }
        }
        return c;
    }
}