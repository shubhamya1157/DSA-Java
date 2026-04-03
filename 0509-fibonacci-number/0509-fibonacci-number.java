class Solution {
    static int[] dp ;
    public  int f(int n){
    if(n == 0 || n == 1) return n;
    if(dp[n] != 0) return dp[n];
    int ans = f(n-1) + f(n-2);
    dp[n] = ans;
      return ans;
    }

    public int fib(int n) {
        dp = new int[n+1];
        return f(n);
    }
}