package character;

import physics.Position;

public abstract class PlayerCharacter {
	private String name;
	private int hp;
	private int intelligence;
	private int strength;
	private int constitution;
	private int dexterity;
	private Position position;
	
	protected PlayerCharacter() {}
	
	protected PlayerCharacter(String name, int hp, int intelligence, int strength, int constitution, int dexterity) {
		setName(name);
		setHp(hp);
		setIntelligence(intelligence);
		setStrength(strength);
		setConstitution(constitution);
		setDexterity(dexterity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp > 0) {
			this.hp = hp;
		}else {
			this.hp = 0;
		}
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void takeDamage(int damage) {
		setHp(getHp() - damage);
	}
	
	public abstract void move(Position position);
	
	public abstract void attack(PlayerCharacter opponent);
	
	public abstract boolean defend(PlayerCharacter opponent);
}
