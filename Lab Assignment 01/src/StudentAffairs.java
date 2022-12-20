import java.util.Scanner;

public class StudentAffairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Course[] courseM = new Course[100];
		Student studentM[] = new Student[100];
		int count = 0, co = 0, ccount = 0, cco = 0;

		System.out.print("Enter a command: ");
		String input = keyboard.next();

		while (!input.equals("Q")) {
			switch(input) {
		case "createStudent":{
			
		String nameM = keyboard.next();
		String IDM = keyboard.next();
		studentM[count] = new Student(nameM, IDM);
		System.out.println("Student " + studentM[count].toString() + " successfully added.");
		count++;
		break;
		}

		case "addGradeStudent":{

		String IDM = keyboard.next();
		String addgradeM = keyboard.next();
		for (int i = 0; i < count; i++)
			if ((studentM[i].getStudentID()).equals(IDM)) 
				co = i;
		boolean add = studentM[co].addGrade(addgradeM);
		if (add == true) 
			System.out.println("Success");
		else
			System.out.println("Capacity(4) reached.");
		break;
		}
		
		case "removeGradeStudent": {
			
			String IDM = keyboard.next();
			int indexM = keyboard.nextInt();
			for (int i = 0; i < count; i++)
				if ((studentM[i].getStudentID()).equals(IDM))
					co = i;
			boolean remove = studentM[co].removeGrade(indexM);
			if (remove == true)
				System.out.println("Success");
			else
				System.out.println("Grade count already zero or wrong index ");
			break;
			}

		case "averageGradeStudent":{
			
		String IDM = keyboard.next();
		for (int i = 0; i < count; i++)
			if ((studentM[i].getStudentID()).equals(IDM)) 
				co = i;
		System.out.println("Average Grade of Student " + studentM[co].toString() + " is " + studentM[co].averageGrade());
		break;
		}

		case "printGradesStudent":{
			
		String IDM = keyboard.next();
		for (int i = 0; i < count; i++)
			if ((studentM[i].getStudentID()).equals(IDM)) 
				co = i;
		System.out.println("Grades of Student " + studentM[co].toString() + ": "+studentM[co].printGrades());
		break;
		}

		case "createCourse": {
		
		String coursecodeM = keyboard.next();
		int capacityM = keyboard.nextInt();
		String dayM = keyboard.next();
		int studentcountM = keyboard.nextInt();
		double averageM = keyboard.nextDouble();
		courseM[ccount] = new Course(coursecodeM, capacityM, dayM, studentcountM, averageM); //string int string int double//
		System.out.println("Course " + courseM[ccount].toString() + " successfully added.");
		ccount++;
		break;
		}

		case "addGradeCourse": {

		String coursecodeM = keyboard.next();
		double addgradeM = keyboard.nextDouble();
		for (int i = 0; i < ccount; i++)
			if ((courseM[i].getCourseCode()).equals(coursecodeM))
				cco = i;
		boolean add = courseM[cco].addGrade(addgradeM);
		if (add == true) 
			System.out.println("Success");
		else
			System.out.println("Capacity(" + courseM[cco].getCapacity() + ") reached.");
		break;
		}

		case "removeGradeCourse": {
			
		String coursecodeM = keyboard.next();
		double removegradeM = keyboard.nextDouble();
		for (int i = 0; i < ccount; i++)
			if ((courseM[i].getCourseCode()).equals(coursecodeM))
				cco = i;
		boolean remove = courseM[cco].removeGrade(removegradeM);
		if (remove == true)
			System.out.println("Success");
		else
			System.out.println("Number of student in course is already 0 ");
		break;
		} 
		
		case "averageGradeCourse": {
			
		String coursecodeM = keyboard.next();
		for (int i = 0; i < ccount; i++)
			if ((courseM[i].getCourseCode()).equals(coursecodeM))
				cco = i;
		System.out.println("Average Grade of Course " + courseM[cco].toString() + " is " + courseM[cco].getAverageGrade());
		break;
		}
		}
		
		System.out.print("Enter a command: ");
		input = keyboard.next();

		
		}
	}

}
