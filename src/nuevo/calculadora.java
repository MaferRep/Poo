package nuevo;

import java.util.Scanner;

public class calculadora {

public static void main(String args []) {
	
	 int n;
	 double numerouno; 
	 double numerodos;
	 double resultado;
	 
	Scanner enter = new Scanner(System.in);
	
	System.out.println("elige un numero del menú \n1. para sumar \n2. para restar \n3. para multiplicar \n4. para dividir\n ");
	System.out.println("elige una opcion del menu: ");
	
	 n= enter.nextInt();
   
	  
	        switch (n) 
	        {
	        
	        case 1:
	        	System.out.println("la opcion 1 ha sido registrada usted va a sumar\n");
	        	System.out.println("introduzca un numero:");
	        	numerouno= enter.nextDouble(); 
	        	 System.out.println("introduzca otro numero:");
	            numerodos= enter.nextDouble();
	            resultado= numerouno + numerodos;
	            System.out.println(resultado);		
	            break;
	            
	        case 2:	
	        	System.out.println("la opcion 2 ha sido registrada usted va a restar\n");
	        	System.out.println("introduzca un numero:");
	        	numerouno= enter.nextDouble(); 
	        	 System.out.println("introduzca otro numero:");
	            numerodos= enter.nextDouble();
	            resultado= numerouno - numerodos;
	            System.out.println(resultado);	
	        	break;
	        	
	        case 3:	
	        	System.out.println("la opcion 3 ha sido registrada usted va a multiplicar\n");
	        	System.out.println("introduzca un numero:");
	        	numerouno= enter.nextDouble(); 
	        	 System.out.println("introduzca otro numero:");
	            numerodos= enter.nextDouble();
	            resultado= numerouno * numerodos;
	            System.out.println(resultado);
	        	break;
	        	
	        case 4: 
	        	System.out.println("la opcion 4 ha sido registrada usted va a dividir\n");
	        	System.out.println("introduzca un numero:");
	        	numerouno= enter.nextDouble(); 
	        	 System.out.println("introduzca otro numero:");
	            numerodos= enter.nextDouble();
	            resultado= numerouno / numerodos;
	            System.out.println(resultado);
	        	break;
	        	
	        default: 
	        	System.out.println("la opcion no se encuentra disponible en estos momentos");
	        	break;
	        	
	        }
	    }
	 
	 
}

