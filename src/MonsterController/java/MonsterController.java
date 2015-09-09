package MonsterController.java;

import marshmallows.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster Alien;
	
	public MonsterController()
	{
		String name = "";
		int eyes = 0;
		int noses= 0;
		double legs = 0.0;
		double hair = 0.0;
		boolean hasBellyButton = false;
		
		Alien = new MarshmallowMonster(name, eyes, noses, hasBellyButton, legs, hair);
	}

}
