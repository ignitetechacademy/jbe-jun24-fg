package com.syam.learn.java.typez;

public class ExploreRecords {

	public static void main(String[] args) {
		Employee syam = new Employee(999, "Syam Kakumani", "Competence Track");
		System.out.println(syam);
		// System.out.println(syam.getName());
		System.out.println(syam.name());

		Company peppy = new Company(123, "Peppy Infotech");
		System.out.println(peppy);
		System.out.println(peppy.companyName());
	}
}

record Company(int companyId, String companyName) {
}

record Employee(int id, String name, String project) {
}

//class Employee {
//	int id;
//	String name;
//	String project;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getProject() {
//		return project;
//	}
//
//	public void setProject(String project) {
//		this.project = project;
//	}
//
//	public Employee(int id, String name, String project) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.project = project;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", project=" + project + "]";
//	}
//
//}
