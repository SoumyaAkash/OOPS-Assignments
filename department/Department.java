package department;

import college.College;

public class Department extends College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department();
		collegeName();
		collegeCode();
		collegeRank();
		d.departmentName();
	}
public static void departmentName()
{
	String DepartmentName ="Engineering";
	System.out.println("Department Name is "+DepartmentName);
}
	}


