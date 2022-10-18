package workshop;

public class TicTakToeGame {
	char[] board;

		public void createboard() {//Create empty Board With empty values
			char[] board = new char[10];
			for (int i = 1; i < board.length; i++) {
				board[i] = ' ';

			}
		}

	public static void main(String[] args) {
		System.out.println("Welcome to workshop usecases");
		TicTakToeGame obj = new TicTakToeGame();
		obj.createboard();
	}
}