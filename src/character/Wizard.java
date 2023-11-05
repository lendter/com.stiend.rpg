package character;

import physics.Position;
import wizarding.MagicTalent;
import wizarding.PerformStyle;

public class Wizard extends PlayerCharacter{
	private MagicTalent talent;
	
	@Override
	public void move(Position position) {
		// TODO Auto-generated method stub
	}

	@Override
	public void attack(PlayerCharacter opponent) {
		talent.performMagic(this, opponent, PerformStyle.Attack);
	}

	@Override
	public boolean defend(PlayerCharacter opponent) {
		talent.performMagic(this, opponent, PerformStyle.Defense);
		return false;
	}
	
}
