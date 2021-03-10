package HomeWork3;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class DZ3 {

    public static char[][] board;
    public static int boardSizeX = 3;
    public static int boardSizeY = 3;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '~';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void buildBoard(int sizeY, int sizeX){
        board = new char[sizeY][sizeX];

        for (int y = 0; y < sizeY; y++){
            for (int x = 0; x < sizeX; x++){
                board[y][x] = empty;
            }
        }
    }

    public static void printBoard(){
        for (int y = 0; y < boardSizeY ; y++){
            for (int x = 0; x < boardSizeX ; x++){
                System.out.print(board[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~");
    }

    public static void stepHuman(){
        int x;
        int y;

        do{
            System.out.println("PLEASE SELECT A CELL: ");
            x = scanner.nextInt() -1;
            y = scanner.nextInt() -1;
        } while (!isValidTurn(y, x) || !isEmptyCell(y, x));
        board[y][x] = human;
        System.out.println("Your step in " + y + ":" + x);
    }

    public static void stepPC(){
        int x;
        int y;

        do{
            x = random.nextInt(boardSizeX);
            y = random.nextInt(boardSizeY);
        } while (!isEmptyCell(y, x));
        board[y][x] = ai;
        System.out.println("AI step in " + y + ":" + x);
    }

    public static boolean isFullMap(){
        for (int y=0; y < boardSizeY; y++){
            for (int x=0; x < boardSizeX; x++){
                if(board[y][x] == empty){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWinLine(char player){
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player) return true;
        if (board[1][0] == player && board[1][1] == player && board[1][2] == player) return true;
        if (board[2][0] == player && board[2][1] == player && board[2][2] == player) return true;

        if (board[0][0] == player && board[1][0] == player && board[2][0] == player) return true;
        if (board[0][1] == player && board[1][1] == player && board[2][1] == player) return true;
        if (board[0][2] == player && board[1][2] == player && board[2][2] == player) return true;

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }

    public static boolean isValidTurn(int y,int x){
        return x >= 0 && x < boardSizeX && y >=  0 && y < boardSizeY;
    }

    public static boolean isEmptyCell(int y, int x){
        return board[y][x] == empty;
    }

    public static void main(String[] args) {
        buildBoard(boardSizeY, boardSizeX);
        printBoard();

        while (true) {
            stepHuman();
            printBoard();

            if (checkWinLine(human)) {
                System.out.println("!!!HUMAN WIN!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("!!Depict!!");
                break;
            }

            stepPC();
            printBoard();

            if (checkWinLine(ai)) {
                System.out.println("!!!AI WIN!!!");
                break;
            }

            if (isFullMap()) {
                System.out.println("!!Depict!!");
                break;
            }
        }

    }
}
