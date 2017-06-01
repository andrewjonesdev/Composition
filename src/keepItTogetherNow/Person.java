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
  education.addLaterEducation("Arizona State University 5");
  education.addLaterEducation("Arizona State University 6");
  education.addLaterEducation("Arizona State University 7");
  education.addLaterEducation("Arizona State University 8");
  education.addLaterEducation("Arizona State University 9");
  education.addLaterEducation("Arizona State University 10");
  education.addLaterEducation("Arizona State University 11");
  education.addEarlierEducation("Arizona State University 4");
  education.addEarlierEducation("Arizona State University 3");
  education.addEarlierEducation("Arizona State University 2");
  education.addEarlierEducation("Arizona State University 1");
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