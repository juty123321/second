package com.april;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
		

	}

}
