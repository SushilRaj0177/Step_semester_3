import java.util.Scanner;
/*I initially wanted to settle with Math.random() for generation of random decimals but i realized it doesn't model true randomness, so i searched how to model true or cryptographic randomness that can't be predicted even if the algorithm is revealed. the answer seems to be using SecureRandom which derives it's seed from the entropy pool of the os. I wondered why the os would collect randomness off real world events, looks like that data is used to establish a cryptographically unpredictable state, which is used by security-sensitive parts of the system (like https which requires random values during handshakes)*/
import java.security.SecureRandom;

public class RockPaperScissors{
    static String playRound(String playerMove, String computerMove){
        if (playerMove.equalsIgnoreCase(computerMove)){
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock")&&computerMove.equalsIgnoreCase("Scissors"))||(playerMove.equalsIgnoreCase("Scissors")&&computerMove.equalsIgnoreCase("Paper"))||(playerMove.equalsIgnoreCase("Paper")&&computerMove.equalsIgnoreCase("Rock"))){
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        
        String[] moves = {"Rock", "Paper", "Scissors"};
        System.out.print("Enter the number of rounds:\t");
        int n = sc.nextInt();
        sc.nextLine();

        String[] playerMove = new String[n];
        String[] computerMove = new String[n];
        String[] result = new String[n];

        int wins=0, draws=0, losses=0;

        for(int i = 0; i < n; i++){
            System.out.print("\nEnter your move:\t");
            playerMove[i] = sc.nextLine();

            int rindex = random.nextInt(3);
            computerMove[i] = moves[rindex];

            result[i] = playRound(playerMove[i], computerMove[i]);

            System.out.print("\nThe computer played " + computerMove[i] + ", " + result[i] + ".");

            if (result[i].equalsIgnoreCase("Player Wins")){
                wins++;
            }
            else if (result[i].equalsIgnoreCase("Draw")){
                draws++;
            }
            else {
                losses++;
            }
        }

        double winPercentage = (((double)wins/n)*100);

        System.out.print("\nwins: " + wins + "|\tlosses: " + losses + "|\tdraws: " + draws + "|\twin percentage: " + winPercentage);
        sc.close();
    }
}