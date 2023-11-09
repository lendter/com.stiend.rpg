package items;

import Exceptions.ArtifactUseException;
import character.PlayerCharacter;

public class PowerStone extends Artifact {

	public PowerStone(int uses) {
		super(uses);
	}

	@Override
	public void use(PlayerCharacter player) throws Exception {
		if (uses > 0 || uses == -1) {
			player.setStrength(player.getStrength() * 2);
			uses--;
		} else 
		{
			throw new ArtifactUseException();
		}
	}
}
