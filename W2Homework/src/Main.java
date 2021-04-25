
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazilim Gelistirici Yetistirme Kampi(Java & React )","Engin Demirog" );
        Course course2 = new Course(2,"Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)","Engin Demirog");
        
      Course[] courses = {course1, course2};
        for(Course course: courses) {
        	System.out.println("Course Id : "+ course.id + "\nCourse Name : "+ course.name + "\nCourse Teacher : "+ course.teacher);
        }
        Teacher teacher1 = new Teacher(1, "Engin Demirog");
        Teacher[] teachers = {teacher1};
		for (Teacher teacher : teachers) {
	  System.out.println("Teacher Id : " + teacher.id + "\nTeacher Name : "+teacher.name );
              
	}
 

 
		System.out.println();
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		System.out.println("***********************");
		courseManager.deleteCourse(course1);
		courseManager.deleteCourse(course2);
		
}
}
