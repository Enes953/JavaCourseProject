package JavaCourseProject;

public class StudentManager extends UserManager {

	@Override
	public void list () {
		System.out.println("��renciler Listelendi");
	}
	
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+" eklendi");
	}

}
