package items;

import character.PlayerCharacter;

public abstract class Artifact extends Item{
	
	protected int uses;
	
	protected Artifact(int uses) {
		super.setType(Type.ARTIFACT);
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
