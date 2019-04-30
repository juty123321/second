package com.april;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		
		try {
			System.out.print("Plaese enter English:");
			Score english = new Score(scanner.nextLine());
			System.out.print("Plaese enter Math:");
			Score math = new Score(scanner.nextLine());
			System.out.println((english.value + math.value)/2);
		} catch (ScoreFormatException e) {
			//e.printStackTrace();
			System.out.print(e.getMessage());
		}

	}

}
