
public class StudentManager extends UserManager {

public void addNewCourse(Student student) {
	System.out.println( student.getName()+" "+student.getLastName()+"isimli ��renci"+student.getListedCourses() + " kursuna ba�ar�yla kay�t oldu");
			
}
}
