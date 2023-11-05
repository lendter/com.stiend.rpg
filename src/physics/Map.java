package physics;

public class Map {
	private int size;
	private MapLane[] lanes;
	
	public Map(int size) {
		this.lanes = new MapLane[size];
		fillLanes();
	}
	
	private void fillLanes() {
		for(int i = 0; i < size; i++) {
			lanes[i] = new MapLane(size);
		}
	}
	
}
