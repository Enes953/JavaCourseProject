package JavaCourseProject;

public class Student extends User {

	int studentNumber;

	public Student(){
		
	}
	
	public Student (int id, String firstName, String lastName, String eMail,int studentNumber) {
		super(id,firstName,lastName,eMail);
		this.studentNumber = studentNumber;
		
		
		
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
