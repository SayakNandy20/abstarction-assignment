package parentandchild;
import java.lang.Math.*;

public class Sphere1 extends Shape1{
	private int radius;
	

	public Sphere1(int radius) {
		super();
		this.radius = radius;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		double Voluume=(Math.PI*4*radius*radius*radius)/3;
		return Voluume;
	}
	

}
