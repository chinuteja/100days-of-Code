class Student{
	static String name;
	int rollno;
	Student(String name,int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public static void display() {
		System.out.println(name);
	}
} 
public class Solution {
	
	

	public static void main(String[] args){
		
		Student stud = new Student("teja",242);
		stud.display();
	}	
}