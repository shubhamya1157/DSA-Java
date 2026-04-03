// Implemantation of minheap
public class HeapImplementation{
       static int i = 0;
       static int[] heap = new int[100];

    static void add(int val){

        if(i == heap.length -1 ){
            System.out.print("your heap is full");
            return;
        }

        if(i == 0){
        heap[++i] = val;
        return;
        }

        heap[++i] = val;
        int j = i;
        while( j > 1 && (heap[j] < heap[j/2])){
            int temp = heap[j];
            heap[j] = heap[j/2];
            heap[j/2] = temp;
            j = j/2;

        }

    }

    static void remove(){

        if(i < 1){
            System.out.print("not possible");
            return;
        }

        heap[1] = heap[i];
        i--;
        int k = 1;

        while(true){
            
            int left = 2*k;
            int right = 2*k+1;
            int smallest = k;

            if(left <= i && (heap[left] < heap[smallest])){
                smallest = left;
            }

            if(right <= i && (heap[right] < heap[smallest])){
                smallest = right;
            }

            if(smallest == k)break;

            int temp = heap[k];
            heap[k] = heap[smallest];
            heap[smallest] = temp;

            k = smallest; 
        }


    }

    static void peek(){
        if(i > 0){
            System.out.print("top value is: " + heap[1] + "\n");
        }
    }

    static void isfull(){
        if(i == heap.length-1){
            System.out.print("Your heap is full");
            return;
        }
        System.out.print("your heap is not full");
    }


    public static void main(String[] args){
     

    }

}
