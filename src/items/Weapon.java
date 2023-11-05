package items;

public class Weapon {
	private int damage;
	
	public Weapon(int damage) {
		setDamage(damage);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
