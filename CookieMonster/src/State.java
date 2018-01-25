
public class State {

	private int row, col, val, sum;
	private String path;
	public State(int row, int col, int val, int sum, String path) {
		super();
		this.row = row;
		this.col = col;
		this.val = val;
		this.sum = sum;
		this.path = path;
	}
	
	@Override
	public String toString() {
		return "State [row=" + row + ", col=" + col + ", val=" + val + ", sum=" + sum + ", path=" + path + "]";
	}

	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public int getVal() {
		return val;
	}
	public int getSum() {
		return sum;
	}
	public String getPath() {
		return path;
	}
	
	
	
}
