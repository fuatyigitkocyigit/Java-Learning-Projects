import java.awt.Point;
import java.util.ArrayList;

public class ShapeGroup {
	public ArrayList<Shape> shapes = new ArrayList<Shape>();
	public Point groupLeftTop;
	public double totalPerimeter;
	
	public void addShape(Shape shapeA) {
		shapes.add(shapeA);
		this.totalPerimeter = this.totalPerimeter + shapeA.perimeter;
		findLeftTop();
	}
	
	public void removeShape(int indexA) {
		this.totalPerimeter = this.totalPerimeter - shapes.get(indexA).perimeter;
		shapes.remove(indexA);
		findLeftTop();
	}
	
	public void moveGroup(int xA,int yA) {
		Shape shapesA = null;
		for(int i=0; i<shapes.size(); i++) {
			shapesA = shapes.get(i);
			shapesA.move(xA+(shapesA.leftTop.x-groupLeftTop.x) , yA+(shapesA.leftTop.y-groupLeftTop.y));
		}
		groupLeftTop = new Point (xA,yA);
	}
	
	public Shape getShape(int indexA) {
		return shapes.get(indexA);
	}
	
	public void findLeftTop() {
		int maxx = 99999999;
		int maxy = 99999999;
		Shape shapesA = null;
		for(int i=0; i<shapes.size(); i++) {
			shapesA = shapes.get(i);
			if(shapesA.leftTop.x < maxx)
				maxx = shapesA.leftTop.x;
			if(shapesA.leftTop.y < maxy)
				maxy = shapesA.leftTop.y;
		}
		groupLeftTop = new Point(maxx,maxy);
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

	public Point getGroupLeftTop() {
		return groupLeftTop;
	}

	public void setGroupLeftTop(Point groupLeftTop) {
		this.groupLeftTop = groupLeftTop;
	}

	public double getTotalPerimeter() {
		return totalPerimeter;
	}

	public void setTotalPerimeter(double totalPerimeter) {
		this.totalPerimeter = totalPerimeter;
	}

	public String toString() {
		String result = "Left Top Point: x: " + groupLeftTop.x + ", y: " + groupLeftTop.y +"\nTotal Perimeter: "+this.totalPerimeter;
		Shape shapesA = null;
		for(int i=0; i<shapes.size(); i++) {
			shapesA = shapes.get(i);
			result = result + "\nShape " + (i+1) + ":\n" +shapesA.toString();
		}
		return result;
	}
}