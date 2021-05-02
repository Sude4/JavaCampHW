
public class StudentManager extends UserManager {

public void addNewCourse(Student student) {
	System.out.println( student.getName()+" "+student.getLastName()+"isimli öğrenci"+student.getListedCourses() + " kursuna başarıyla kayıt oldu");
			
}
}
