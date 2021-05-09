import java.lang.Math;

public class Retangulo implements ObjetoGeometrico {
	private Ponto2D p1, p2;
	
	Retangulo(Ponto2D p1, Ponto2D p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public Ponto2D centro() {
		// TODO Auto-generated method stub
		return new Ponto2D(((p1.getX()+p2.getX())/2),((p1.getY()+p2.getY())/2));
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		double ladoX = Math.abs(p1.getX()-p2.getX());
		double ladoY = Math.abs(p1.getY()-p2.getY());
		return ladoX*ladoY;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		double ladoX = Math.abs(p1.getX()-p2.getX());
		double ladoY = Math.abs(p1.getY()-p2.getY());
		return 2.0*ladoX+2.0*ladoY;
	}
	
	public String toString() {
		return "Retangulo com cantos " + p1 + " e " + p2;
	}

}
