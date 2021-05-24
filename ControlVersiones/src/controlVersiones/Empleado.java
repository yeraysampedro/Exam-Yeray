package controlVersiones;

//CONFLICTO CREADO EN LA RAMA MASTER CONFLICTO SOLUCIONADO

public class Empleado {
	/**
	 * Este atributo recoge el nombre del empleado guardado en una variable de tipo string
	 */
	private String nombre;
	/**
	 * Este atributo recoge el apellido del empleado guardado en una variable de tipo string
	 */
	private String apellidos;
	/**
	 * Este atributo recoge el salario que va a cobrar el empleado guardado en una variable de tipo double
	 */
	private double salario; 


	/**
	 * CONSTRUCTOR
	 * 
	 * @param nombre recibe el nombre de fuera para crear un empleado con dicho nombre
	 * @param apellido recibe el apellido de fuera para crear un empleado con dicho apellido
	 * @param salario recibe el salario de fuera para crear un empleado con dicho salario
	 */
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}


/**
 * 
 * @param subida recibe un double que será lo que se le sumará al salario y suma al salario que ese empleado tiene, el salario recibido
 * EX: Salario = 100 / Subida = 20 entonces: El nuevo salario será 120
 */
public void subirsalario (double subida) {
	salario=salario+subida;
}


}
