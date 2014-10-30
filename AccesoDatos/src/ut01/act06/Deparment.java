package ut01.act06;
import java.io.Serializable;

public class Deparment implements Serializable {

	private static final long serialVersionUID = 1V;
	private int id;
	private String lastname;
	private String name;
	private String job;
	private date regis_date;
	private int comission;
	private int dep_number;	

	public Deparment() {
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setLastName(String lastname){
		this.lastname=lastname;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setJob(String job){
		this.job=job;
	}
	
	public void setComission(int comission){
		this.comission=comission;
	}
	
	public void setDepNumber(int dep_number){
		this.dep_number=dep_number;
	}
	
	public int getId(){
		return id;
	}
	
	public int getLastName(){
		return lastname;
	}
	
	public int getName(){
		return name;
	}
	
	public int getJob(){
		return job;
	}
	
	public int getComission(){
		return comission;
	}
	
	public int getDepNumber(){
		return dept_number;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}
//
}