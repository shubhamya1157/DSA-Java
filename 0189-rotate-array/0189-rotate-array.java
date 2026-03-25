class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
       int i = 0,j = nums.length-k-1;
      
       while(i < j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
       } 
       i = nums.length-k;
       j = nums.length-1;
       while(i < j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
       }
       i = 0;j = nums.length-1;
       while(i < j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
       }
    }
}