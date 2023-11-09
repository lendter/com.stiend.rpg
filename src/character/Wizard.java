package character;

import wizarding.MagicTalent;
import wizarding.PerformStyle;

public class Wizard extends PlayerCharacter {
	private MagicTalent talent;

	public Wizard(String name, int hp, int intelligence, int strength, int constitution, int dexterity, MagicTalent talent) {
		super(name, hp, intelligence, strength, constitution, dexterity);
		setTalent(talent);
	}


	@Override
	public void attack(PlayerCharacter opponent) {
		getTalent().performMagic(this, opponent, PerformStyle.Attack);
	}

	@Override
	public boolean defend(PlayerCharacter opponent) {
		getTalent().performMagic(this, opponent, PerformStyle.Defense);
		return false;
	}

	public MagicTalent getTalent() {
		return talent;
	}

	private void setTalent(MagicTalent talent) {
		this.talent = talent;
	}

}
