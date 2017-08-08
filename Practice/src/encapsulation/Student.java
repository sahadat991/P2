package encapsulation;

public class Student {
	private int stID;
	private String stName;
	private String stDOB;
	private String stGrade;
	
	public void setStID(int stID){
		this.stID = stID;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDOB() {
		return stDOB;
	}
	public void setStDOB(String stDOB) {
		this.stDOB = stDOB;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	public int getStID() {
		return stID;
	}

}
