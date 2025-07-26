package treasureMap;

import java.util.Random;
import java.util.Scanner;

public class Obstacles {
	
	public boolean Riddle() {
		System.out.println("The Riddle goes like this: ");
		System.out.println("-------------------------");
		String[] questions = new String[]{"I start with the letter e, I end with the letter e. I contain only one letter, "
				                           + "Yet I am not the letter e! What am I?",
                						  "What goes up,but never comes down?",
                						  "It belongs to you,but your friends use it more.What is it?",
                						  "I am white when I am dirty,and black when I am clean.What am I?",
                						  "What is full of holes but still holds water?",
                						  "What has to be broken before you can use it?",
                						  "What has hands but cannot clap?",
                						  "What has tail and a head but no body?",
                						  "What goes up and down but doesn't move?",
                						  "What has cities but no houses, forests but no trees, and rivers but no water?"};
		String[] answers = new String[] {"envelope","age","name","blackboard","sponge","egg","clock","coin","temperature","map"};
		
		Random random = new Random();
		int randomIndex = random.nextInt(questions.length);
		String randomQues = questions[randomIndex];   //get random questions from questions array
		String correctAnswer = answers[randomIndex];  //get correct answer from answers array
		
		Scanner input = new Scanner(System.in);
		System.out.println(randomQues);
		System.out.println("Enter your answer: ");
		String userAnswer = input.nextLine();
		
		while(!(userAnswer.equalsIgnoreCase(correctAnswer)) ){
			System.out.println("Oops, not quite right. But don't worry, you have another shot.");
			userAnswer = input.next();
		}
		System.out.println("Well done! You may pass now.");
		return true;
	}
	
	public boolean Riddle1() {
		System.out.println("The Riddle goes like this: ");
		System.out.println("-------------------------");
		String[] questions = new String[]{"What has one eye but can't see?",
                						  "What comes down but never goes up?",
                						  "What runs around the whole yard without moving?",
                						  "I make two people out of one. What am I?",
                						  "What building has the most stories?",
                						  "What comes once in a minute,twice in a moment,but never in a thousand years?",
                						  "I'm light as a feather, yet the strongest man can't hold me "
                						  + "for much longer than a minute. What am I?",
                						  "What has a bed but never sleeps, can run but never walks, and has a bank but no money?",
                						  "I fly all day but I stay at the same spot. What am I?",
                						  "I am easy to lift,but hard to throw. What am I?"};
		String[] answers = new String[] {"needle","Rain","fence","mirror","library","m","Breath","river","flag","feather"};
		
		Random random = new Random();
		int randomIndex = random.nextInt(questions.length);
		String randomQues = questions[randomIndex]; //get random questions from questions array
		String correctAnswer = answers[randomIndex];//get correct answers from questions array
		
		Scanner input = new Scanner(System.in);
		System.out.println(randomQues);
		System.out.println("Enter your answer: ");
		String userAnswer = input.nextLine();
		
		while(!(userAnswer.equalsIgnoreCase(correctAnswer)) ){
			System.out.println("Oops, not quite right. But don't worry, you have another shot.");
			userAnswer = input.next();
		}
		System.out.println("Well done! You may pass now.");
		return true;
	}
	
	public boolean Fire() {
		System.out.println("As soon as you enter the room, fire breaks out all around you, spreading rapidly!!!");
		System.out.println("\nAmidst the fire, a nearby magical shrine catches your eye, offering a glimmer of hope in the chaos.");
		System.out.println("Enter 'bless' now to grasp the shrine's magic and escape the raging fire: ");
		Scanner s = new Scanner(System.in);
		String action = s.next();
		
		while(!action.equals("bless")) {
			System.out.println("Invalid Action! Try again.");
			action = s.next();   //prompts the user to input a value again
		}
		
		Random random = new Random();
		int rn = random.nextInt(2);
		if(rn==0) {
			System.out.println("Wonderfull! You gained water magic from the shrine!!!");
			System.out.println("Now, you can pass the room safely.");
	    	System.out.println("Enter 'hydro' to put out the fire: ");
			String act = s.next();
			while(!act.equals("hydro")) {
			    System.out.println("Invalid Action! Try again.");
			    act = s.next(); //prompts the user to input a value again
			}
			return true;
		}
		else {
			System.out.println("With the blessing, you received only a cup of water :)");
			System.out.println("The flames intensify, growing stronger by the moment!");
			return false;
		}
	}
	
	public boolean Bird() {
	    System.out.println("The vast room is nearly overrun with towering trees! ");
	    System.out.println("The exit door stands locked before you,");
	    System.out.println("But you spy a magical bird soaring above, clutching a golden key\n");
	    System.out.println("Now, Enter 'roll' for the dice of 3 choices: \n");
	    System.out.println("1. A 'fluke' to sing a song for the bird (100%)");
	    System.out.println("2. A 'net gun' to capture the bird (50%)");
	    System.out.println("3. Just a 'slingshot' (20%) :)");
	    Scanner s = new Scanner(System.in);
	    String action = s.next();
	    
	    while(!action.equals("roll")) {
	    	System.out.println("Invalid Action! Try again.");
	    	action = s.next(); //prompts the user to input a value again
	    }
	    
	    Random random = new Random();
	    int roll = random.nextInt(3);
	    if(roll==0) {
	    	System.out.println("Lucky! You have obtained the elusive fluke.\n");
	    	System.out.println("Enter 'sing' to charm the bird with you song: ");
	    	String act = s.next();
	    	
	    	while(!act.equals("sing")) {
	    		System.out.println("Invalid Action! Try again.");
	    		act = s.next(); //prompts the user to input a value again
	    	}
	    	
	    	System.out.println("The bird adores your song, rewarding you with the key.");
	    	return true;
	    }
	    else if(roll==1){
	    	System.out.println("You have aquired the net gun!\n");
	    	System.out.println("Enter 'shoot' to aim and capture the bird: ");
			String act = s.next();
			
			while(!act.equals("shoot")) {
		    	System.out.println("Invalid Action! Try again.");
		    	act = s.next(); //prompts the user to input a value again
		    }
			
			Random rnd = new Random();
			int rn = rnd.nextInt(2);
			if(rn==0) {
				System.out.println("You have successfully captured the bird and retrieved the key!");
				return true;
			}
			else {
	    	  	System.out.println("Your aim was horrible and you scared the bird away!!!");
	    	  	return false;
			}  
	    }
	    else {
	    	System.out.println("Welp! You have obtained the slingshot!\n");
	    	System.out.println("Enter 'shoot' to catch the bird: ");
			String act = s.next();
			
			while(!act.equals("shoot")) {
		    	System.out.println("Invalid Action! Try again.");
		    	act = s.next(); //prompts the user to input a value again
		    }
	    	
			Random rnd = new Random();
	    	int rn = rnd.nextInt();
	    	if(rn==3) {
				System.out.println("Unbeliveable! The bird is struck and drops the key :( ");
				return true;
	    	}
	    	else {
				System.out.println("You missed the shot and scared the bird away");
				return false;
	    	}  
	    }
	}
	
	public boolean Ice() {
		System.out.println("The room grows colder by the second, and before you know it, "
						 + "the floor is covered in a sheet of slippery ice!");
		System.out.println("But wait, there is a mystery chest near the door!");
		System.out.println("Hurry up, Enter 'open' for the chest: ");
		Scanner s = new Scanner(System.in);
	    String action = s.next();
	    
	    while(!action.equals("open")) {
	    	System.out.println("Invalid Action! Try again.");
	    	action = s.next(); //prompts the user to input a value again
	    }
	    
		Random random = new Random();
		int rn = random.nextInt(2);
		if(rn==0) {
			System.out.println("You have found Roller Skate Shoes and a Ski Jacket inside it!\n");
			System.out.println("Enter 'skate' to zip through the room in a flash: ");
			String act = s.next();
			while(!act.equals("skate")) {
		    	System.out.println("Invalid Action! Try again.");
		    	act = s.next();
		    }
			return true;
		}
		else {
			System.out.println("You have only obtained a pair of worn slippers :)");
			System.out.println("The temperature continues to drop, sending shivers down your spine!");
			return false;
		}
	}
	
	public static int Dracula() {
		System.out.println("A menacing Dracula sits upon a throne!!!");
		System.out.println("Quickly, open the mystery chest near the door before Dracula notices you.\n");
		System.out.println("Enter 'open' for the chest: ");
		Scanner s = new Scanner(System.in);
	    String action = s.next();
	    
	    while(!action.equals("open")) {
	    	System.out.println("Invalid Action! Try again.");
	    	action = s.next(); //prompts the user to input a value again
	    }
	    
		Random random = new Random();
		int rn = random.nextInt(10);
		if(rn==5 || rn==7) {
			System.out.println("You have obtained a Sunlight Magic Blessing from the chest!");
			System.out.println("You can now easily confront and attack Dracula.\n");
			System.out.println("Enter 'attack' to defeat the Dracula: ");
			String act = s.next();
			while(!act.equals("attack")) {
		    	System.out.println("Invalid Action! Try again.");
		    	act = s.next(); //prompts the user to input a value again
		    }
		}
		else if(rn==1 || rn==3 || rn==4 || rn==6 || rn==8){
			System.out.println("You have only accquired a Garlic Braid!");
			System.out.println("The Dracula, visibly upset, keeps his distance.");
		}
		else {
			System.out.println("You got scammed! The chest is empty :) ");
			System.out.println("The Dracula senses you and strikes, ending your life instantly!");
		}
		return rn;
	}
	
	public static int Dragon() {
		System.out.println("Beware! A colossal, terrifying Dragon is poised to unleash its fiery breath!");
		System.out.println("Quickly, open the mystery chest near the door before the Dragon attacks you.\n");
		System.out.println("Enter 'open' for the chest: ");
		Scanner s = new Scanner(System.in);
	    String action = s.next();
	    
	    while(!action.equals("open")) {
	    	System.out.println("Invalid Action! Try again.");
	    	action = s.next(); //prompts the user to input a value again
	    }
	    
		Random random = new Random();
		int rn = random.nextInt(10);
		if(rn==5 || rn==7) {
			System.out.println("You have obtained a Dragon Slayer Sword from the chest.");
			System.out.println("You can now easily confront and attack the Dragon.\n");
			System.out.println("Enter 'attack' to defeat the Dragon: ");
			String act = s.next();
			while(!act.equals("attack")) {
		    	System.out.println("Invalid Action! Try again.");
		    	act = s.next(); //prompts the user to input a value again
		    }
		}
		else if(rn==1 || rn==3 || rn==4 || rn==6 || rn==8){
			System.out.println("You have obtained a Shining Armor!");
			System.out.println("Now, you're safe from the dragon's fire, but you're weaponless against it!");
		}
		else {
			System.out.println("You got scammed! The chest is empty :) ");
			System.out.println("The Dragon's flame consumes you and steals your final breath!");
		}
		return rn;
	}
}
