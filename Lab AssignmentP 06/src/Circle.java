import java.awt.Point;
import java.util.ArrayList;

public class Circle extends Shape{
	public int radius;
	
	public Circle(Point leftTopA, int radiusA) {
		super(leftTopA, true);
		this.radius = radiusA;
		
		this.perimeter = (Math.round((2*Math.PI*radius)*10))/10.0;
		
		this.area = (Math.round((Math.PI*radius*radius)*10))/10.0;
		
		this.points = new ArrayList<Point>();
		this.points.add(this.leftTop);
		this.points.add(new Point(this.leftTop.x+(radius*2),this.leftTop.y+(radius*2)));
	}

	public void calculatePoints() {
		this.points = new ArrayList<Point>();
		this.points.add(this.leftTop);
		this.points.add(new Point(this.leftTop.x+(radius*2),this.leftTop.y+(radius*2)));
	}

	public double calculatePerimeter() {
		this.perimeter = (Math.round((2*Math.PI*radius)*10))/10.0;
		//double perimeter2 = (Math.round((perimeter)*10))/10;
		return this.perimeter;
	}

	public double calculateArea() { 
		this.area = (Math.round((Math.PI*radius*radius)*10))/10.0;
		//double area2 = (Math.round((area)*10))/10;
		return this.area;
	}

	public void move(int xA, int yA) {
		this.leftTop = new Point(xA,yA);
		this.calculatePoints();
	}
	
	public String toString() {
		String result = "Circle[r=" + radius + "]\nPoints[(" + this.points.get(0).x + "," + this.points.get(0).y + ")("+this.points.get(1).x + ","+this.points.get(1).y + ")]\nArea=" + this.area + "\nPerimeter=" + this.perimeter;
		return result;
	}
}