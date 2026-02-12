// Arrange element in incressing order using QuickSort

public class QuickSort{
  //Function for getting pivot index 
  private static int pivotIndex(int[] arr,int start,int end){
  int pivot = arr[end];//Last element is my pivot element
  int i = start;
  for(int j = start ; j < end ;j++){
    //Swapping element
    if(arr[j] < pivot){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
    }
    //Swapping pivot element
    }
    int temp = arr[i];
    arr[i] = arr[end];
    arr[end] = temp;
      //Return pivot index
      return i;
  }
  private static void quicksort(int[] arr,int start,int end){
    if(start < end){
        int pivot_index = pivotIndex(arr,start,end);//Calling function for getting pivot index
        quicksort(arr,start,pivot_index-1);//Arrange left side element form pivot element
        quicksort(arr,pivot_index+1,end);//Arrange right side element from pivot element
    }
  } 
  public static void main(String[] args){
    int[] arr = {5,9,8,1,0,4,7};//Creating array 
    quicksort(arr,0,arr.length-1);//Calling function for arranging element in incressing order
    //Printing element after sorting  by for each loop
    System.out.println("Sorted array:");
    for(int num : arr){
        System.out.print(num +" ");
    }
  }
}
