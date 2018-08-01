package lotto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) {
		
		
		try {
			// get the drawning list file
			File drawingsFile = new File("powerball.csv");
			// use a scanner that will read from the file
			Scanner drawningsScanner = new Scanner(drawingsFile);
			//read a line from the file.
			String nextLine = drawningsScanner.nextLine();
			//split the file into parts.
			String[] drawingDates = nextLine.split(",");
			//get the Drawings one at a time
			int intBall1 = Integer.parseInt(drawingDates[2]);
			System.out.println("Next line: " + nextLine);
			System.out.println("Ball 1: " + intBall1);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
