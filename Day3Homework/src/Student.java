
public class Student extends User {
	private String listedCourses;
	public Student () {
		
	}
	
	public Student(int id, String name, String listedCourses) {
		super(id,name,name);
		this.listedCourses = listedCourses;
	}
	
public String getListedCourses() {
	return listedCourses;
	
}
public void setListedCourses(String listedCourses) {
	this.listedCourses = listedCourses;
}


}
