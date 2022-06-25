package student;

import department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s =new Student();
collegeName();
collegeCode();
collegeRank();
departmentName();
s.studentName();
s.studentDept();
s.studentId();
	}
public static void studentName()
	{
	String studentName ="Jessica Kemp";
	System.out.println("Student Name is "+studentName);
	}
public static void studentDept()
{
	String studentDept ="Information Technology";
	System.out.println("Student's Department is "+studentDept);
	
}
public static void studentId()
{
	int studentid =4006789;
	System.out.println("Student ID is "+studentid);
}
	
}