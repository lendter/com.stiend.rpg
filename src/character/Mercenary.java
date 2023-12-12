package character;

import items.Weapon;

public class Mercenary extends Fighter{
	private final String type = this.getClass().toString();
	private int blocks;
	
	public Mercenary() {}
	
	public Mercenary(String name, int hp, int intelligence, int strength, int constitution, int dexterity, Weapon weapon) {
		super(name, hp, intelligence, strength, constitution, dexterity, weapon);
		this.setBlocks(2);
	}
	
	@Override
	public boolean defend(PlayerCharacter opponent) {
		if(getBlocks() != 0) {
			blocks--;
			return true;
		}
		return false;
	}

	public int getBlocks() {
		return blocks;
	}

	private void setBlocks(int blocks) {
		this.blocks = blocks;
	}

	public String getType() {
		return type;
	}
	
}
