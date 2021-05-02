
public class Instructor extends User{
private String courses;
public Instructor() {
	
}

public Instructor(int id,String name,String lastName) {
	super(id,name,lastName);
}
	public Instructor(String courses) {
		this.courses =courses;
	}
public String getCourses() {
	return courses;
}
public void setCourses(String courses) {
	this.courses = courses;
}



}
