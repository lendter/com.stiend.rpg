package character;

public class Knight extends Fighter{
	
	@Override
	public void attack(PlayerCharacter opponent) {
		for(int i = 0; i < 2; i++) {
			if(!opponent.defend(this)) {
				int damage = this.getStrength();
				if(this.getWeapon() != null) {
					damage += this.getWeapon().getDamage();
				}
				opponent.setHp(opponent.getHp()-damage);
			}
		}
	}
	
}
