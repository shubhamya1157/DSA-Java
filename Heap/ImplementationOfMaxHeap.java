public class ImplementationOfMaxHeap{
    static int[] maxHeap = new int[100];
    static int i = 0;

    static void add(int val){
    maxHeap[++i] = val;
    int j = i;

    while(j > 1 && maxHeap[j/2] < maxHeap[j]){
        int temp = maxHeap[j];
        maxHeap[j] = maxHeap[j/2];
        maxHeap[j/2] = temp;
        j = j/2;
    }

    }

    static void remove(){
        if(i == 0){
            System.out.print("Not possible");
            return;
        }
        maxHeap[1] = maxHeap[i];
        i--;

        int current = 1;

        while(true){

        int left = 2*current;
        int right = 2*current+1;
        int maximum = current;

        if( left <= i && (maxHeap[left] > maxHeap[maximum])){
            maximum = left;
        }

        if(right <= i && (maxHeap[right] > maxHeap[maximum])){
            maximum = right;
        }

        if(maximum == current) break;

        int temp = maxHeap[current];
        maxHeap[current] = maxHeap[maximum];
        maxHeap[maximum] = temp;

        current = maximum;

        }

    }

    static void peek(){
        if(i > 1){
            System.out.print("top value is:" + maxHeap[1]);
        }
    }

    public static void main(String[] args){


    }
}
