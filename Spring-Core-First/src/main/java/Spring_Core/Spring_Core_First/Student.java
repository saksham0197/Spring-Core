package Spring_Core.Spring_Core_First;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("Setting student ID");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setting student Name");
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
		System.out.println("Setting student Address");
	}
	
	//parameterized Constructor
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	// Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	// toString()Method
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	

}
