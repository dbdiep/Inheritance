package advance.dev;

public class Student extends Person {

	private double markMath;
	private double markPhysical;
	private double markChemistry;
	private String studentID;
	private String className;
	
	public double calculateMark() {
		return (this.markMath + this.markPhysical + this.markChemistry) / 3;
	}

	public double getMarkMath() {
		return markMath;
	}

	public void setMarkMath(double markMath) {
		this.markMath = markMath;
	}

	public double getMarkPhysical() {
		return markPhysical;
	}

	public void setMarkPhysical(double markPhysical) {
		this.markPhysical = markPhysical;
	}

	public double getMarkChemistry() {
		return markChemistry;
	}

	public void setMarkChemistry(double markChemistry) {
		this.markChemistry = markChemistry;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
