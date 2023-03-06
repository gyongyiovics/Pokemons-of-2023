package org.example.game;

import java.util.Scanner;

public class Board {
    //print board - board, printBoard
    //place players on board - random values for x and y coordinates - playerOnBoard
    //move them with input - a-left, s-right, w-up, y-down
    public String[][] board(int col, int row) {
        String[][] newBoard = new String[col][row];
        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[i].length; j++) {
                newBoard[i][j] = "x ";
            }
        }
        return newBoard;
    }

    public void printBoard(String[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public String[][] playerOnBoard(int posX, int posY, String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i == posX && j == posY) {
                    board[i][j] = "@" + " ";
                }
            }
        }
        return board;
    }

    public Scanner input() {
        return new Scanner(System.in);
    }
    //TODO: add limits
    public String[][] movePlayerRight(int posX, int posY, String[][] INITgrid) {
        return playerOnBoard(posX,posY + 1, INITgrid);
    }

    public String[][] movePlayerLeft(int posX, int posY, String[][] INITgrid) {
        return playerOnBoard(posX, posY - 1, INITgrid);
    }
    public String[][] movePlayerUp(int posX, int posY, String[][] INITgrid) {
        return playerOnBoard(posX - 1, posY, INITgrid);
    }
    public String[][] movePlayerDown(int posX, int posY, String[][] INITgrid) {
        return playerOnBoard(posX + 1, posY, INITgrid);
    }

    public void movePlayer(String input, int posX, int posY, String[][] INITgrid) {
        //String[][] updatedGrid = new String[][];
        //move right
        if (input == "A" || input == "a") {
            INITgrid = movePlayerRight(posX, posY, INITgrid);
        } else if (input == "S" || input == "s") {
            //move left
            INITgrid = movePlayerLeft(posX, posY, INITgrid);
        } else if (input == "W" || input == "w") {
            //move up
            INITgrid = movePlayerUp(posX, posY, INITgrid);
        } else if (input == "Y" || input == "y") {
            //move down
            INITgrid = movePlayerDown(posX, posY, INITgrid);
        }
    }
}
