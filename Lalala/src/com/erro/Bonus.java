package com.erro;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.println("請math輸入成績");
		String math = scr.nextLine();
		try {
			int n = Integer.parseInt(math);
			System.out.println("math: " + n);
		} catch(ArithmeticException e) {
			System.out.println("錯誤" );
		} catch(NumberFormatException e) {
			System.out.println("錯誤1");
		}
		
		System.out.println("請english輸入成績");
		String eng = scr.nextLine();
		try {
			int n = Integer.parseInt(eng);
			System.out.println("english: " + n);
		} catch(ArithmeticException e) {
			System.out.println("錯誤" );
		} catch(NumberFormatException e) {
			System.out.println("錯誤1");
		}

	}

}
