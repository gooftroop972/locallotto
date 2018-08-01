/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//edited 02-01-2018
package lotto;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JFrame;


public class CSVReaderInJava { 
	public static int[] ballCount = new int[70];
	public static int[] pbCount = new int[27];
	public static ArrayList<Integer> ballChosen = new ArrayList<Integer>();
	public static ArrayList<Integer> pbChosen = new ArrayList<Integer>();
    
        
    public static void main(String... args) { 
   
        List<Drawnings> books = readBooksFromCSV("powerball.csv");
        
        books.forEach((b) -> { 
            //System.out.println(b);
            //System.out.println("Blank Line");
            //System.out.println(books.);
            //System.out.println("lol");
        });
        
        for (int i = 1; i < ballCount.length; i++) {
        	if (ballCount[i] > 0) {
        		System.out.println("Ball " + i + " count = " + ballCount[i]);
        		ballChosen.add(new Integer(i));
        	}
        	
        	if (i <= 26) {
        		if (pbCount[i] > 0) {
            		System.out.println("PowerBall " + i + " count = " + pbCount[i]);
        		}
        	}
        	
        }
        
        FirstGui gui = new FirstGui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(300,300);
		gui.setVisible(true);
		gui.setTitle("Lotto Random Number Game");

    } 
    
    public static String randomChosen() {
    	String b1;
    	String b2;
    	String b3;
    	String b4;
    	String b5;
    	String pb;
 
        Collections.shuffle(ballChosen);
		b1 = Integer.toString(ballChosen.get(0));
		b2 = Integer.toString(ballChosen.get(4));
		b3 = Integer.toString(ballChosen.get(9));
		b4 = Integer.toString(ballChosen.get(14));
		b5 = Integer.toString(ballChosen.get(19));
		
        Collections.shuffle(pbChosen);
		pb = Integer.toString(pbChosen.get(5));
		
		return b1;
		
    }
    
    public static void Count(int ball12, int ball22, int ball32, int ball42, int ball52, int powerBall2) {
    	ballCount[ball12] = ballCount[ball12] + 1;
    	ballCount[ball22] = ballCount[ball22] + 1;
    	ballCount[ball32] = ballCount[ball32] + 1;
    	ballCount[ball42] = ballCount[ball42] + 1;
    	ballCount[ball52] = ballCount[ball52] + 1;
    	pbCount[powerBall2] = pbCount[powerBall2]+1;
        /*System.out.println("Ball " + ball12 + " count = " + ballCount[ball12]);
        System.out.println("Ball " + ball22 + " count = " + ballCount[ball22]);
        System.out.println("Ball " + ball32 + " count = " + ballCount[ball32]);
        System.out.println("Ball " + ball42 + " count = " + ballCount[ball42]);
        System.out.println("Ball " + ball52 + " count = " + ballCount[ball52]);
        System.out.println("Power Ball " + powerBall2 + " count = " + pbCount[powerBall2]);*/
		
	}
    
    private static List<Drawnings> readBooksFromCSV(String fileName) { 
        List<Drawnings> books = new ArrayList<>();
        Path pathToFile = Paths.get(fileName); 

        // create an instance of BufferedReader 
        // using try with resource, Java 7 feature to close resources 
        try (BufferedReader br = Files.newBufferedReader(pathToFile, 
                StandardCharsets.US_ASCII)) { 

            // read the first line from the text file 
            String line = br.readLine(); 

            // loop until all lines are read 
            while (line != null) { 

                // use string.split to load a string array with the values from 
                // each line of 
                // the file, using a comma as the delimiter 
                String[] attributes = line.split(",");

                Drawnings book = createBook(attributes); 

                // adding book into ArrayList 
                books.add(book);

                // read next line before looping 
                // if end of file reached, line would be null 
                line = br.readLine(); 
            } 
        } catch (IOException ioe) { 
        } 
        return books; 
    } 

    private static Drawnings createBook(String[] metadata) { 
        String game = metadata[0];
        String draw = metadata[1];
        int ball1 = Integer.parseInt(metadata[2]);
        int ball2 = Integer.parseInt(metadata[3]);
        int ball3 = Integer.parseInt(metadata[4]);
        int ball4 = Integer.parseInt(metadata[5]);
        int ball5 = Integer.parseInt(metadata[6]);
        int powerBall = Integer.parseInt(metadata[7]);
        int powerPlay = Integer.parseInt(metadata[8]);

      return new Drawnings(game, draw, ball1, ball2, ball3, ball4 , ball5
            , powerBall , powerPlay);
    }
    
 
    
} 


        
 
