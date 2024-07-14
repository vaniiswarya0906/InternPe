import java.util.*;
class Mains {
  public static void main(String[] args) {
    char player='X';
    int playerrowmove=0;
    int playercolmove=0;
    
    boolean validmove;
    int validmoves=0;
    tictactoe board1 = new tictactoe();
    char[][] newboard=board1.getboard();
    board1.displayboard(newboard);
    
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    
    
    while(validmoves!=9){
      System.out.println(player + " enter the column for your move (0-2):");
      playercolmove= sc1.nextInt();
      System.out.println(player + " enter the row for your move(0-2):");
      playerrowmove= sc2.nextInt();
      validmove=board1.validmove(playerrowmove, playercolmove, player);
      if(validmove==true){
        validmoves++;
        newboard=board1.getboard();
        board1.displayboard(newboard);
        
        if(board1.isWinner(newboard, player)){
          System.out.println(player + "WINS!");
          break;
        }
        else if(board1.iscat(newboard)){
          System.out.println("Its a tie");
          break;
        }
        else{
          player=board1.changeplayer(player);
          
        }
        
      }
      else{
        while(validmove!=true){
      System.out.println(player + " enter the column for your move (0-2):");
      playercolmove= sc1.nextInt();
      System.out.println(player + " enter the row for your move(0-2):");
      playerrowmove= sc2.nextInt();
      validmove=board1.validmove(playerrowmove, playercolmove, player);
        }
        validmoves++;
        newboard=board1.getboard();
        board1.displayboard(newboard);
        
        if(board1.isWinner(newboard, player)){
          System.out.println(player + "WINS!");
          break;
        }
        else if(board1.iscat(newboard)){
          System.out.println("Its a tie");
          break;
        }
        else{
          player=board1.changeplayer(player);
         
        }
        
      }
    }
}
}
