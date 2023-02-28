import java.util.*;

public class BingoInfo {
    private Card c1;
    private Card c2;

    private NumberGenerator generators[];

    public BingoInfo(){
        this.c1 = new Card("Player 1"); //create the card for player 1//
        this.c2 = new Card("Player 2"); //create the card for player 2//
        this.generators = new NumberGenerator[]{               //the random generator for the each generator for the game//
            new Addition(), new Subtraction(), new RandomLarger(), new RandomWithin(), new RandomSmaller()
        };
    }

    public static int getInt(String question, int start, int end){             //minimum rang of input is 1 maximum is 99//    
        int result = 0;
        boolean error;
        do{
            error = false;
            System.out.print(question);
            Scanner sc = new Scanner(System.in); //Scanner//
            try{
                result = sc.nextInt();
                if(result<start || result>end){
                    System.out.println("Error: Input Out of range!!!!");  //exception handling//
                    error = true;
                }
            }
            catch(InputMismatchException i){
                System.out.println("Error: Please input the correct number");  //exception handling//
                error = true;
            }
        }while(error);

        return result;
    }
    public void exe(){                   //the runner//
        boolean end = false;

        int round = 1;

        do{               //start the game loop//
            System.out.println("Round " + round + ":"); //show the round//
            System.out.println("--------------------------------- "); //show the layout//
            System.out.println();
            System.out.println(c1.getOwner() + "\n--------");
            System.out.println(c1.toString()); //show the card of player 1//
            System.out.println(c2.getOwner() + "\n--------");
            System.out.println(c2.toString()); //show the card of player 2//
            int a,b;
            System.out.println("Number Generation:");
            if(round%2==1){
                a = getInt(c1.getOwner() + "input (1 - 99): ",1,99); //call the getInt method//
                b = getInt(c2.getOwner() + "input (1 - 99): ",1,99);
            }
            else{
                a = getInt(c2.getOwner() + "input (1 - 99): ",1 ,99);
                b = getInt(c1.getOwner() + "input (1 - 99): ", 1 , 99);
            }
        
            NumberGenerator G = generators[(int)(Math.random() * 5)]; //random range array//

            System.out.println("Computer picked: " + G.getName()); //show which generator is selected//

            int num = G.generate(a,b);
            System.out.println(G +"\n");
            c1.select(num); //check player 1 selected num//
            c2.select(num); //check player 2 selected  num//

            boolean bingo1 = c1.bingo(); //method for check p1 win//
            boolean bingo2 = c2.bingo(); //method for check p2 win// 

            if(bingo1){
                System.out.println(c1.getOwner() + ": Bingo!"); //show player 1 bingo//
                System.out.println(c1);
            }
            if(bingo2){
                System.out.println(c2.getOwner() + ": Bingo!"); //show player 2 bingo//
                System.out.println(c2);
            }
            if(bingo1 && bingo2){
                System.out.println("DRAW GAME!");  //if both of the player wins show draw game//
            }
            else if(bingo1){
                System.out.println(c1.getOwner() + "Won!"); //show player 1 won//
            }
            else if(bingo2){
                System.out.println(c2.getOwner() + "Won!"); //show player 2 won//
            }
            else{
            }
            if(bingo1 || bingo2){
                end = true;
                System.out.println("Game Ended!"); //player 1 or player 2 win than show game ended//
            }
            round ++;
        }while(!end); //end the loop while end = true//
    }
    public static void main(String args[]) {
        BingoInfo BI = new BingoInfo(); //create a game//
        BI.exe(); //run the runner//
    }
}