import java.util.Scanner;

public class RockPaperScissors {
    static void main() {


        Scanner in = new Scanner(System.in);
        boolean done = false;
        String playerA = "";
        String playerB = "";
        String playAgain = "";

        do {
            done = false;

            do {
                IO.println("Player A, Enter your move [R, P, S]: ");
            playerA = in.nextLine();

            if (playerA.equalsIgnoreCase("R") ||
                    playerA.equalsIgnoreCase("P") ||
                    playerA.equalsIgnoreCase("S")) {


                done = true;
            }

        } while (!done);

        done = false;

        do {
            IO.println("Player B, Enter your move [R, P, S]: ");
            playerB = in.nextLine();

            if (playerB.equalsIgnoreCase("R") ||
                    playerB.equalsIgnoreCase("P") ||
                    playerB.equalsIgnoreCase("S")) {

                done = true;
            }


        } while (!done);

        if (playerA.equalsIgnoreCase(playerB)) {
            IO.println("It's a tie!");
        } else if (playerA.equalsIgnoreCase("R") &&
                playerB.equalsIgnoreCase("P"))
            IO.println("Paper cover Rock!");
          else if (playerA.equalsIgnoreCase("S") &&
                playerB.equalsIgnoreCase("P"))
            IO.println("Scissor cuts Paper!");

          else if (playerA.equalsIgnoreCase("R") &&
                playerB.equalsIgnoreCase("S")) {
            IO.println("Rock breaks Scissors!");

        }  else if (playerA.equalsIgnoreCase("P") &&
                    playerB.equalsIgnoreCase("R")) {
            IO.println("Paper covers Rock!");


        }   else if (playerA.equalsIgnoreCase("P") &&
                    playerB.equalsIgnoreCase("S")) {
            IO.println("Scissors cuts Paper!");

        }    else if (playerA.equalsIgnoreCase("S") &&
                    playerB.equalsIgnoreCase("R")) {
              IO.println("Rock breaks Scissors!");




        }

          IO.println("Do you want to play again [Y or N: ]");
          playAgain = in.nextLine();



        } while (playAgain.equalsIgnoreCase("Y"));
    }
}



