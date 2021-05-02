public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
        instructor1.setName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setCourses("Java&React");
        
        
		Student student1 =new Student();
		student1.setName("Sude");
		student1.setLastName("Cetin");
        student1.setListedCourses("Java&React");
        
        InstructorManager instructorManager =new InstructorManager();
        instructorManager.addNewCourses(instructor1);
        
        StudentManager studentManager =new StudentManager();
        studentManager.addNewCourse(student1);
        
        
        
	}

}