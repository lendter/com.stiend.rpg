package character;

import items.Weapon;

public class Fighter extends PlayerCharacter{
	private Weapon weapon;
	
	public Fighter(String name, int hp, int intelligence, int strength, int constitution, int dexterity, Weapon weapon) {
		super(name, hp, intelligence, strength, constitution, dexterity);
		setWeapon(weapon);
	}

	@Override
	public void attack(PlayerCharacter opponent) {
		if(!opponent.defend(this)) {
			int damage = this.getStrength();
			if(this.getWeapon() != null) {
				damage += this.getWeapon().getDamage();
			}
			opponent.setHp(opponent.getHp()-damage);
		}
	}

	@Override
	public boolean defend(PlayerCharacter opponent) {
		if(opponent.getStrength() > this.getWeapon().getDefense()) {
			takeDamage(opponent.getStrength()-this.getWeapon().getDefense());
			return false;
		}
		this.getWeapon().setDefense(this.getWeapon().getDefense() / 2);
		return true;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
