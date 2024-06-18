package com.syam.learn.java.constructors;

public class College {

	private String name;
	private String location;

	private int startedYear;
	private short approvedStudentsCapacity;

	private String university;
	private boolean engineeringCollege;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStartedYear() {
		return startedYear;
	}

	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}

	public short getApprovedStudentsCapacity() {
		return approvedStudentsCapacity;
	}

	public void setApprovedStudentsCapacity(short approvedStudentsCapacity) {
		this.approvedStudentsCapacity = approvedStudentsCapacity;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public boolean isEngineeringCollege() {
		return engineeringCollege;
	}

	public void setEngineeringCollege(boolean engineeringCollege) {
		this.engineeringCollege = engineeringCollege;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + ", startedYear=" + startedYear
				+ ", approvedStudentsCapacity=" + approvedStudentsCapacity + ", university=" + university
				+ ", engineeringCollege=" + engineeringCollege + "]";
	}

	public College(String name, String university) {
		super();
		this.name = name;
		this.university = university;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
