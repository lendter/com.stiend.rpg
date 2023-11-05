package wizarding;

import character.PlayerCharacter;
import character.Wizard;

public interface MagicTalent {
	public void performMagic(Wizard wizard, PlayerCharacter opponent, PerformStyle style);
}
