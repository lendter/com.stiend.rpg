package physics;

public class Map {
	private int size;
	private Field[][] fields;
	
	public Map() {}
	
	public Map(int size) {
		this.size = size;
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
	
	public void setFields(Field[][] fields) {
		this.fields = fields;
	}
	
	public Field[][] getFields(){
		return fields;
	}
	
	public void setSize(int size) {
		this.size = size;
		setFields(new Field[size][size]);
		fillLanes();
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Field getField(Position position) {
		return fields[position.getY()][position.getX()];
	}

	public Field getField(int x, int y) {
		return fields[x][y];
	}
	
	public Position getNextWall(Position position, Direction direction) {
		switch(direction) {
		case X:
			for(int i = 0; i < 3; i++) {
				if(getField(i, position.getY()).isWall()) {
					return new Position(i, position.getY());
				}
			}
			break;
		case Y:
			for(int i = 0; i < 3; i++) {
				if(getField(position.getX(), i).isWall()) {
					return new Position(position.getY(), i);
				}
			}
			break;
		}
		return null;
	}
}
