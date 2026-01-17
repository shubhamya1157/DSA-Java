//Bubble Sort:
//Arranging element in incressing element-
import java.util.*;
public class BubbleSort{

    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j]>arr[j+1]){
                    //Swaping number if the previous number is bigger-
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

// Taking length of array from user-

System.out.print("Give me the length of array:");
 int size = sc.nextInt();
int num[ ] = new int[size];

//Taking element of array from user-

System.out.println("Give me the numbers of array:");
for(int k = 0;k < size; k++){
num[k] = sc.nextInt();
}

//Calling function-

bubbleSort(num);

//Printing Result-
System.out.print("Your array in increasing order is:");
for(int l = 0;l < size; l++){
System.out.print(num[l] + " ");
}

sc.close();

  }

}