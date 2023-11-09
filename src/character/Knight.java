package character;

import items.Weapon;

public class Knight extends Fighter{
	
	public Knight(String name, int hp, int intelligence, int strength, int constitution, int dexterity, Weapon weapon) {
		super(name, hp, intelligence, strength, constitution, dexterity, weapon);
	}
	
	@Override
	public void attack(PlayerCharacter opponent) {
		super.attack(opponent);
		super.attack(opponent);
	}
	
}
