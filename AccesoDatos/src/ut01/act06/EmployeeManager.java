package ut01.act06;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.ArrayList;


public class EmployeeManager {

	public static final String pathE = "./resources/employee.bin";
	public static final String pathD = "./resources/deparment.bin";
	
	private static final ArrayList<Employee> employeeList = new ArrayList();
	private static final ArrayList<Deparment> deparmentList = new ArrayList();
	

	// Crear un fichero con al menos 10 empleados de prueba de tres departamentos diferentes
	public void dummy() {
			
		//Departamentos
		
		Deparment direccion = new Deparment(1,"Direccion","Fernando Rodriguez");
		deparmentList.add(direccion);
		
		Deparment rrhh = new Deparment(2,"RRHH","Antonio Ruiz");
		deparmentList.add(rrhh);

		Deparment contabilidad = new Deparment(3, "Contabilidad", "Jose Luis Gutierrez");
		deparmentList.add(contabilidad);
		
		
		//Empleados
		
		Employee emp1 = new Employee(1,"Roberto","Gomez","Contable",new Date (05/04/2010),0,3);
		employeeList.add(emp1);
		
		Employee emp2 = new Employee(2,"Francisco","Delgado","RRHH",new Date(10/12/2008),0,2);
		employeeList.add(emp2);
		
		Employee emp3 = new Employee(3,"Antonio","Ruiz","RRHH",new Date(31/4/1999),0,2);
		employeeList.add(emp3);
		
		Employee emp4 = new Employee(4,"Jose Luis","Gutierrez","Contable",new Date(1/7/2005),0,3);
		employeeList.add(emp4);
		
		Employee emp5 = new Employee(5,"Fernando","Rodriguez","Director",new Date(15/4/1999),10,1);
		employeeList.add(emp5);
		
		Employee emp6 = new Employee(6,"Miguel","Hernandez","Director",new Date(30/4/2004),10,1);
		employeeList.add(emp6);
		
		Employee emp7 = new Employee(7,"Carlos","Garcia","Contable",new Date(12/12/2012),0,3);
		employeeList.add(emp7);
		
		Employee emp8 = new Employee(8,"David","Augusto","RRHH",new Date(1/5/2013),0,2);
		employeeList.add(emp8);
		
		Employee emp9 = new Employee(9,"Jesus","Mochales","Contable",new Date(11/11/2011),0,3);
		employeeList.add(emp9);
		
		Employee emp10 = new Employee(10,"Jorge","Rodriguez","RRHH",new Date(13/13/2013),0,2);
		employeeList.add(emp10);
		
		//TODO Record all employee objets into a file
		//fichero empleados
		File ficheroE = new File(pathE);
		
		FileOutputStream fileoutE = null;
		ObjectOutputStream streamSalidaE = null;
		
		//fichero departamento
		File ficheroD = new File(pathD);
		FileOutputStream fileoutD = null;
		ObjectOutputStream streamSalidaD = null;
		
		try {
			fileoutE = new FileOutputStream(ficheroE);//crea flujo de salida
			//Conectamos el flujo de bytes al flujo de datos
			streamSalidaE = new ObjectOutputStream(fileoutE);
			
			for(Employee e: employeeList){
				streamSalidaE.writeObject(e);
			}
			
			fileoutD = new FileOutputStream(ficheroD);//crea flujo de salida
			//Conectamos el flujo de bytes al flujo de datos
			streamSalidaD = new ObjectOutputStream(fileoutD);
			for(Deparment d: deparmentList){
				streamSalidaD.writeObject(d);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				streamSalidaE.close();
				streamSalidaD.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	// Load binary file in memory
	public void LoadFile() {
	}
	
	// crea un método que liste un empleado por su id. 
	
	public Employee getEmployee (int idEmp){
		return null;
	}
	
	// Crear un método que modifique el salario de un empleado con el id que recibe y el nuevo salario por parámetro
	
	public boolean getEmployee (int idEmp, double newSalary){
		return false;
	}
	// Crear un método que elimine un empleado con el id que recibe por parámetro
	public boolean deleteEmployee (int id){
		return false;
	}
	
	// Crear un método que añada un nuevo empleado recibiendo los datos por parámetro
	public boolean addEmployee (Employee e){
		return false;
	}
	
	// Crear un método que devuelva los empleados ordenados por apellido en un ArrayList
	public ArrayList<Employee> listEmployee (Employee e){
		return null;
	}
	
	// Crear un método que devuelva el número de empleados de un departamento
	public int numEmployeeDepartment (int idDep){
		return 0;
	}
	// Crear un método que devuelva la lista de departamentos sin repetir en un ArrayList
	public ArrayList<Departament> getDepartment (){
		return null;
	}
	
	// Crear un método que devuelva el sueldo medio de los empleados de un departamento recibido por parámetro
	public int averagePaymentDepartment (int idDep){
		return 0;
	}
	
	
}
