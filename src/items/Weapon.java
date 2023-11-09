package items;

public abstract class Weapon extends Item{
	private int damage;
	private int defense;
	
	protected Weapon(int damage, int defense) {
		super.setType(Type.WEAPON);
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
