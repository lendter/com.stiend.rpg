package physics;

public class Map {
	private int size;
	private Field[][] fields;
	
	public Map(int size) {
		this.fields = new Field[size][size];;
		fillLanes();
	}
	
	private void fillLanes() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				fields[i][j] = new Field();
			}
		}
	}
	
}
