package week3.day1;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Vishalini V N ");
	}
	public void studentDept()
	{
		System.out.println("CSE");
	}
	public void studentId()
	{
		System.out.println("S2468");
	}
	public static void main(String[] args)
	{
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
		

	}

}
