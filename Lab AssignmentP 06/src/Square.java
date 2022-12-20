import java.awt.Point;
import java.util.ArrayList;

public class Square extends Shape{
	public int edge;
	
	public Square(Point leftTopA,int edgeA) {
		super(leftTopA,false);
		this.edge = edgeA;
		
		this.perimeter = 4*edge;
		
		this.area = edge*edge;
		
		this.points = new ArrayList<Point>();
		this.points.add(this.leftTop);
		this.points.add(new Point(this.leftTop.x+edge,this.leftTop.y)); //right top
		this.points.add(new Point(this.leftTop.x+edge,this.leftTop.y+edge));//right bottom
		this.points.add(new Point(this.leftTop.x,this.leftTop.y+edge));// left bottom
	}

	public void calculatePoints() {
		this.points = new ArrayList<Point>();
		this.points.add(this.leftTop);
		this.points.add(new Point(this.leftTop.x+edge,this.leftTop.y)); //right top
		this.points.add(new Point(this.leftTop.x+edge,this.leftTop.y+edge));//right bottom
		this.points.add(new Point(this.leftTop.x,this.leftTop.y+edge));// left bottom
	}

	public double calculatePerimeter() {
		this.perimeter = 4*edge;
		return this.perimeter;
	}

	public double calculateArea() {
		this.area = edge*edge;
		return this.area;
	}

	public void move(int xA, int yA) {
		this.leftTop =new Point(xA,yA);
		this.calculatePoints();
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}

	public String toString() {
		String result = "Square[e=" + edge + "]\nPoints[(" + this.points.get(0).x + "," + this.points.get(0).y + ")(" + this.points.get(1).x + ","+this.points.get(1).y + ")("+this.points.get(2).x + ","+this.points.get(2).y + ")("+this.points.get(3).x + "," + this.points.get(3).y + ")]\nArea=" + this.area + "\nPerimeter=" + this.perimeter;
		return result;
	}
}