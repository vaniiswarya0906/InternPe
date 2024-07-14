class tictactoe{
  char[][] gameboard;
  int playerrowpos;
  int playercolpos;
  char player;
  
  public tictactoe(){
    this.gameboard=new char[][]{{' ',' ',' '},{' ' , ' ' , ' '},{' ' , ' ', ' '} };
    this.playerrowpos=0;
    this.playercolpos=0;
    this.player='X';
    
  }
  public char[][] getboard(){
    return this.gameboard;
  }
  public char changeplayer(char player1){
    char newplayer=' ';
    if(player1=='X'){
      newplayer='O';
    }
    if(player1=='O'){
      newplayer='X';
    }
    return newplayer;
  }
  public void displayboard(char[][] gameboard1){
        
           System.out.println(gameboard1[0][0] + "|" + gameboard1[0][1] + "|" + gameboard1[0][2]);
           System.out.println("--------");
           System.out.println(gameboard1[1][0] + "|" + gameboard1[1][1] + "|" + gameboard1[1][2]);
           System.out.println("--------");
           System.out.println(gameboard1[2][0] + "|" + gameboard1[2][1] + "|" + gameboard1[2][2]);
}
  public boolean validmove(int rowplayer, int colplayer,char player1){
     
     if(rowplayer<0 || rowplayer>=this.gameboard.length || colplayer<0 || colplayer>=this.gameboard[0].length || this.gameboard[rowplayer][colplayer]=='X' || this.gameboard[rowplayer][colplayer]=='O'){
       System.out.println("Invalid move, enter a new move");
       return false;
       
     }
    else{
      this.playerrowpos=rowplayer;
      this.playercolpos=colplayer;
      this.player=player1;
      this.gameboard[this.playerrowpos][this.playercolpos]= this.player;
      
      return true;
    }
    }
          
    public boolean isWinner(char[][] gameboard1,char player1){
    this.gameboard=gameboard1;
    this.player=player1;
    if(this.gameboard[0][0]==player && this.gameboard[0][1]==player && this.gameboard[0][2]==player || this.gameboard[1][0]==player && this.gameboard[1][1]==player && this.gameboard[1][2]==player || this.gameboard[2][0]==player && this.gameboard[2][1]==player && this.gameboard[2][2]==player || this.gameboard[0][0]==player && this.gameboard[1][1]==player && this.gameboard[2][2]==player || this.gameboard[0][2]==player && this.gameboard[1][1]==player &&this.gameboard[2][0]==player || this.gameboard[0][0]==player && this.gameboard[1][0]==player &&this.gameboard[2][0]==player ||this.gameboard[0][1]==player && this.gameboard[1][1]==player &&this.gameboard[2][1]==player || this.gameboard[0][2]==player && this.gameboard[1][2]==player &&this.gameboard[2][2]==player){
     
      return true;
    }
    else{
      
      return false;
    }
  }
  public boolean iscat(char[][] gameboard1){
    this.gameboard=gameboard1;
    boolean boardfull=true;
    for (int i = 0; i <this.gameboard.length; i++) {
          for(int j=0;j<this.gameboard[0].length;j++){
            if(this.gameboard[i][j]==' '){
              boardfull=false;
            }
            
          }
  }
    return boardfull;
}
}

