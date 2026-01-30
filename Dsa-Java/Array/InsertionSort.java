//Arranging element in increasing order using InsertionSort
//Idea behind InsertionSort is- divide array in two part sort and unsort
// and access unsort element one by one and set order in sorted

public class InsertionSort{
    public static void insertionSort(int[]arr){

            for(int i = 1; i < arr.length; i++){
            int j = i;

            //Arranging element in incressing order
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args){

        //Creating array
        int[] nums = {5,3,2,0,9,-1};
        
        //Calling function-
       insertionSort(nums);
       
        //Printing element of array
        for(int k = 0; k< nums.length;k++){
            System.out.print(nums[k]+ " ");
        }
    }
}
