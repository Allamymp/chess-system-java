package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Position board = new Position(10,20);
		System.out.println("Iam alive!");

		
		System.out.println(board);

		sc.close();
	}

}
