
public class Ponto2D {
	double x, y;
	
	Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return x;
	}

	double getY() {
		return y;
	}
	
	public String toString() {
		return x + "," + y;
	}
}
