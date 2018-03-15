import java.util.ArrayList;
public class Student 
{
	
	String studentID;
	String firstName;
	String lastName;
	String emailAddress;
	int age;
	ArrayList<Integer> grades = new ArrayList<Integer>();
	
	Student(String studentID, String firstName, String lastName, String emailAddress,
				   int age, ArrayList<Integer> grades)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.grades = grades;
	}
	
	public String getID()
	{
		return studentID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public ArrayList<Integer> getGrades()
	{
		return grades;
	}
	
	public void setID(String id)
	{
		studentID = id;
	}
	
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public void setEmailAddress(String email)
	{
		emailAddress = email;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGrades(ArrayList<Integer> grades)
	{
		this.grades = grades;
	}
	
	public void print(String data)
	{
		if (data == "id") {
			System.out.print(this.getID());
		} else if (data == "firstName" ) {
			System.out.print(this.getFirstName());
		} else if (data == "lastName" ) {
			System.out.print(this.getLastName());
		} else if (data == "email" ) {
			System.out.print(this.getEmailAddress());
		} else if (data == "age" ) {
			System.out.print(this.getAge());
		} else if (data == "grades") {
			String withBrackets = this.grades.toString();
			System.out.print("{" + withBrackets.substring(1, withBrackets.length() - 1) + "}");
		}
	}
}
