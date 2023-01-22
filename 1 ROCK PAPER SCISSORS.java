import java.util.*;
public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Stone Paper Scissors!");
        System.out.print("Please Enter Your Name: ");
        String name = sc.next();
        System.out.println("So Hi "+name+"! We will play this game for 5 times");
        int PlayerTotal = 0;
        int ComputerTotal = 0;

        for(int i=0;i<3;i++)
        {
            System.out.println("Keywords");
            System.out.println("Press 0 for Stone");
            System.out.println("Press 1 for Paper");
            System.out.println("Press 2 for Scissor");
            int pchoice = sc.nextInt();
            int cchoice = rm.nextInt(3);
            if(pchoice==0) {
                switch (cchoice) {
                    case 1:
                        System.out.println("Mines");
                        ComputerTotal++;
                        break;

                    case 2:
                        System.out.println("Yours");
                        PlayerTotal++;
                        break;

                    default:
                        System.out.println("Ohfo! Its same");

                }
            }
            else if(pchoice==1) {
                switch (cchoice) {
                    case 0:
                        System.out.println("Yours");
                        PlayerTotal++;
                        break;

                    case 2:
                        System.out.println("Mines");
                        ComputerTotal++;
                        break;

                    default:
                        System.out.println("Ohfo! Its same");
                }
            }
            else if (pchoice ==2) {
                switch (cchoice) {
                    case 1:
                        System.out.println("Yours");
                        PlayerTotal++;
                        break;

                    case 0:
                        System.out.println("Mines");
                        ComputerTotal++;
                        break;

                    default:
                        System.out.println("Ohfo! Its same");
                }
            }
            else {
                System.out.println("Invalid input");
            }

        }
        if(PlayerTotal>ComputerTotal)
        {
            System.out.println("Congratulation You are Winner with "+PlayerTotal+" Points!\nThankyou if you like Play Again!!\n\"Bye Bye\"");
        }
        else
        {
            System.out.println("Sorry You Loos this game! With Points"+PlayerTotal+"\n Better Luck Next Time");
        }

    }
}
