package character;

public class Monster extends PlayerCharacter{

	public Monster(String name, int hp, int intelligence, int strength, int constitution, int dexterity) {
		super(name, hp, intelligence, strength, constitution, dexterity);
	}

	@Override
	public void attack(PlayerCharacter opponent) {
		if(!opponent.defend(this)) {
			opponent.setHp(opponent.getHp()-this.getStrength());
		}else {
			int damage = Math.abs(opponent.getStrength() - this.getStrength());
			this.setHp(getHp() - damage);
		}
	}

	@Override
	public boolean defend(PlayerCharacter opponent) {
		if(opponent.getStrength() > this.getStrength()) {
			return false;
		}
		return true;
	}

}
