
public class InstructorManager extends UserManager {

	public void addNewCourses(Instructor instructor) {
		System.out.println(instructor.getName()+" "+instructor.getLastName()+" "
	+instructor.getCourses()+"Course created");
	}

}
