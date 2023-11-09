package physics;

import character.PlayerCharacter;
import items.Item;

public class Field {
	
		private Item item;
		private PlayerCharacter character;
		private boolean isWall;

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
}
