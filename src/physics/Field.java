package physics;

import character.Monster;
import character.PlayerCharacter;
import items.Item;

public class Field {
	
		private Item item;
		private PlayerCharacter character;
		private Monster monster;
		private boolean isWall;

		public Field() {
			this.item = null;
			this.character = null;
			this.monster = null;
			this.isWall = false;
		}
		
		public PlayerCharacter getCharacter() {
			return character;
		}

		public boolean setCharacter(PlayerCharacter character) {
			if(this.isWall) {
				return false;
			}
			this.character = character;
			return true;
		}

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		public boolean isWall() {
			return isWall;
		}

		public boolean setWall(boolean isWall) {
			if(getCharacter() != null || getMonster() != null) {
				return false;
			}
			this.isWall = isWall;
			return true;
		}

		public Monster getMonster() {
			return monster;
		}

		public boolean setMonster(Monster monster) {
			if(this.isWall) {
				return false;
			}
			this.monster = monster;
			return true;
		}
}
