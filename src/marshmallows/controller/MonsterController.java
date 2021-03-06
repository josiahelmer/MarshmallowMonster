package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import java.util.Scanner;
import marshmallows.view.PopupDisplay;

public class MonsterController
{
	private MarshmallowMonster josiahMonster;
	private MarshmallowMonster userMonster;
	private Scanner monsterScanner;
	private PopupDisplay myPopups;
	
	public MonsterController()
	{
		String name = "Norlark";
		int eyes = 30;
		int noses= 0;
		double legs = 3.4;
		double hair = 0.07;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);

		josiahMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
		myPopups = new PopupDisplay();
	}

	public void start()
	{
		myPopups.displayResponse("My monster's name is Norlark");
		
		String newMonsterName = myPopups.getAnswer("I want a new name for the monster, type one in please!");
		josiahMonster.setMonsterName(newMonsterName);
		
		int monsterNoses;
		 String monsterNoses = myPopups.getAnswer("Give me a number of noses");
		 int monsterNoses = monsterScanner.nextInt();
	}
	
	private void askQuestions()
	{
	
		System.out.println("Give me a new number of noses");
		int updatedNoses = monsterScanner.nextInt();
		System.out.println("Give me a new number of eyes");
		int updatedEyes = monsterScanner.nextInt();
		System.out.println("Give me a new number of legs");
		double updatedlegs = monsterScanner.nextDouble();
		System.out.println("Gve me a number of hairs");
		double updatedhairs = monsterScanner.nextDouble();
	}

	/**
	 * Creates a MarshMallowMonster instance from user input
	 */
	private void createUserMonster()
	{
		//Step one: Gather user information
		System.out.println("What is your Monster name?");
		String userName;
		userName = monsterScanner.nextLine();
		System.out.println("How many legs will it have? This is a Decimal value");
		double userLegs = monsterScanner.nextDouble();
		System.out.println("How much hair does it have, another decimal value");
		double userHair;
		userHair = monsterScanner.nextDouble();
		System.out.println("Does is have a belly button - true false");
		boolean hasBellyButton = monsterScanner.nextBoolean();
		System.out.println("Numr of eyes on the monster?");
		int userEyes = monsterScanner. nextInt();
		System.out.println("How manny noses does it have?");
		int userNoses = monsterScanner.nextInt();
		
		//Step two: Build the monster using the constructor.
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, hasBellyButton, userLegs, userHair);
	}
}