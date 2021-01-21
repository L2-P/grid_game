
/**
 * Write a description of class grid here.
 *
 * @author (Luke Logan)
 * @version (1.12)
 */
import java.util.Scanner; 
public class grid
{
static void clearscreen(){
    System.out.print('\u000C');
}

static String[][] createboard() {
    String [][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
    for (int t = 0; t < 5; t++) {
        for (int e = 0; e < 5; e++){
            board [t][e] = "0";
        }
    }
        
    return board;
}

static void insertboard(String[][] board){
    for (int t = 0; t < 5; t++){
        for (int e = 0; e < 5; e++){
            System.out.print("    "+board[t][e]+ "    ");
        }
        System.out.println();
    }
}

static String[][] customboard(String[][] board){
    int num = 5;
    int tcount = 0;
    int ecount = 0;
    Scanner bet = new Scanner(System.in);
    for (int t = 0; t < num; t++){
        for (int e = 0; e < num; e++){
            tcount = t + 1;
            ecount = e + 1;
            System.out.println("Give a value for number in position " +tcount+ "' " +ecount+ ":   ");
            board[t][e] = bet.next();

        }
    }
    return board;
}

static String[][] alterboard(String[][] board, int x, int y){
    Scanner bet = new Scanner(System.in);
    System.out.println("Please insert a value for the string in the position " + x + "' " + y + ":   ");
    board[x][y] = bet.next();
    return board;
}

static void explain(){
    System.out.println("We are going to play find the cow with the board you created.");
    
}

static void pickpoint(){
    System.out.println("In order to find the cow, you must correctly enter its coorinates.");
    System.out.println("Please select an x coordinate.");
}

static void kahoona(){
    int num = 5;
    String [][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
    int elementnumber;
    Scanner myscanner = new Scanner(System.in);
    clearscreen();
        explain();
        insertboard(board);
        pickpoint();
        int q = myscanner.nextInt();
        if (q == 1){
            System.out.println("Please select a y value");
            int a = myscanner.nextInt();
            
            if (a == 5){
                System.out.println("Congrats!! You found the COW.");
            }
            else if (a > 5)
            {
                System.out.println("That coordinate does not fall on the board.");
            }
            else if (q < 1)
            {
                System.out.println("That coordinate does not fall on the board.");
            }
            else
            {
                System.out.println("That was incorrect. Please select a different y number.");
                
            }
           
        }
        else if (q > 5)
        {
            System.out.println("That coordinate does not fall on the board.");
        }
        else if (q < 1)
        {
            System.out.println("That coordinate does not fall on the board.");
        }
        else
        {
            System.out.println("Please select a different x value");
            
        }
        System.out.println("Select true to try again. Pick false to move on.");
}

public static void main(String[] args) {
    boolean playagain = true;
    boolean fillananswer = true;
    boolean start = true;
    boolean loop = true;
    boolean fonyballony = true;
    int x, y;
    int num = 5;
    String [][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
    int elementnumber;
    Scanner myscanner = new Scanner(System.in);
    do {
    do {
        clearscreen();
        
        System.out.println("There is a board to edit.");
  
        board = createboard();
  
        insertboard(board);
  
        board = customboard(board);
  
        insertboard(board);
        
        System.out.print("You must chang one ponit on the board. Please give the x-coordinate:   ");
        x = myscanner.nextInt();
        System.out.print("Now please enter the Y-coordinate:    ");
        y = myscanner.nextInt();
      
        alterboard( board, x, y);
  
        insertboard(board);
        
        System.out.println("Would you reset the board or continue? Type true for reset or false for continue.");
        playagain = myscanner.nextBoolean();
    } while (playagain);
        
      do{
        kahoona();
        loop = myscanner.nextBoolean();
        
      } while (loop);
    
    
    System.out.println("Would you like to play the whole program over again? Type true to play again. Type false to end.");
    start = myscanner.nextBoolean();
    }while (start);
}
}
