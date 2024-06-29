# Tic-Tac-Toe Game

## Description
This is a simple console-based Tic-Tac-Toe game for two players. The game is played on a 3x3 grid, and the players take turns to place their symbols (Player 1: X, Player 2: O) in the empty cells. The first player to get three of their symbols in a row (horizontally, vertically, or diagonally) wins the game. If all cells are filled and no player has three in a row, the game is a draw.

## Skills
- Control structures (loops and conditionals)
- Array manipulation
- User input handling

## How to Use
1. **Run the Program**: Execute the program to start the game.
2. **Input**: Follow the prompts to enter positions for placing your symbol.
3. **Gameplay**: The game will alternate turns between Player 1 (X) and Player 2 (O).
4. **Output**: The program will display the board after each move, and announce the winner or if the game is a draw.
5. **Play Again**: After the game ends, you will be prompted to play again or exit.

## Example
Here is an example of how the game looks during play:

```plaintext
Welcome to Tic-Tac-Toe!

Player 1: X
Player 2: O

Tic Tac Toe Rules:
- The game is played on a 3x3 grid.
- Two players take turns to place their symbol (Player 1: X, Player 2: O) in an empty cell.
- The goal is to be the first to get three of your symbols in a row (horizontally, vertically, or diagonally).
- Players take turns until one player wins or all cells are filled.
- If all cells are filled and no player has three in a row, the game is a draw.

Sample Board:
  1  |  2  |  3  
-----------------
  4  |  5  |  6  
-----------------
  7  |  8  |  9  

Game Start!

Player X's turn. Enter a position (1-9): 1

---------------
 | X |   |   | 
---------------
 |   |   |   | 
---------------
 |   |   |   | 
---------------

Player O's turn. Enter a position (1-9): 5

---------------
 | X |   |   | 
---------------
 |   | O |   | 
---------------
 |   |   |   | 
---------------

Player X's turn. Enter a position (1-9): 2

---------------
 | X | X |   | 
---------------
 |   | O |   | 
---------------
 |   |   |   | 
---------------

Player O's turn. Enter a position (1-9): 3

---------------
 | X | X | O | 
---------------
 |   | O |   | 
---------------
 |   |   |   | 
---------------

Player X's turn. Enter a position (1-9): 4

---------------
 | X | X | O | 
---------------
 | X | O |   | 
---------------
 |   |   |   | 
---------------

Player O's turn. Enter a position (1-9): 6

---------------
 | X | X | O | 
---------------
 | X | O | O | 
---------------
 |   |   |   | 
---------------

Player X's turn. Enter a position (1-9): 7

---------------
 | X | X | O | 
---------------
 | X | O | O | 
---------------
 | X |   |   | 
---------------

Player X wins! Congratulations!

Do you want to play again? (y/n): n
Thank you for playing Tic-Tac-Toe!
