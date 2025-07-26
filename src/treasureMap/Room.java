package treasureMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Room {
	public int count = 0;
	public void Room1Action() throws IOException{
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the STARTING POINT!");
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("Enter your path (north or east): ");
		Scanner p = new Scanner(System.in);
		String path1 = p.next();
		
		while(!path1.equals("north") && !path1.equals("east")) {
			System.out.println("Invalid Path!!! Try again!");
			path1 = p.next();
		}
		if(path1.equals("north")) {
			Room4Action();
		}
		else if(path1.equals("east")) {
			Room2Action();
		}
	}
	
	public void Room2Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Sage's Sanctum!");
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("You spotted a wise Wizard in white waiting for you! Then he said");
		
		System.out.println("**Welcome, traveler. To proceed, "
						 + "you must answer my riddle true. Listen closely: **");
		Obstacles wizard = new Obstacles();
		if(wizard.Riddle()) {
			System.out.println("Enter your next path (north or east): ");
			Scanner p = new Scanner(System.in);
			String path2 = p.next();
			while(!path2.equals("north") && !path2.equals("east")) {
				System.out.println("Invalid Path!!! Try again!");
				path2 = p.next();
			}
			if(path2.equals("north")) {
				Room5Action();
			}
			else if(path2.equals("east")) {
				Room3Action();
			}
		}
	}
		
	public void Room4Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Garden of Wisdom!");
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("There is a Fairy wandering around the garden!");
		System.out.println("Suddenly, she approached and posed a riddle to you...");
		Obstacles fairy = new Obstacles();
		if(fairy.Riddle1()) {
			System.out.println("Enter your next path (north or east): ");
			Scanner p = new Scanner(System.in);
			String path4 = p.next();
			while(!path4.equals("north") && !path4.equals("east")) {
				System.out.println("Invalid Path!!! Try again!");
				path4 = p.next();
			}
			if(path4.equals("north")) {
				Room7Action();
			}
			else if(path4.equals("east")) {
				Room5Action();
			}
		}
	}
	
	public void Room3Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Pyro Chamber!");
		System.out.println("*******************************************");
		System.out.println();
		Obstacles fire = new Obstacles();
		if(fire.Fire()) {
			System.out.println("Enter your exit (north): ");
			Scanner e = new Scanner(System.in);
			String  exit3= e.next();
			while(!exit3.equals("north")) {
				System.out.println("Invalid Path!!! Try again!");
				exit3= e.next();
			}
			Room6Action();
		}
		else {
			System.out.println("You have to go back to the closest Room");
	    	System.out.println("Enter 'retreat' to go back: ");
	    	Scanner s = new Scanner(System.in);
	    	String act = s.next();
	    	while(!act.equals("retreat")) {
			    System.out.println("Invalid Action! Try again.");
			    act = s.next();
			}
			Room2Action();
		}
	}
	
	public void Room5Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Golden Feywood!");
		System.out.println("*******************************************");
		System.out.println();
		Obstacles bird = new Obstacles();
		if(bird.Bird()) {
			System.out.println("Enter your next path (north or east): ");
			Scanner p = new Scanner(System.in);
			String path5 = p.next();
			while(!path5.equals("north") && !path5.equals("east")) {
				System.out.println("Invalid Path!!! Try again!");
				path5 = p.next();
			}
			if(path5.equals("north")) {
				Room8Action();
			}
			else if(path5.equals("east")) {
				Room6Action();
			}
		}
		else {
			System.out.println("You have to go back to the closest Room");
	    	System.out.println("Enter 'retreat' to go back: ");
	    	Scanner s = new Scanner(System.in);
	    	String act = s.next();
	    	while(!act.equals("retreat")) {
			    System.out.println("Invalid Action! Try again.");
			    act = s.next();
			}
			Random random = new Random();
			int rn = random.nextInt(2);
			if(rn == 0)
				Room2Action();
			else
				Room4Action();
		}
	}
	
	public void Room7Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Frostbite Abyss!");
		System.out.println("*******************************************");
		System.out.println();
		Obstacles ice = new Obstacles();
		if(ice.Ice()) {
			System.out.println("Enter your exit (east): ");
			Scanner e = new Scanner(System.in);
			String  exit7= e.next();
			while(!exit7.equals("east")) {
				System.out.println("Invalid Path!!! Try again!");
				Room7Action();
			}
			Room8Action();
		}
		else {
			System.out.println("You have to go back to the closest Room");
	    	System.out.println("Enter 'retreat' to go back: ");
	    	Scanner s = new Scanner(System.in);
	    	String act = s.next();
	    	while(!act.equals("retreat")) {
			    System.out.println("Invalid Action! Try again.");
			    act = s.next();
			}
			Room4Action();
		}
	}
	
	public void Room6Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Midnight Manor!");
		System.out.println("*******************************************");
		System.out.println();
		int d = Obstacles.Dracula();
		if(d==5 || d==7) {
			System.out.println("Enter your exit (north): ");
			Scanner e = new Scanner(System.in);
			String  exit6= e.next();
			while(!exit6.equals("north")) {
				System.out.println("Invalid Path!!! Try again!");
				Room6Action();
			}
			WinningRoomAction();
		}
		else if(d==1 || d==3 || d==4 || d==6 || d==8){
			System.out.println("You have to go back to the closest Room");
	    	System.out.println("Enter 'retreat' to go back: ");
	    	Scanner s = new Scanner(System.in);
	    	String act = s.next();
	    	while(!act.equals("retreat")) {
			    System.out.println("Invalid Action! Try again.");
			    act = s.next();
			}
			Random random = new Random();
			int rn = random.nextInt(2);
			if(rn == 0)
				Room3Action();
			else
				Room5Action();		
		}
		else {
			System.out.println("Enter 'start' to be Respawned again!");
			Scanner st = new Scanner(System.in);
			String res = st.next();
			while(!res.equals("start")) {
			    System.out.println("Invalid Action! Try again.");
			    res = st.next();
			}
			Room1Action();
		}
	}
	
	public void Room8Action() throws IOException {
		count++;
		System.out.println();
		System.out.println("*******************************************");
		System.out.println("You are currently at the Inferno Lair!");
		System.out.println("*******************************************");
		System.out.println();
		int d = Obstacles.Dragon();
		if(d==5 || d==7) {
			System.out.println("Enter your exit(east): ");
			Scanner e = new Scanner(System.in);
			String  exit8= e.next();
			while(!exit8.equals("east")) {
				System.out.println("Invalid Path!!! Try again!");
				Room8Action();
			}
			WinningRoomAction();
		}
		else if(d==1 || d==3 || d==4 || d==6 || d==8 ){
			System.out.println("You have to go back to the closest Room");
	    	System.out.println("Enter 'retreat' to go back: ");
	    	Scanner s = new Scanner(System.in);
	    	String act = s.next();
	    	while(!act.equals("retreat")) {
			    System.out.println("Invalid Action! Try again.");
			    act = s.next();
			}
			Random random = new Random();
			int rn = random.nextInt(2);
			if(rn == 0)
				Room5Action();
			else
				Room7Action();
		}
		else {
			System.out.println("Enter 'start' to be Respawned again!");
			Scanner st = new Scanner(System.in);
			String res = st.next();
			while(!res.equals("start")) {
			    System.out.println("Invalid Action! Try again.");
			    res = st.next();
			}
			Room1Action();
		}
	}
	
	public void WinningRoomAction() throws IOException {
		System.out.println("*Entering the next room, a blinding light forces you "
						  +"to squeeze your eyes shut, its intensity overwhelming*");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("*******************************************");
		System.out.println("Now, You are finally at the Gold Hoard Haven!");
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("Congratulations! You have found the Treasure!!!\n");
		
		System.out.println("Player Information: ");
		System.out.println("---------------------");
	    
		BufferedWriter output = new BufferedWriter(new FileWriter("GameResult.txt",true)); //to store number of rooms that you have passed through
		String rooms = String.valueOf(count);
	    output.write("\nRoom Count: ");
	    output.write(rooms);
	    output.close();
	    
	    System.out.println("Player Name: "+Player.showpname());
	    System.out.println("Total rooms you have passed util the Treasure: "+count);
	}
}