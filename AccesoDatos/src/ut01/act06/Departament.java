package ut01.act06;//

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Departament implements Serializable {
private static final long serialVersionUID = 1L;
private int id;
private String name;
private String head;


public Departament() {
	super();
}

public void setId(int id){
	this.id=id;
}

public void setName(String name){
	if(name.length()<20)
		this.name=name;
	else
		System.out.println("error el nombre del Departamento no puede tener mas de 20caracteres");
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
