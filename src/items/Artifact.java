package items;

import character.PlayerCharacter;

public abstract class Artifact {
	
	protected int uses;
	
	protected Artifact(int uses) {
		setUses(uses);
	}
	
	public abstract void use(PlayerCharacter player) throws Exception;

	public int getUses() {
		return uses;
	}

	public void setUses(int uses) {
		this.uses = uses;
	}
}
