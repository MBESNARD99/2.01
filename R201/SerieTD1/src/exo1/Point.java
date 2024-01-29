package exo1;
public class Point {

	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
		
	}
	public Point(Point p2) {
		this(p2.x,p2.y);
	}
	
	public void affiche() {
		System.out.println("(" + x + "," + y+ ")");
	}
}
