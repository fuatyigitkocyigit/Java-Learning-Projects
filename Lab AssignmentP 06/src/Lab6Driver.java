import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

//Draws simple shapes
public class Lab6Driver {
	
	public static void main(String[] args) {
		//TODO: Implement your own Shape class according to the Lab3 description
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		ArrayList<ShapeGroup> shapeGroups = new ArrayList<ShapeGroup>();
		ShapeGroup universalShapes = new ShapeGroup();
		shapeGroups.add(universalShapes);
		//GRAPHICS: The next line will be removed or commented out before submission to Moodle, we will provide
		//and talk about the DrawingTool class during lab hours to introduce graphics support
		//DrawingTool window = new DrawingTool(shapeGroups);
			
		Scanner scan = new Scanner(System.in);
		String userCommand = "";
				
		while (! userCommand.equalsIgnoreCase("exit")) {
			System.out.println("Enter the command: ");
			userCommand = scan.nextLine();

			String [] parameters = userCommand.split(" ");
			String command = parameters[0];
			
			if (command.equals("addR")) {
				//Read parameters and create a Rectangle object
				int x = Integer.parseInt(parameters[1]);
				int y = Integer.parseInt(parameters[2]);
				
				Point pointA = new Point(x,y);
				
				int heightA = Integer.parseInt(parameters[3]);
				int widthA = Integer.parseInt(parameters[4]);
				
				Rectangle rectangleA = new Rectangle(pointA, heightA, widthA);
				
				//Add the object to the shapes list
				shapes.add(rectangleA);
				universalShapes.addShape(rectangleA);//
				
				// Print the object
				System.out.println(rectangleA.toString());
			}
			else if (command.equals("addS")) {
				//Read parameters and create a Square object
				int x = Integer.parseInt(parameters[1]);
				int y = Integer.parseInt(parameters[2]);
				
				Point pointA = new Point(x,y);
				
				int edgeA = Integer.parseInt(parameters[3]);
				
				Square squareA = new Square(pointA, edgeA);
				
				//Add the object to the shapes list
				shapes.add(squareA);
				universalShapes.addShape(squareA);//
				
				// Print the object
				System.out.println(squareA.toString());			
			}
			else if (command.equals("addC")) {
				//Read parameters and create a Circle object
				int x = Integer.parseInt(parameters[1]);
				int y = Integer.parseInt(parameters[2]);
				
				Point pointA = new Point(x,y);
				
				int radiusA = Integer.parseInt(parameters[3]);
				
				Circle circleA = new Circle(pointA, radiusA);
				
				//Add the object to the shapes list
				shapes.add(circleA);
				universalShapes.addShape(circleA);//
				
				// Print the object
				System.out.println(circleA.toString());					
			}
			else if (command.equals("move")) {
				//Read parameters
				int shapeNum = Integer.parseInt(parameters[1]);
				int x = Integer.parseInt(parameters[2]);
				int y = Integer.parseInt(parameters[3]);
				
				shapes.get(shapeNum-1).move(x,y);
				
				//Implement your own Movable interface according to the Lab4 example
			
				//??? gerekli mi
				
				//Move the object by calling the move method				
				
				//??? gerekli mi
				
				//Print the object
				System.out.println(shapes.get(shapeNum-1).toString());
			}
			else if (command.equals("createEmptyGroup")) {
				ShapeGroup newShapeGroup = new ShapeGroup();
				shapeGroups.add(newShapeGroup);
				
				System.out.println("New Group Added.");
			}
			else if (command.equals("addToGroup")) {
				int groupNum = Integer.parseInt(parameters[1]);
				int shapeNum = Integer.parseInt(parameters[2]);
				
				shapeGroups.get(groupNum).addShape(shapes.get(shapeNum-1));
				
				shapes.remove(shapeNum-1);
				universalShapes.removeShape(shapeNum-1);
				
				System.out.println(shapeGroups.get(groupNum).toString());
			}
			else if (command.equals("moveGroup")) {
				int groupNum = Integer.parseInt(parameters[1]);
				int x = Integer.parseInt(parameters[2]);
				int y = Integer.parseInt(parameters[3]);
				
				shapeGroups.get(groupNum).moveGroup(x,y);
				
				System.out.println(shapeGroups.get(groupNum).toString());
			}
			else if (command.equals("switchGroup")) {
				int firstGroupNum = Integer.parseInt(parameters[1]);
				int newGroupNum = Integer.parseInt(parameters[2]);
				int shapeNum = Integer.parseInt(parameters[3]);
				
				ShapeGroup first = shapeGroups.get(firstGroupNum);
				ShapeGroup second = shapeGroups.get(newGroupNum);
				
				second.addShape(first.shapes.get(shapeNum-1));
				first.removeShape(shapeNum-1);

				System.out.println(shapeGroups.get(newGroupNum).toString());
				System.out.println(shapeGroups.get(firstGroupNum).toString());
			}
			else if (command.equals("mergeGroups")) {
				int firstGroupNum = Integer.parseInt(parameters[1]);
				int secondGroupNum = Integer.parseInt(parameters[2]);
				
				int biggerNum = Math.max(firstGroupNum, secondGroupNum);
				int smallerNum = Math.min(firstGroupNum, secondGroupNum);
				
				ShapeGroup shapeGroupB = shapeGroups.get(biggerNum);
				ShapeGroup shapeGroupS = shapeGroups.get(smallerNum);
				
				Shape shapesA=null;
				for(int i=0; i<shapeGroupB.shapes.size(); i++) {
					shapesA = shapeGroupB.shapes.get(i);
					shapeGroupS.addShape(shapesA);
				}
				shapeGroups.remove(biggerNum);
				
				System.out.println(shapeGroupS);
			}
			
			//GRAPHICS: The next line will be removed or commented out before submission to Moodle
			//window.repaint();
			
		}		
		scan.close();
		System.exit(0);
	}

}