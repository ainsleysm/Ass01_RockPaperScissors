import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String moveA = "";
        String moveB = "";
        String againYN = "";
        boolean done = false;
        boolean playerA = false;
        boolean playerB = false;
        boolean whatever = false;

        do {

            do {
                System.out.print("PlayerA enter your move [RPS]: ");
                moveA = in.nextLine();

                if(moveA.equalsIgnoreCase("R")) {
                    System.out.println("PlayerA said their move was Rock");
                    playerA = true;
                } else if(moveA.equalsIgnoreCase("P")) {
                    System.out.println("PlayerA said their move was Paper");
                    playerA = true;
                } else if(moveA.equalsIgnoreCase("S")) {
                    System.out.println("PlayerA said their move was Scissors");
                    playerA = true;
                } else {
                    System.out.println("You must enter a valid move not " + moveA);
                    playerA = false;
                }
            }while(!playerA);

            do {
                System.out.print("PlayerB enter your move [RPS]: ");
                moveB = in.nextLine();

                if(moveB.equalsIgnoreCase("R")) {
                    System.out.println("PlayerB said their move was Rock");
                    if(moveA.equalsIgnoreCase("R")) {
                        System.out.println("Rock v Rock: it's a tie!");
                        playerB = true;
                    } else if(moveA.equalsIgnoreCase("P")) {
                        System.out.println("Paper v Rock: PlayerA wins!");
                        playerB = true;
                    } else {
                        System.out.println("Scissors v Rock: PlayerB wins!");
                        playerB = true;
                    }
                } else if(moveB.equalsIgnoreCase("P")) {
                    System.out.println("PlayerB said their move was Paper");
                    if(moveA.equalsIgnoreCase("R")) {
                        System.out.println("Rock v Paper: PlayerB wins!");
                        playerB = true;
                    } else if(moveA.equalsIgnoreCase("P")) {
                        System.out.println("Paper v Paper: it's a tie!");
                        playerB = true;
                    } else {
                        System.out.println("Scissors v Paper: PlayerA wins!");
                        playerB = true;
                    }
                } else if(moveB.equalsIgnoreCase("S")) {
                    System.out.println("PlayerB said their move was Scissors");
                    if(moveA.equalsIgnoreCase("R")) {
                        System.out.println("Rock v Scissors: PlayerA wins!");
                        playerB = true;
                    } else if(moveA.equalsIgnoreCase("P")) {
                        System.out.println("Paper v Scissors: PlayerB wins!");
                        playerB = true;
                    } else {
                        System.out.println("Scissors v Scissors: it's a tie!");
                        playerB = true;
                    }
                } else {
                    System.out.println("You must enter a valid move not " + moveB);
                    playerB = false;
                }
            }while(!playerB);

            do {
                System.out.print("Play again? [Y/N]: ");
                againYN = in.nextLine();

                if(againYN.equalsIgnoreCase("N")) {
                    done = true;
                    whatever = true;
                } else if(againYN.equalsIgnoreCase("Y")) {
                    whatever = true;
                } else {
                    System.out.println(againYN + " is not a valid input");
                }
            }while(!whatever);

        }while(!done);
    }
}