package JavaCourseProject;

public class InstructorManager extends UserManager {

	@Override
	public void list () {
		System.out.println("��retmenler Listelendi");
	}
	
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" eklendi");
	}
}
