package ut01.act06;

import java.io.Serializable;
import java.sql.Date;
import java.util.GregorianCalendar;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String lastname;
	private String name;
	private String job;
	private Date regis_date;
	private int comission;
	private int dep_number;

	public Employee() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setComission(int comission) {
		this.comission = comission;
	}

	public void setDepNumber(int dep_number) {
		this.dep_number = dep_number;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastname;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public int getComission() {
		return comission;
	}

	public int getDepNumber() {
		return dep_number;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
