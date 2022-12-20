import java.awt.Point;
import java.util.ArrayList;

public abstract class Shape implements Movable{
	public Point leftTop;
	public boolean isCircular=false;
	public ArrayList<Point> points = new ArrayList<Point>();
	public double area;
	public double perimeter;
	
	public Shape(Point leftTopA, boolean isCircularA) {
		this.leftTop = leftTopA;
		this.isCircular = isCircularA;
	}
	
	public void calculatePoints() {
		
	}
	public double calculateArea() {
		return area;
	}
	public double calculatePerimeter() {
		return perimeter;
	}
	
	public void move(int newx, int newy) {
		
	}

	public Point getLeftTop() {
		return leftTop;
	}

	public void setLeftTop(Point leftTop) {
		this.leftTop = leftTop;
	}

	public boolean isCircular() {
		return isCircular;
	}

	public void setCircular(boolean isCircular) {
		this.isCircular = isCircular;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public String toString() {
		return super.toString();
	}
}