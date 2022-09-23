package Practice4;

public class Game {

    public static void main(String[] args){

        // Creates 2 players
        Player[] player = new Player[2];
        player[0] = new Player(0);
        player[1] = new Player(0);

        int round = 0;

        // While neither player has satisfied repeat program and add 1 to round
        while (!player[0].winner(player[0].sumPoints) && !player[1].winner(player[1].sumPoints)){

            player[0].sumPoints = player[0].diceThrow(player[0].sumPoints);
            player[1].sumPoints = player[1].diceThrow(player[1].sumPoints);
            round += 1;
            System.out.println("Round: " + round + ". Player 1 " + player[0].sumPoints + ". Player 2 " + player[1].sumPoints);
        }
        // Decides which player has won
        if(player[0].winner(player[0].sumPoints) && player[1].winner(player[1].sumPoints)){
            System.out.println("Tie!");
        }else if (player[0].winner(player[0].sumPoints)){
            System.out.println("Player 1 won the game!");
        }else {
            System.out.println("Player 2 won the game!");
        }
    }
}
