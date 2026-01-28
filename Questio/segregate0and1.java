// User function Template for Java
//GfG question practies

class Solution {
    void segregate0and1(int[] arr) {
      int i = 0;
      int j = arr.length - 1;
      while(i < j){
          if(arr[i] == 0) i++;
          else if(arr[j] == 1) j--;
          else{
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;
          }
      }
        
    }
}
