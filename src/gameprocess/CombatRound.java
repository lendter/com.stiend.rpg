package gameprocess;

import character.*;

public class CombatRound {
	private PlayerCharacter character;
	private Monster monster;
	
	public CombatRound(PlayerCharacter character, Monster monster) {
		this.setCharacter(character);
		this.setMonster(monster);
	}
	
	public PlayerCharacter getCharacter() {
		return character;
	}
	public void setCharacter(PlayerCharacter character) {
		this.character = character;
	}
	public Monster getMonster() {
		return monster;
	}
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	public void fight() {

		if(this.getCharacter().getDexterity() > this.getMonster().getDexterity()) {
			this.getCharacter().attack(this.getMonster());
			this.getMonster().attack(this.getCharacter());
		} else {
			this.getMonster().attack(this.getCharacter());
			this.getCharacter().attack(this.getMonster());
		}
	}
	
}
