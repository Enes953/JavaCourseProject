package JavaCourseProject;

public class Main {

	public static void main(String[] args) {
		
	Student student=new Student();
	Instructor instructor=new Instructor();
	
	
	
	student.setId(1);
	student.setFirstName("enes");
	student.setLastName("duman");
	student.seteMail("enesduman9533@gmail.com");
	student.setStudentNumber(953);

	instructor.setId(2);
	instructor.setFirstName("engin");
	instructor.setLastName("demiro�");
	instructor.seteMail("engindemiro�@gmail.com");
	instructor.setSalary(100000);
	
	Student[] students= new Student[]{student};
	for (Student student1 : students) {
		System.out.println("��rencini Ad�: "+ student1.getFirstName());
		System.out.println("��rencini Soyad�: "+ student1.getLastName());
		System.out.println("��rencini Mail: "+ student1.geteMail());
		System.out.println("��rencini Numaras�: "+ student1.getStudentNumber());
		
	}
	StudentManager studentManager=new StudentManager();
	studentManager.add(student);
	studentManager.list();
	
	Instructor[] instructors=new Instructor[] {instructor};
	for (Instructor instructor1 : instructors ) {
		System.out.println("��retmenin Ad�: "+ instructor1.getFirstName());
		System.out.println("��retmenin Soyad�: "+ instructor1.getLastName());
		System.out.println("��retmenin Maili: "+ instructor1.geteMail());
		System.out.println("��retmenin Maa��:"+ instructor1.getSalary());
	}
		InstructorManager instructorManager=new InstructorManager();
        
        instructorManager.add(instructor);
        instructorManager.list();
	

	
	
	
	
}

}
	


