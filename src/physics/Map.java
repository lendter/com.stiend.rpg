package physics;

import java.util.ArrayList;
import java.util.List;

public class Map {
	private int size;
	private List<Lane> lanes;
	
	public Map(int size) {
		this.lanes = new ArrayList<>();
		fillLanes();
	}
	
	private void fillLanes() {
		for(int i = 0; i < size; i++) {
			lanes.add(new Lane(size));
		}
	}
	
}
