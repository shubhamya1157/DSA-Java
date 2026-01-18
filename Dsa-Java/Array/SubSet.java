//Finfing SubSet of a String-

public class SubSet {
public static void printSubSet(String str,String ans ,int i){

    //Stop recursision when index reach the end of string

if(i == str.length()){

//For Empty Subset

    if(ans.length() == 0){
        System.out.print("null"); //printing empty subset as null
    }
    else{
    System.out.println(ans);//printing subset
    }

    return;
}

    //You Chose Yes(include this)
printSubSet( str, ans + str.charAt(i) , i+1);


    //You Chose No(don't include this)
    printSubSet( str, ans ,i+1);

    return;
}


public static void main(String args[]){
 
 String name = "hack";

 printSubSet(name ,"",0);


  }
}