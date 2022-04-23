package JAVA.Code;

public class Game {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();


        player1.name = "yw";
        player2.name = "mj";

        player1.movePlayer();
        player2.movePlayer();
    }
}
