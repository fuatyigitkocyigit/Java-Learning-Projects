import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
	static int theyear = 2020;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Course> Course = new ArrayList();
		ArrayList<Member> Member = new ArrayList();
		ArrayList CourseID = new ArrayList();
		ArrayList MemberID = new ArrayList();
		
		System.out.println("Program Year: "+theyear);
		while(true) {
			
			String inputall = keyboard.nextLine();
			int length = inputall.length();
			
			if(length<=4) {
				if(inputall.equals("exit")) ////exit
					System.exit(0);
				else
					continue;
			}
			
				int split1 = inputall.indexOf(";");
				String input1 = inputall.substring(0,split1); ////create, assign, report..... 
				String inputallv2 = inputall.substring(split1+1);
				
			switch(input1) {
			case"create": {
				
				int split2 = inputallv2.indexOf(";");
				String input2 = inputallv2.substring(0,split2).toLowerCase(); ////create......
				String inputallv3 = inputallv2.substring(split2+1);
				
				switch(input2){
				case "course": {
					boolean already = false;
					int split3 = inputallv3.indexOf(";");
					String input3 = inputallv3.substring(0,split3); ////course code
					String inputallv4 = inputallv3.substring(split3+1);
					
					for (int i=0; i<CourseID.size(); i++) {
						if(CourseID.get(i).equals(input3))
							already = true;
					}
					
					if(already==true) {
						System.out.println("A course with code "+input3+" already exists.");
					}
					else {
						int split4 = inputallv4.indexOf(";");
						String input4 = inputallv4.substring(0,split4); ////course name
						String inputallv5 = inputallv4.substring(split4+1);
						
						int split5 = inputallv5.indexOf(";");
						String input5 = inputallv5.substring(0,split5); ////year
						String inputallv6 = inputallv5.substring(split5+1);
						
						int split6 = inputallv6.indexOf(";");
						String input6 = inputallv6.substring(0,split6); ////semester
						String inputallv7 = inputallv6.substring(split6+1);
						
						//int split7 = inputallv7.indexOf(";");
						String input7 = inputallv7; ////capacity
						//String inputallv8 = inputallv7.substring(split7+1);
					
						Course addC = new Course(input3, input4, input5, input6, input7);
						Course.add(addC);
						CourseID.add(input3);
						System.out.println("success");
					}
					break;
				}
				// //
				case "instructor": {
					boolean already = false;
					int split3 = inputallv3.indexOf(";");
					String input3 = inputallv3.substring(0,split3); ////name
					String inputallv4 = inputallv3.substring(split3+1);
					
					int split4 = inputallv4.indexOf(";");
					String input4 = inputallv4.substring(0,split4); ////id
					String inputallv5 = inputallv4.substring(split4+1);
					
					int split5 = inputallv5.indexOf(";");
					String input5 = inputallv5.substring(0,split5); ////officenumber
					String inputallv6 = inputallv5.substring(split5+1);
					
					//int split6 = inputallv6.indexOf(";");
					String input6 = inputallv6; ////title
					//String inputallv7 = inputallv6.substring(split6+1);
					
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input4))
							already = true;
					}
					if(already==true)
						System.out.println("A person with ID "+input4+" already exists.");
					else {
						Member addM = new Instructor(input3, input4, input5, input6);
						Member.add(addM);
						MemberID.add(input4);
						System.out.println("success");
					}
					break;
				}
				// //
				case "student": {
					boolean already = false;
					int split3 = inputallv3.indexOf(";");
					String input3 = inputallv3.substring(0,split3); ////name
					String inputallv4 = inputallv3.substring(split3+1);
					
					int split4 = inputallv4.indexOf(";");
					String input4 = inputallv4.substring(0,split4); ////id
					String inputallv5 = inputallv4.substring(split4+1);
					
					//int split5 = inputallv5.indexOf(";");
					String input5 = inputallv5; ////year
					//String inputallv6 = inputallv5.substring(split5+1);
					
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input4))
							already = true;
					}
					
					if(already==true)
						System.out.println("A person with ID "+input4+" already exists.");
					else {
						Member addMS = new Student(input3, input4, input5);
						Member.add(addMS);
						MemberID.add(input4);
						System.out.println("success");
					}
					break;
				}
				// //
				case "ta": {
					boolean already = false;
					int split3 = inputallv3.indexOf(";");
					String input3 = inputallv3.substring(0,split3); ////name
					String inputallv4 = inputallv3.substring(split3+1);
					
					int split4 = inputallv4.indexOf(";");
					String input4 = inputallv4.substring(0,split4); ////id
					String inputallv5 = inputallv4.substring(split4+1);
					
					int split5 = inputallv5.indexOf(";");
					String input5 = inputallv5.substring(0,split5); ////officenumber
					String inputallv6 = inputallv5.substring(split5+1);
					
					//int split6 = inputallv6.indexOf(";");
					String input6 = inputallv6; ////degree
					//String inputallv7 = inputallv6.substring(split6+1);
					
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input4))
							already = true;
					}
					
					if(already==true)
						System.out.println("A person with ID "+input4+" already exists.");
					else {
						Member addMT = new TeachingAssistant(input3, input4, input5, input6);
						Member.add(addMT);
						MemberID.add(input4);
						System.out.println("success");
					}
					break;
				}
				// //
				case "ra":{
					
					
					
					
					break;
				}
				// //
				default: {
					System.out.println("Unknown command");
					break;
				}
				}
				break;
			}
			
			// // //
			
			case "report": {
				
				int split2 = inputallv2.indexOf(";");
				String input2 = inputallv2.substring(0,split2).toLowerCase(); ////report......
				String inputallv3 = inputallv2.substring(split2+1);
				
				//int split3 = inputallv3.indexOf(";");
				String input3 = inputallv3; ////course code
				//String inputallv4 = inputallv3.substring(split3+1);
				
				switch(input2) {
				case "course": {
					for (int i=0; i<CourseID.size(); i++) {
						if(CourseID.get(i).equals(input3))
							System.out.println(Course.get(i).toString());
					}
					break;
				}
				// //
				case "instructor": {
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input3))
							System.out.println(Member.get(i).toString());
					}
					break;
				}
				// //
				case "student": {
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input3))
							System.out.println(Member.get(i).toString());
					}
					break;
				}
				// //
				case "ta": {
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input3))
							System.out.println(Member.get(i).toString());
					}
					break;
				}
				// //
				case "ra":{
					
					
					
					
					break;
				}
				// //
				default: {
					System.out.println("Unknown command");
					break;
				}
				}
				break;
			}
			
			// // //
			
			case "assign": {
				
				int split2 = inputallv2.indexOf(";");
				String input2 = inputallv2.substring(0,split2).toLowerCase(); ////type
				String inputallv3 = inputallv2.substring(split2+1);
				
				int split3 = inputallv3.indexOf(";");
				String input3 = inputallv3.substring(0,split3); ////id
				String inputallv4 = inputallv3.substring(split3+1);
				
				//int split4 = inputallv4.indexOf(";");
				String input4 = inputallv4; ////course where
				
				switch(input2){
					case "instructor": {
					Course CourseM=null;
					for (int i=0; i<CourseID.size(); i++) {
						if(CourseID.get(i).equals(input4))
							CourseM = Course.get(i);
					}
					
					if(CourseM.getLecturer()==null) {
						for (int i=0; i<MemberID.size(); i++) {
							if(MemberID.get(i).equals(input3))
								Member.get(i).assignCourse(CourseM);
						}
					}
					else {
						System.out.println("Instructor "+CourseM.getLecturer().getTitle()+" "+CourseM.getLecturer().getName()+" is already teaching "+CourseM.getCourseCode()+" - "+CourseM.getCourseName()+".");
					}
					break;
				}
				// //
					case "ýnstructor": {
						Course CourseM=null;
						for (int i=0; i<CourseID.size(); i++) {
							if(CourseID.get(i).equals(input4))
								CourseM = Course.get(i);
						}
						
						if(CourseM.getLecturer()==null) {
							for (int i=0; i<MemberID.size(); i++) {
								if(MemberID.get(i).equals(input3))
									Member.get(i).assignCourse(CourseM);
							}
						}
						else {
							System.out.println("Instructor "+CourseM.getLecturer().getTitle()+" "+CourseM.getLecturer().getName()+" is already teaching "+CourseM.getCourseCode()+" - "+CourseM.getCourseName()+".");
						}
						break;
					}
				// //
					case "student": {
					Course CourseM=null;
					for (int i=0; i<CourseID.size(); i++) {
						if(CourseID.get(i).equals(input4))
							CourseM = Course.get(i);
					}
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input3))
							Member.get(i).assignCourse(CourseM);
					}
					break;
				}
				// //
					case "ta": {
					Course CourseM=null;
					for (int i=0; i<CourseID.size(); i++) {
						if(CourseID.get(i).equals(input4))
							CourseM = Course.get(i);
					}
					for (int i=0; i<MemberID.size(); i++) {
						if(MemberID.get(i).equals(input3))
							Member.get(i).assignCourse(CourseM);
					}
					break;
				}
				// //
					default: {
					System.out.println("Unknown command");
					break;
				}
				}
				break;
			}
			
			// // //
			 
			case "change": {
				
				int split2 = inputallv2.indexOf(";");
				String input2 = inputallv2.substring(0,split2); ////what
				String inputallv3 = inputallv2.substring(split2+1);
				
				//int split3 = inputallv3.indexOf(";");
				String input3 = inputallv3; ////new
				//String inputallv4 = inputallv3.substring(split3+1);
				
				if(input2.equals("year")) {
					int newyear = Integer.parseInt(input3);
					theyear = newyear;
					System.out.println("success");
					System.out.println("Program Year: "+theyear);
				}
				else
					System.out.println("Unknown command");
				break;
			}
			
			// // //
			
			default: {
				System.out.println("Unknown command");
				break;
			}
			}
		}
		
	}

}
