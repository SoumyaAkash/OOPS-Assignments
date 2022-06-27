package week1.day4;

public class students {
	int id;
	String name;
	String email;
	long phonenumber;
 public void getStudentInfo(int id)
	{
		
		String name="Vasantha Kumari";
		String email ="vasantha.kumari@gmail.com";
		long phonenumber =9176669966L;
		System.out.println("******** passing Id argument********");
		System.out.println("Student id  is "+id);
		System.out.println("Student name is "+name);
		System.out.println("Student email  is "+email);
		System.out.println("Student phone number is "+phonenumber);
	}
 public void getStudentInfo(int id, String name )
 {
	 String email ="Nalini.kumari@gmail.com";
	long phonenumber =9176669933L;
	System.out.println("******Passing Id and Name arguments*******");
     System.out.println("Student id  is "+id);
     System.out.println("Student name is "+name);
     System.out.println("Student email is "+email);
	System.out.println("Student phone number is "+phonenumber);
 }
 
public void getStudentInfo(int id, long phonenumber,String email )
 {

	 
	System.out.println("******Passing Id,Name and Email arguments*******");
 System.out.println("Student id  is "+id);
System.out.println("Student name is "+name);
System.out.println("Student email is "+email);
	System.out.println("Student phone number is "+phonenumber);

 	
 }

	public static void main(String[] args) {
		
		students s=new students();
    s.getStudentInfo(500300);
    s.getStudentInfo(500400, "Nalini Kumari");
	s.getStudentInfo(500600,9176669955L,"Neena.Kumar@gmail.com");	
	}
}
		
