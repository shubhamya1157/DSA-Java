class Solution {
    public int mySqrt(int x) {
        long sqrt = 0;
        for(long i = 1; i<=x;i++){
            if((long)i*i <= x) sqrt =i;
            else break;
        }
        return (int)sqrt;
    }
}