//Arranging element in increasing order using Selection Sort
//Idea behind Selection Sort is first find minimum element and swap to first index

public class SelectionSort{

public static void sortArray(int[] arr){

for(int i = 0; i< arr.length -1 ; i++){

    int min = arr[i];
    int index = i;
     
      //Finding minimum number
      for(int j = i+1; j < arr.length;j++){
          if(arr[j] < min){
               min = arr[j];
               index = j;
    
           }
        }
        //swapping number
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
//printing array

}

public static void main(String[] args){

//Creating array
int[] nums = {7,-1,0,-2,8,3};

//Calling function
 sortArray(nums);

//Printing array
for(int k = 0 ; k < nums.length ; k++){
    System.out.print(nums[k] + " ");
    }

  }
}
