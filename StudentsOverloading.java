package assignment3.axisbank;

public class StudentsOverloading {
	public static void main(String arg[]) {
		int a = 123;
		String c = "Kayal" , d = "sdd@gmail.com";
		Long e = 6799372923L;
		
		StudentsOverloading so = new StudentsOverloading();
		System.out.println("EmployeeId is: " +so.getStudentInfo(a));
		System.out.println("Employeeid is: " + a + " " +"Employee name is: "+ c);
		System.out.println("Employee emailid is: "+so.getStudentInfo(d));
		System.out.println("Employee contact number is: " +so.getStudentInfo(e));
	}
	public int getStudentInfo(int a) {
		return a;
	}
	public void getStudentInfo(int a, String c) {
	
	}
	public String getStudentInfo(String d) {
		return d;
	}
	public Long getStudentInfo(Long e) {
		return e;
	}
}
