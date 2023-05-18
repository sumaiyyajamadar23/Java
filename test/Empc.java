package comcode;

import java.io.Serializable;
import java.time.LocalDate;

public class Empc implements Serializable
{
private String id;
private String name;
private transient LocalDate joindate;
private Dept department;
public Empc(String id, String name, LocalDate joindate, Dept department) {
	super();
	this.id = id;
	this.name = name;
	this.joindate = joindate;
	this.department = department;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", joindate=" + joindate + ", department=" + department + "]";
}
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the joindate
 */
public LocalDate getJoindate() {
	return joindate;
}
/**
 * @return the department
 */
public Dept getDepartment() {
	return department;
}

}
