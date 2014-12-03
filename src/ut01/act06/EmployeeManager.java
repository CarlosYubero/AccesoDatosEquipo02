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
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManager {

	public static final String pathE = "./resources/employee.bin";
	public static final String pathD = "./resources/deparment.bin";

	private static final ArrayList<Employee> employeeList = new ArrayList();
	private static final ArrayList<Deparment> deparmentList = new ArrayList();

	// Crear un fichero con al menos 10 empleados de prueba de tres
	// departamentos diferentes
	private void dummy() {

		// Departamentos

		Deparment direccion = new Deparment(1, "Direccion",
				"Fernando Rodriguez");
		deparmentList.add(direccion);

		Deparment rrhh = new Deparment(2, "RRHH", "Antonio Ruiz");
		deparmentList.add(rrhh);

		Deparment contabilidad = new Deparment(3, "Contabilidad",
				"Jose Luis Gutierrez");
		deparmentList.add(contabilidad);

		// Empleados

		Employee emp1 = new Employee(1, "Roberto", "Gomez", "Contable",
				new Date(05 / 04 / 2010), 423, 0, 3);
		employeeList.add(emp1);

		Employee emp2 = new Employee(2, "Francisco", "Delgado", "RRHH",
				new Date(10 / 12 / 2008), 423, 0, 2);
		employeeList.add(emp2);

		Employee emp3 = new Employee(3, "Antonio", "Ruiz", "RRHH", new Date(
				31 / 4 / 1999), 534, 0, 2);
		employeeList.add(emp3);

		Employee emp4 = new Employee(4, "Jose Luis", "Gutierrez", "Contable",
				new Date(1 / 7 / 2005), 253, 0, 3);
		employeeList.add(emp4);

		Employee emp5 = new Employee(5, "Fernando", "Rodriguez", "Director",
				new Date(15 / 4 / 1999), 31, 10, 1);
		employeeList.add(emp5);

		Employee emp6 = new Employee(6, "Miguel", "Hernandez", "Director",
				new Date(30 / 4 / 2004), 42342, 10, 1);
		employeeList.add(emp6);

		Employee emp7 = new Employee(7, "Carlos", "Garcia", "Contable",
				new Date(12 / 12 / 2012), 322, 0, 3);
		employeeList.add(emp7);

		Employee emp8 = new Employee(8, "David", "Augusto", "RRHH", new Date(
				1 / 5 / 2013), 423423, 0, 2);
		employeeList.add(emp8);

		Employee emp9 = new Employee(9, "Jesus", "Mochales", "Contable",
				new Date(11 / 11 / 2011), 23423, 0, 3);
		employeeList.add(emp9);

		Employee emp10 = new Employee(10, "Jorge", "Rodriguez", "RRHH",
				new Date(13 / 13 / 2013), 653634, 0, 2);
		employeeList.add(emp10);

		// TODO Record all employee objets into a file
		// fichero empleados
		File ficheroE = new File(pathE);

		FileOutputStream fileoutE = null;
		ObjectOutputStream streamSalidaE = null;

		// fichero departamento
		File ficheroD = new File(pathD);
		FileOutputStream fileoutD = null;
		ObjectOutputStream streamSalidaD = null;

		try {
			fileoutE = new FileOutputStream(ficheroE);// crea flujo de salida
			// Conectamos el flujo de bytes al flujo de datos
			streamSalidaE = new ObjectOutputStream(fileoutE);

			for (Employee e : employeeList) {
				streamSalidaE.writeObject(e);
			}

			fileoutD = new FileOutputStream(ficheroD);// crea flujo de salida
			// Conectamos el flujo de bytes al flujo de datos
			streamSalidaD = new ObjectOutputStream(fileoutD);
			for (Deparment d : deparmentList) {
				streamSalidaD.writeObject(d);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				streamSalidaE.close();
				streamSalidaD.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// Load binary file in memory
	public void LoadFile() throws IOException, ClassNotFoundException {
		Employee empleado = null;

		File fichero = new File(pathE);
		FileInputStream filein = null;
		ObjectInputStream dataIS = null;
		// Crea el flujo de salida
		filein = new FileInputStream(fichero);
		// Conecto el flujo de bytes al flujo de datos
		dataIS = new ObjectInputStream(filein);
		try {
			empleado = (Employee) dataIS.readObject();
			while (empleado != null) {
				employeeList.add(empleado);
				empleado = (Employee) dataIS.readObject();
			}
		} catch (EOFException eo) {
			dataIS.close();
		}
	}

	// crea un mÃ©todo que liste un empleado por su id.

	public Employee getEmployee(int idEmp) {
		Employee emp = null;
		for (Employee e : employeeList) {
			if (e.getId() == idEmp) {
				emp = e;
			}
		}

		return emp;
	}

	// Crear un mÃ©todo que modifique el salario de un empleado con el id que
	// recibe y el nuevo salario por parÃ¡metro

	public boolean getEmployee(int idEmp, int newSalary) {
		boolean modificado = false;
		for (Employee e : employeeList) {
			if (e.getId() == idEmp) {
				e.setSalary(newSalary);
				if (e.getSalary() == newSalary) {
					modificado = true;
				}
			}
		}

		return modificado;
	}

	// Crear un mÃ©todo que elimine un empleado con el id que recibe por
	// parÃ¡metro
	public boolean deleteEmployee(int id) {
		Employee emp = null;
		boolean borrado = false;
		for (Employee e : employeeList) {
			if (e.getId() == id) {
				if (employeeList.remove(e)) {
					borrado = true;
				}
			}
		}
		if (borrado == true) {
			return true;
		} else {
			return false;
		}
	}

	// Crear un método que añada un nuevo empleado recibiendo los datos por
	// parámetro
	public void addEmployee(Employee e) {
		employeeList.add(e);
	}

	// Crear un método que devuelva los empleados ordenados por apellido en un
	// ArrayList
	public ArrayList<Employee> OrdenarEmpleados() {
		ArrayList<Employee> employeeList_ord = employeeList;
		// Este metodo ordena el arraylist alfabeticamente
		Collections.sort(employeeList_ord, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getLastName().compareTo(emp2.getLastName());
			}
		});
		return employeeList_ord;
	}

	// Crear un mÃ©todo que devuelva el nÃºmero de empleados de un departamento
	public int numEmployeeDepartment(int idDep) {
		int num = 0;
		for (Employee e : employeeList) {
			if (e.getDepNumber() == idDep) {
				num++;
			}
		}
		return num;
	}

	// Crear un mÃ©todo que devuelva la lista de departamentos sin repetir en un
	// ArrayList
	public ArrayList<Deparment> getDepartment() {
		Deparment departamento = null;

		File fichero = new File(pathD);
		FileInputStream filein = null;
		ObjectInputStream dataIS = null; // Crea el flujo de salida
		try {
			filein = new FileInputStream(fichero);
			dataIS = new ObjectInputStream(filein);
			departamento = (Deparment) dataIS.readObject();
			while (departamento != null) {
				deparmentList.add(departamento);
				departamento = (Deparment) dataIS.readObject();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (EOFException eo) {
			try {
				dataIS.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deparmentList;
	}

	// Crear un mÃ©todo que devuelva el sueldo medio de los empleados de un
	// departamento recibido por parÃ¡metro
	public int averagePaymentDepartment(int idDep) {
		int average = 0;
		int cont = 0;
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getDepNumber() == idDep) {
				average += employeeList.get(i).getSalary();
				cont++;
			}
		}
		average = average / cont;
		return average;
	}

}
