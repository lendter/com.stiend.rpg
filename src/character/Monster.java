package character;

import physics.Position;

public class Monster extends PlayerCharacter{

	public Monster(String name, int hp, int intelligence, int strength, int constitution, int dexterity) {
		super(name, hp, intelligence, strength, constitution, dexterity);
	}
	
	@Override
	public void move(Position position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(PlayerCharacter opponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean defend(PlayerCharacter opponent) {
		// TODO Auto-generated method stub
		return false;
	}

}
