package dbscan;

public class Point {
	private int id;
	private double[] v;
	private boolean isCore = false; //0 represent core, 1 represent border
	public Point() {
		
	}
	public Point(int id, double[] v) {
		this.id = id;	
		this.v = v;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}

	public boolean getIsCore() {
		return isCore;
	}
	public void setIsCore(boolean isCore) {
		this.isCore = isCore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double[] getV() {
		return v;
	}
}
