package items;

public class Weapon {
	private int damage;
	private int defense;
	
	public Weapon(int damage, int defense) {
		setDamage(damage);
		setDefense(defense);
	}

	public int getDamage() {
		return damage;
	}

	private void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefense() {
		return defense;
	}

	private void setDefense(int defense) {
		this.defense = defense;
	}
}
