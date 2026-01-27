public class ReverseOfArray{
    public static void main(String[] args){
        int[] arr = {-1,1,3,8,0,5,9};
      
        int i = 0,j = arr.length - 1;
        while(i < j){
          int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
