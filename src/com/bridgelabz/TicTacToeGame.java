package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {

    static char COMPUTER;
    static char PLAYER;

    static void playerMethod(){
        Scanner in = new Scanner(System.in);
        System.out.println(" Select Your choice between O or X: ");
        char player = in.next().charAt(0);
        if (player == 'X') {
            COMPUTER = 'X';
            System.out.println("User mark is :" + player);
        } else
            PLAYER = 'O';
        System.out.println("User mark is :" + player);
    }

    static void board() {
        char[] arr = new char[10];

        for(int i=0;i<10;i++){
            arr[i] = ' ';
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        board();
    }
}
