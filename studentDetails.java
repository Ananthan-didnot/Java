class Student{
	
	String name;
	int rollNumber;
	String department;
	
	Student(String name,int rollNumber,String department){
		
		this.name = name;
		this.rollNumber = rollNumber;
		this.department = department;
		
	}
	
	public void printStudentInfo() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Department: "+department);
	}
	
}

public class studentDetails {

	public static void main(String[] args) {
		
		Student student1 = new Student("John",1,"CSE");
		Student student2 = new Student("Frank",2,"EEE");
		
		student1.printStudentInfo();
		System.out.println();
		student2.printStudentInfo();
		
	}

}
