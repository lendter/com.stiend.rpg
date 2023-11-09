package physics;

import java.util.ArrayList;
import java.util.List;

public class Lane {
	private List<Field> lane;
	
	public Lane(int size) {
		this.lane = new ArrayList<>();
		fillLane(size);
	}
	
	public List<Field> getLane() {
		return lane;
	}
	
	private void fillLane(int size) {
		for(int i = 0; i < size; i++) {
			lane.add(new Field());
		}
	}
}
