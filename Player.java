package Practice4;
import java.util.Random;

public class Player {
    int sumPoints;
    private Random dice = new Random();

    public Player(int points){
        sumPoints = points;
    }

    public int getSumPoints(){
        return sumPoints;
    }

    // Method for simulating dice throw and keep track of score
    public int diceThrow(int points){
        int newPoints;

        int n = dice.nextInt(6);
        n += 1;

        if(n == 1){
            newPoints = 0;
        }else if (points > 100){
            newPoints = points - n;
        }else {
            newPoints = points + n;
        }
        return newPoints;
    }

    // Sets condition for winning game
    public boolean winner(int points){
        return sumPoints == 100;
    }
}
