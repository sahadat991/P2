package encapsulation;

public class TestStudentInfo {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStID(111);
		st1.setStName("SAYEM");
		st1.setStDOB("04-01-1992");
		st1.setStGrade("B-");
				
		System.out.println(st1.getStID()+ " " + st1.getStName()+ " " +st1.getStDOB()+ " " + st1.getStGrade() );
	
	Student st2 = new Student();
	st2.setStID(222);
	st2.setStName("PRINCE");
	st2.setStDOB("09-25-1990");
	st2.setStGrade("A+");
			
		System.out.println(st2.getStID()+ " " + st2.getStName()+ " " +st2.getStDOB()+ " " + st2.getStGrade() );

}

}