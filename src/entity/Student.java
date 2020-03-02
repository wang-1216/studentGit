package entity;

public class Student {
	private String Sname;
	private int Sage;
	private String Ssex;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	public String getSsex() {
		return Ssex;
	}
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	public Student() {
		super();
	}
	public Student(String sname, int sage, String ssex) {
		super();
		Sname = sname;
		Sage = sage;
		Ssex = ssex;
	}
	
}
