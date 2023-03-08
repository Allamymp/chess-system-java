package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Board;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		Board board = new Board(8,8);

		sc.close();
	}

}
