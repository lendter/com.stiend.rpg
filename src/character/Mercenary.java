package character;

public class Mercenary extends Fighter{
	private int blocks;
	
	public Mercenary() {
		super();
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
	
}
