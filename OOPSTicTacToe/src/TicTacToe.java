import java.util.Scanner;

public class TicTacToe {
	private Player player1, player2;
	private Board board;

	public static void main(String[] agrs) {
		TicTacToe t = new TicTacToe();
		t.startGame();
	}

	public void startGame() {
		Scanner s = new Scanner(System.in);
		player1 = takeInput(1);
		player2 = takeInput(2);
		while (player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbol Already Taken!! Pick Anothe!!");
			char symbol = s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		board = new Board(player1.getSymbol(), player2.getSymbol());
		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while (status == Board.INCOMPLETE || status == Board.INVALID) {
			if (player1Turn) {
				System.out.println("Player 1 -" + player1.getName() + "turn");
				System.out.println("Enter x:");
				int x = s.nextInt();
				System.out.println("Enter y:");
				int y = s.nextInt();
				status = board.move(player1.getSymbol(), x, y);
				if (status != Board.INVALID) {
					player1Turn = false;
					board.print();
				} else {
					System.out.println("INVALID MOVE!! TRY AGAIN!!");
				}
			} else {
				System.out.println("Player 2 -" + player2.getName() + "turn");
				System.out.println("Enter x:");
				int x = s.nextInt();
				System.out.println("Enter y:");
				int y = s.nextInt();
				status = board.move(player2.getSymbol(), x, y);
				if (status != Board.INVALID) {
					player1Turn = true;
					board.print();
				} else {
					System.out.println("INVALID MOVE!! TRY AGAIN!!");
				}
			}
		}
		if (status == Board.PLAYER_1_WINS) {
			System.out.println("Player1 Wins" + player1.getName());
		} else if (status == Board.PLAYER_2_WINS) {
			System.out.println("Player2 Wins" + player2.getName());
		} else {
			System.out.println("Draw");
		}
	}

	private Player takeInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player" + num + "Name:");
		String name = s.nextLine();
		System.out.println("Enter Player" + num + "Symbol:");
		char symbol = s.next().charAt(0);
		Player p = new Player(name, symbol);
		return p;
	}
}
