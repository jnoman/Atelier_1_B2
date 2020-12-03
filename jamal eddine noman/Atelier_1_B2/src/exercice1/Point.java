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
	public void calculDistance() {
		System.out.println("la distance entre les 2 points est : " + Math.abs(this.getY()-this.getX()));
	}
}
