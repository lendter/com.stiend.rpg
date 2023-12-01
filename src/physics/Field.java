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

		public void setCharacter(PlayerCharacter character) {
			this.character = character;
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

		public void setWall(boolean isWall) {
			this.isWall = isWall;
		}

		public Monster getMonster() {
			return monster;
		}

		public void setMonster(Monster monster) {
			this.monster = monster;
		}
}
