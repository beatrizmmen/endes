package package1;
import java.util.Scanner;

class edad { 

	public String nombre;  
	public int a;  
	Scanner dato = new Scanner(System.in);
	
	public edad () {

	}
	
    public void usuario(String nombre ,int a){  

	   System.out.println("****************");
	   System.out.println("Ingrese su nombre");
	   nombre = dato.next(); 
	   System.out.println("Ingrese la edad"); 
	   a = dato.nextInt(); 
	   System.out.println("El nombre del usuario es "+nombre+" "+" y su edad "+" "+a+" años \n" );
	   if(a <18){  
		   System.out.println("El usuario es menor de edad");  
	   }else{  
		   System.out.println("El usuario es mayor de edad");  
	   }  
	   
    }  
    
    public static void main (String []args){ 
		   edad d = new edad ();
		   d.usuario("", 0);  
	   } 
}