package character;

public class Knight extends Fighter{
	
	@Override
	public void attack(PlayerCharacter opponent) {
		super.attack(opponent);
		super.attack(opponent);
	}
	
}
