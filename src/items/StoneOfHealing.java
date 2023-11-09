package items;

import java.util.Random;

import Exceptions.ArtifactUseException;
import character.PlayerCharacter;

public class StoneOfHealing extends Artifact{
	
	Random random;

	protected StoneOfHealing(int uses) {
		super(uses);
		random = new Random();
	}

	@Override
	public void use(PlayerCharacter player) throws Exception {
		if(uses > 0 || uses == -1) {
			player.setHp(player.getHp()- random.nextInt(1, 4));
			player.setHp(player.getHp() + random.nextInt(2, 6));
		} else 
		{
			throw new ArtifactUseException();
		}
	}

}
