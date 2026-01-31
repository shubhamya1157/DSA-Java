class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        for(int i = 1; i< arr.length-1;i++){
            if(arr[i-1] <= arr[i] && arr[i] >= arr[i+1]){
                index = i;
            }
        }
        return index;
    }


}