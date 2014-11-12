
package ut01.act06;
import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String lastname;
	private String name;
	private String job;
	private Date regis_date;
	private int salary;
	private int comission;
	private int dep_number;	
	
	public Employee(){
		
	}

	public Employee(int id, String name, String lastname, String job, Date regis_date, int comission, int dep_number) {
		
		super();
		this.id=id;
		this.name=name;
		this.lastname=lastname;
		this.job=job;
		this.regis_date=regis_date;
		this.comission=comission;
		this.dep_number=dep_number;
		
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setLastName(String lastname){
		if(lastname.length()<20)
			this.lastname=lastname;
		else
			System.out.println("error el apellido del Empleado no puede tener mas de 20caracteres");
		
	}
	
	public void setName(String name){
		if(name.length()<20)
			this.name=name;
		else
			System.out.println("error el nombre del Empleado no puede tener mas de 20caracteres");
	}
	
	public void setJob(String job){
		this.job=job;
	}

	public static boolean validaFecha(String fecha){
		try {
			SimpleDateFormat formato= new SimpleDateFormat("dd/mm/yyyy",Locale.getDefault());
			formato.setLenient(false);
			formato.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public void setRegis_Date(Date regis_date){
		
			this.regis_date=regis_date;
	
			
	}

	public void setSalary(int salary){
		if(salary>0)
			this.salary=salary;
		else
			System.out.println("el salario no puede ser negativa");
	}
	
	
	public void setComission(int comission){
		if(comission>0)
			this.comission=comission;
		else
			System.out.println("la comision no puede ser negativa");
	}
	

	public void setDepNumber(int dep_number){
		this.dep_number=dep_number;
	}
	
	public int getId(){
		return id;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public String getName(){
		return name;
	}
	
	public String getJob(){
		return job;
	}
	
	public Date getRegis_date(){
		return regis_date;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public int getComission(){
		return comission;
	}
	
	public int getDepNumber(){
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

