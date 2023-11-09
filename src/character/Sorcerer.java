package character;

import items.MagicWand;
import wizarding.MagicTalent;

public class Sorcerer extends Wizard{
	private MagicWand wand;
	
	public Sorcerer(String name, int hp, int intelligence, int strength, int constitution, int dexterity,
			MagicTalent talent, MagicWand wand) {
		super(name, hp, intelligence, strength, constitution, dexterity, talent);
	}

	@Override
	public void attack(PlayerCharacter opponent) {
		
	}
	
	public MagicWand getWand() {
		return wand;
	}

	public void setWand(MagicWand wand) {
		this.wand = wand;
	}
	
	
}
