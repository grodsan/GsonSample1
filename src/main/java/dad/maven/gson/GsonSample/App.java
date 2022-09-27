package dad.maven.gson.GsonSample;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Crear variables
    	String name="";
    	String subname="";
    	String age1="";
    	int age2 =0;
    	//Crear instancia scanner
        Scanner scanner = new Scanner(System.in);
        //Recoger nombre
        while (name.equals("")){
        	System.out.println("Introduzca el nombre:");
        	name = scanner.nextLine();
        }
        //Recoger apellidos
        while(subname.equals("")) {
        	System.out.println("Introduzca el apellido:");
        	subname = scanner.nextLine();
        }
        //Recoger edad
        while (age2==0) {
        	System.out.println("Introduzca la edad:");
        	age2 = scanner.nextInt();
        }
        //Crear el objeto persona y almacenar los datos
        Persona p = new Persona(name, subname, age2);
        //Mostrar los datos de p
        System.out.println(p);
    }
}
