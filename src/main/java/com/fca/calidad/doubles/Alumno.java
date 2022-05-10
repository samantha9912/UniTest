package com.fca.calidad.doubles;

public class Alumno {
private String nombre;
private int id; 
private int edad;
private String email; 

public Alumno( ) {
}
public Alumno (int id, String nombre, int edad, String email)
{
this.nombre = nombre;
this.id = id;
this.edad = edad; 
this.email = email; 

}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;

}
}
