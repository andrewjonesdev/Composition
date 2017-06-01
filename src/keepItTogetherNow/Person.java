package keepItTogetherNow;
//Person.java
public class Person {
//composition has-a relationship
private Job job;
private Education education;
public Person(){
  this.job=new Job();
  job.setSalary(1000L);
  this.education = new Education();
  education.addLaterEducation("Arizona State University");
}
public long getSalary() {
  return job.getSalary();
}

public String toString(){
	String listString = "";
	listString += ("Job) " + job.toString() + "\nEducation) " + education.toString());
	return listString;
}
}