package gameprocess;

import java.util.ArrayList;
import java.util.List;

import character.PlayerCharacter;
import physics.Direction;
import physics.Map;
import physics.Position;

public class PlayRound {
	private Map map;
	
	public PlayRound(Map map) {
		this.setMap(map);
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}
	
	public List<Position> getAvailableMoves(PlayerCharacter character){
		List<Position> availablePositions = new ArrayList<>();
		Position currentPosition = character.getPosition();
		Position nextWallX = map.getNextWall(currentPosition, Direction.X);
		Position nextWallY = map.getNextWall(currentPosition, Direction.Y);
		int xBound = 3;
		int yBound = 3;
		if(nextWallX != null) {
			xBound = nextWallX.getX();
		}
		if(nextWallY != null) {
			yBound = nextWallY.getY();
		}
		for(int i = 0; i < xBound; i++) {
			for(int j = 0; j <= yBound; j++) {
				availablePositions.add(new Position(i, j));
			}
		}
		return availablePositions;
	}
}
