package com.erro;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 100000;
		int div = 0;
		Scanner scr = new Scanner(System.in);
		System.out.println("多少人要分?");
		String number = scr.nextLine();
		try {
			int n = Integer.parseInt(number);
			div = m/n;
			System.out.print("每人得" + div);
		} catch(ArithmeticException e) {
			System.out.print("錯誤" );
		} catch(NumberFormatException e) {
			System.out.print("錯誤1");
		}
		

	}

}
