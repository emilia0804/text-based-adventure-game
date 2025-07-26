package treasureMap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Player extends Room{
	public static String pname;	
	public void getPlayerName() throws IOException {
		System.out.println("Hello player!");
		System.out.println("Welcome to TREASURE MAP");
		System.out.println("Enter your name: ");
		Scanner s = new Scanner(System.in);
		pname = s.nextLine();
		
	    BufferedWriter output = new BufferedWriter(new FileWriter("GameResult.txt",true));  //to store the game history
	    output.newLine();
	    output.write("Players' Name: ");
	    output.write(pname);
	    output.close();
	}
	
	public static String showpname() {
		return pname;
	}
}
