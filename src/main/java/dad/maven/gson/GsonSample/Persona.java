package dad.maven.gson.GsonSample;

public class Persona {
	
	private String nombre = "", apellidos ="";
	private int edad=0;
	
	public Persona (String nombre, String apellidos, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	public String toString() {
		String resultado;
		resultado = "Nombre: "+nombre+","+"\n"+"Apellidos: "+apellidos+","+"\n"+"Edad: "+edad;
		return resultado;
	}

}
