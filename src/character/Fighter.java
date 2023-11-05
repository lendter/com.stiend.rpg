package character;

import items.Weapon;
import physics.Position;

public class Fighter extends PlayerCharacter{
	private Weapon weapon;
	
	@Override
	public void move(Position position) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return false;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
