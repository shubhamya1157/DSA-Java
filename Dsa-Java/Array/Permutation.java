//Printing ways of puting n queen on n*n chess board-
import java.util.*;
public class Permutation{
// Checking puting queen is safe or not-
public static boolean isSafe(char chessBoard[][],int row,int col){

//Checking for- vertical up

for(int i = row-1;i >= 0;i--){
    if(chessBoard[i][col] == 'Q')
    return false;
}

//Checking for- upper right diagnoal

for(int i = row-1, j = col+1; i>= 0  &&  j<chessBoard.length; i--,j++){
    if(chessBoard[i][j] == 'Q')
    return false;
}

//Check for- upper left dignoal

for(int i = row-1, j = col-1; i>= 0  &&  j>=0; i--,j--){
    if(chessBoard[i][j] == 'Q')
    return false;
}
//If no condition was true
return true;


}

 public static void nQueen(char chessBoard[][],int row){
//Base Condition-stopping recursion

if(row == chessBoard.length){
//Calling printing chess board function
printChessBoard(chessBoard);
System.out.print("\n");
return;
}

//Puting queen 

for(int k = 0;k < chessBoard.length;k++){
    if(isSafe(chessBoard, row ,k)){
    chessBoard[row][k] = 'Q';
    nQueen(chessBoard,row+1);
    chessBoard[row][k] = '*';}
}
    }
//For printing
public static void printChessBoard(char chessBoard[][]){
    for(int j = 0; j<chessBoard.length;j++){
        for(int k = 0 ; k < chessBoard.length;k++){
            System.out.print(chessBoard[j][k]+" ");
        }
        System.out.print("\n");
    }
}

//Main function
public static void main(String arg[]){

Scanner sc = new Scanner(System.in);

System.out.print("Give me the length of chess board:");
int n = sc.nextInt();
char chessBoard[][] = new char[n][n]; 
for(int i = 0; i < chessBoard.length ;i++){
    for(int j = 0; j < chessBoard.length ; j++){
    chessBoard[i][j] = '*';
     }
   }
   nQueen(chessBoard,0);
   sc.close();
   }
} 