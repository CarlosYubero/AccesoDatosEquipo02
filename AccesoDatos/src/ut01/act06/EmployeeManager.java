package ut01.act06;


import java.util.ArrayList;

public class EmployeeManager {

	public static final String path = "./resources/employee.bin";
	private static final ArrayList<Employee> employeeList = new ArrayList();
	
	

	// Crear un fichero con al menos 10 empleados de prueba de tres departamentos diferentes
	private void dummy() {
		
		
		Deparment direccion = new Deparment();
		direccion.setId(01);
		direccion.setName("Direccion");
		direccion.setHead("");
		
		
		Deparment rrhh = new Deparment();
		rrhh.setId(02);
		rrhh.setName("RRHH");
		rrhh.setHead("");

		Deparment contabilidad = new Deparment();
		contabilidad.setId(03);
		contabilidad.setName("Contabilidad");
		contabilidad.setHead("");
		
		Employee emp1 = new Employee();
		emp1.setId(01);
		emp1.setName("Roberto");
		emp1.setLastName("Gomez");
		emp1.setJob("Contable");
		emp1.setComission(0);
		emp1.setDepNumber(03);
		
		employeeList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(02);
		emp2.setName("Francisco");
		emp2.setLastName("Delgado");
		emp2.setJob("RRHH");
		emp2.setComission(0);
		emp2.setDepNumber(02);
		
		employeeList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(03);
		emp3.setName("Antonio");
		emp3.setLastName("Ruiz");
		emp3.setJob("RRHH");
		emp3.setComission(0);
		emp3.setDepNumber(02);
		
		employeeList.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setId(03);
		emp4.setName("Jose Luis");
		emp4.setLastName("Gutierrez");
		emp4.setJob("Contable");
		emp4.setComission(0);
		emp4.setDepNumber(03);
		
		employeeList.add(emp4);
		
		Employee emp5 = new Employee();
		emp5.setId(03);
		emp5.setName("Fernando");
		emp5.setLastName("Rodriguez");
		emp5.setJob("Director");
		emp5.setComission(10);
		emp5.setDepNumber(01);
		
		employeeList.add(emp5);
		
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
	public ArrayList<Deparment> getDepartment (){
		return null;
	}
	
	// Crear un método que devuelva el sueldo medio de los empleados de un departamento recibido por parámetro
	public int averagePaymentDepartment (int idDep){
		return 0;
	}
	
	
}
