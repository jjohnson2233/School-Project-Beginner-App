
import java.util.ArrayList;
import java.util.Iterator;

public class Roster {

	static ArrayList<Student> listOfStudents = new ArrayList<Student>();
	
	public static void remove(String studentID)
	{
		boolean found = false;
		Iterator<Student> iter = listOfStudents.iterator();

		while (iter.hasNext()) 
		{
		    Student student = iter.next();
		    if (student.getID() == studentID)
		    {
		        iter.remove();
		        found = true;
		    }
		}
		
		if (found == false)
		{
			System.out.println("There are no students on record with this ID");
		}
	}
	
	public static void print_all()
	{
		for(Student student : listOfStudents)
		{
			String newline = System.getProperty("line.separator");
			student.print("id");
			System.out.print("\t First Name: ");
			student.print("firstName");
			System.out.print("\t Last Name: ");
			student.print("lastName");
			System.out.print("\t Age: ");
			student.print("age");
			System.out.print("\t Grades: ");
			student.print("grades");
			System.out.print(newline);
		}
	}
	
	public static void print_average_grade(String studentID)
	{
		boolean found = false;
		for (Student student : listOfStudents)
		{
			if (student.getID() == studentID)
			{
				double sum = 0;
				for (double grade : student.grades)
				{
					sum += (double)grade;
				}
				double average = sum / student.grades.size();
				found = true;
				System.out.println(average);
			}
		}
		if (found == false)
		{
			System.out.println("There are no students on record with this ID");
		}
	}
	
	public static void print_invalid_emails()
	{
		for (Student student : listOfStudents)
		{
			if (student.getEmailAddress().contains(" ") || !student.getEmailAddress().contains("@") || !student.getEmailAddress().contains("."))
			{
				System.out.println(student.getEmailAddress());
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> johnsGrades = new ArrayList<Integer>();
		johnsGrades.add(88);
		johnsGrades.add(79);
		johnsGrades.add(59);
		Student john = new Student("1", "John", "Smith", "John1989@gmail.com", 20, johnsGrades);
		listOfStudents.add(john);
		
		ArrayList<Integer> suzansGrades = new ArrayList<Integer>();
		suzansGrades.add(91);
		suzansGrades.add(72);
		suzansGrades.add(85);
		Student suzan = new Student("2", "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, suzansGrades);
		listOfStudents.add(suzan);
		
		ArrayList<Integer> jacksGrades = new ArrayList<Integer>();
		jacksGrades.add(85);
		jacksGrades.add(84);
		jacksGrades.add(87);
		Student jack = new Student("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, jacksGrades);
		listOfStudents.add(jack);
		
		ArrayList<Integer> erinsGrades = new ArrayList<Integer>();
		erinsGrades.add(91);
		erinsGrades.add(98);
		erinsGrades.add(82);
		Student erin = new Student("4", "Erin", "Black", "Erin.black@comcast.net", 22, erinsGrades);
		listOfStudents.add(erin);
		
		ArrayList<Integer> jaredsGrades = new ArrayList<Integer>();
		jaredsGrades.add(81);
		jaredsGrades.add(72);
		jaredsGrades.add(68);
		Student jared = new Student("5", "Jared", "Johnson", "jjoh347@wgu.edu", 23, jaredsGrades);
		listOfStudents.add(jared);
		
		print_all();
		print_invalid_emails();
		for (Student student : listOfStudents)
		{
			print_average_grade(student.getID());
		}
		remove("3");
		remove("3");
		//expected: this should print a message saying such a student with this ID was not found.
	}
}