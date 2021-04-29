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
	instructor.setLastName("demiroğ");
	instructor.seteMail("engindemiroğ@gmail.com");
	instructor.setSalary(100000);
	
	Student[] students= new Student[]{student};
	for (Student student1 : students) {
		System.out.println("Öğrencini Adı: "+ student1.getFirstName());
		System.out.println("Öğrencini Soyadı: "+ student1.getLastName());
		System.out.println("Öğrencini Mail: "+ student1.geteMail());
		System.out.println("Öğrencini Numarası: "+ student1.getStudentNumber());
		
	}
	StudentManager studentManager=new StudentManager();
	studentManager.add(student);
	studentManager.list();
	
	Instructor[] instructors=new Instructor[] {instructor};
	for (Instructor instructor1 : instructors ) {
		System.out.println("Öğretmenin Adı: "+ instructor1.getFirstName());
		System.out.println("Öğretmenin Soyadı: "+ instructor1.getLastName());
		System.out.println("Öğretmenin Maili: "+ instructor1.geteMail());
		System.out.println("Öğretmenin Maaşı:"+ instructor1.getSalary());
	}
		InstructorManager instructorManager=new InstructorManager();
        
        instructorManager.add(instructor);
        instructorManager.list();
	

	
	
	
	
}

}
	


