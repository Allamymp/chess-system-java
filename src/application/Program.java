package application;

import java.util.Locale;
import java.util.Scanner;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

		sc.close();
	}

}
