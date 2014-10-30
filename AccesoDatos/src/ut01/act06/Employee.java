package ut01.act06;//

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Employee implements Serializable {
private static final long serialVersionUID = 1L;
private int id;
private String name;
private String head;


public Employee() {
}

public void setId(int id){
	this.id=id;
}

public void setName(String name){
	this.name=name;
}

public void setHead(String head){
	this.head=head;
}

public int getId(){
	return id;
}

public String getName(){
	return name;
}

public String getHead(){
	return head;
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
