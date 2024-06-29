import java.util.*;
public class TicTacToe {
    static int Position;
    static char CurrentPlayer = 'X';
    public static char[][] Board = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DisplayIntro();

        while (true) {
            InitializeBoard(); 
            PlayGame();

            System.out.print("Do you want to play again? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                System.out.println("Thank you for playing Tic-Tac-Toe!");
                break;
            }
        }

        scanner.close();
    }

    public static void PlayGame() {
        while (true) {
            System.out.print("\nPlayer " + CurrentPlayer + "'s turn. Enter a position (1-9): ");
            Position = scanner.nextInt();

            if (PlaceMarker(Position)) {
                DisplayBoard();
                if (CheckForWin()) {
                    System.out.println("Player " + CurrentPlayer + " wins! Congratulations!");
                    break;
                } else if (CheckForDraw()) {
                    System.out.println("It's a Draw!");
                    break;
                }
                CurrentPlayer = (CurrentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Position " + Position + " is already taken. Try again.");
            }
        }
    }

    public static void DisplayIntro(){
        System.out.println("Welcome to Tic-Tac-Toe!\n");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O\n");
        System.out.println("Tic Tac Toe Rules:");
        System.out.println("- The game is played on a 3x3 grid.");
        System.out.println("- Two players take turns to place their symbol (Player 1: X, Player 2: O) in an empty cell.");
        System.out.println("- The goal is to be the first to get three of your symbols in a row (horizontally, vertically, or diagonally).");
        System.out.println("- Players take turns until one player wins or all cells are filled.");
        System.out.println("- If all cells are filled and no player has three in a row, the game is a draw.");
        System.out.println("\nSample Board:");
        System.out.println("  1  |  2  |  3  ");
        System.out.println("-----------------"); 
        System.out.println("  4  |  5  |  6  ");
        System.out.println("-----------------");
        System.out.println("  7  |  8  |  9  ");
        System.out.println("\nGame Start!\n");
    }

    public static void InitializeBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Board[i][j]=' ';
            }
        }
    }

    public static void DisplayBoard(){
        System.out.println("---------------");
        for(int i = 0; i < 3; i++){
            System.out.print(" | ");
            for(int j = 0; j < 3; j++){
                System.out.print(Board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }
    
    public static Boolean PlaceMarker(int Position){
        if(Position > 9 || Position < 1){
            return false;
        }

        int row = (Position - 1) / 3;
        int column = (Position - 1) % 3;

        if(Board[row][column] == ' '){
           Board[row][column] = CurrentPlayer;
           return true;
        }else{
           return false;
        }
    }

    public static Boolean CheckForWin(){
        for(int i = 0; i < 3; i++){
            if(Board[i][0] == Board[i][1] && Board[i][1] == Board[i][2] && Board[i][0] != ' '){
                return true;
            }if(Board[0][i] == Board[1][i] && Board[1][i] == Board[2][i] && Board[0][i] != ' '){
                return true;
            }
        }if((Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2] && Board[1][1] != ' ') || (Board[0][2] == Board[1][1] && Board[1][1] == Board[2][0] && Board[1][1] != ' ')){
            return true;
        }

        return false;
    }

    public static Boolean CheckForDraw(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(Board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}