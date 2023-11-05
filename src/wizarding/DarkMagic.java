package wizarding;

import character.PlayerCharacter;
import character.Wizard;

public class DarkMagic implements MagicTalent {

	@Override
	public void performMagic(Wizard wizard, PlayerCharacter opponent, PerformStyle style) {
		switch (style) {
		case Defense:
			defensiveDarkMagic(wizard, opponent);
			break;
		case Attack:
			attackDarkMagic(wizard, opponent);
			break;
		}
	}

	public void defensiveDarkMagic(Wizard wizard, PlayerCharacter opponent) {
		if(wizard.getDexterity() > opponent.getDexterity()) {
			wizard.attack(opponent);
		}
	}

	public void attackDarkMagic(Wizard wizard, PlayerCharacter opponent) {
		opponent.takeDamage(wizard.getHp()/2);
		wizard.takeDamage(wizard.getHp()/3);
	}
}
