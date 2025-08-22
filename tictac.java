import java.util.Scanner;

public class tictac {
    public  void game(){
        char[][] board=new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=' ';
            }
        }

        Scanner sc=new Scanner(System.in);
        boolean won=false;
        char player='X';
        while(!won){
            printboard(board);
            System.out.println("Player "+player+ " enter: ");
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(board[r][c]==' '){
                board[r][c]=player;
                if(haveWon(board,player)){
                    System.out.println("Player "+player+ " has won");
                    break;
                }
                else{
                    player=(player=='X')?'O':'X';
                }
            }
            else{
                System.out.println("Invalid choice");
            }
            
        }
        printboard(board);

    }

    public boolean haveWon(char[][] board,char player){
        for(int i=0;i<board.length;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
                return true;
            }
        }

        for(int i=0;i<board.length;i++){
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }

        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }

        return false;
    }

    public void printboard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        tictac obj=new tictac();
        obj.game();
    }
}
