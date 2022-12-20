import java.awt.Point;
import java.util.ArrayList;

public class Rectangle extends Shape{
	public int height;
	public int width;
	
	public Rectangle(Point leftTopA,int heightA, int widthA) {
		super(leftTopA,false);
		this.height = heightA;
		this.width = widthA;
		
		this.perimeter = 2*(width+height);
		
		this.area = width*height;
		
		this.points = new ArrayList<Point>();
		this.points.add(this.leftTop);
		this.points.add(new Point(this.leftTop.x+width,this.leftTop.y));//right top
		this.points.add(new Point(this.leftTop.x+width,this.leftTop.y+height));//right bottom
		this.points.add(new Point(this.leftTop.x,this.leftTop.y+height));//left bottom
		
	}

	public void calculatePoints() {
		this.points = new ArrayList<Point>();
		this.points.add(this.leftTop);
		this.points.add(new Point(this.leftTop.x+width,this.leftTop.y));//right top
		this.points.add(new Point(this.leftTop.x+width,this.leftTop.y+height));//right bottom
		this.points.add(new Point(this.leftTop.x,this.leftTop.y+height));//left bottom
	}

	public double calculatePerimeter() {
		this.perimeter = 2*(width+height);
		return this.perimeter;
	}

	public double calculateArea() {
		this.area = width*height;
		return this.area;
	}

	public void move(int xA, int yA) {
		this.leftTop = new Point(xA,yA);
		this.calculatePoints();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public String toString() {
		String result = "Rectangle[h=" + height + ",w=" + width + "]\nPoints[(" + this.points.get(0).x + ","+this.points.get(0).y + ")(" + this.points.get(1).x + ","+this.points.get(1).y + ")("+this.points.get(2).x + ","+this.points.get(2).y + ")("+this.points.get(3).x + ","+this.points.get(3).y + ")]\nArea=" + this.area+"\nPerimeter=" + this.perimeter;
		return result;
	}
}