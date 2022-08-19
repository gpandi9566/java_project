
public class Student {
	
	int age = 28;
	
	String name = "Gokul";
	
	void getStudentDetail(int age, String name){
		System.out.println(age + "=="+ name);
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.getStudentDetail(10, "test");
		
	}

}
