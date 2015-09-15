package MonsterController.java;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster josiahMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "Norlark";
		int eyes = 30;
		int noses= 0;
		double legs = 3.4;
		double hair = 0.07;
		boolean hasBellyButton = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		josiahMonster = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}

	public void start()
	{
		myDisplay.displayInfo(josiahMonster.toString());
		askQuestions();
		myDisplay.displayInfo("Updated monster info: " + josiahMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one please!");
		String newMonsterName = monsterScanner.next();
		josiahMonster.setMonsterName(newMonsterName);
	}