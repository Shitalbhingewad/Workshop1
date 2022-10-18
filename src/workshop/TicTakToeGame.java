package workshop;

import java.util.Scanner;

public class TicTakToeGame {
	char[] board;

	public void createboard() {//Create empty board with empty values
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';

		}
	}

	public void choice() { //Player and Computer value on basis of player selection X or O
		char computer;

		Scanner userinput = new Scanner(System.in);
		System.out.println("enter a character");// userchoice

		char player = userinput.nextLine().charAt(0);

		if (player == 'x') {
			computer = 'o';
		} else {

			computer = 'x';
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to tictactoe game");

		TicTakToeGame obj = new TicTakToeGame();
		obj.createboard();
		obj.choice();
	}
}