package physics;

import character.PlayerCharacter;

public class MapLane {
	private PlayerCharacter[] lane;
	
	public MapLane(int size) {
		this.lane = new PlayerCharacter[size];
	}

	public PlayerCharacter[] getLane() {
		return lane;
	}
}
