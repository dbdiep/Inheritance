package advance.dev;

public class Teacher extends Person {
  
	private String teacherID;
	private double salary;
	
	public double calculateSalary() {
		return salary;
	};
	
	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
