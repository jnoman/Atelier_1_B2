package exercice1;

public class Point {
	private int x, y;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int X,int Y) {
		this.setX(X);
		this.setY(Y);
	}
	public void calculDistance(int x2,int y2) {
		System.out.printf("la destance entre les deux point et :" + Math.sqrt((float)Math.pow((this.x-x2),2)+(float)Math.pow((this.y-y2),2)));
	}
}
