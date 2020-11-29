package Colas;
import java.util.*;

public class OperacionesColas {
	
	Scanner leer=new Scanner (System.in);
	
	 String [] arreglo=new String [5];
	 int tope=-1;
	 
	 
	  public void insertarcc()
	 {
	   if(tope >= arreglo.length-1){
	            System.out.println("La pila esta´ llena");
	        }
	        else{
	            tope +=1;
	            System.out.println("Ingrese los datos  ");            
	            arreglo[tope] =leer.nextLine();
	        }
	 }
	 
	  
	 public void eliminarc()
	 {
	     
	     if(tope == -1){
	            System.out.println("Corazon no hay nada ");
	        }
	        else{
	            System.out.println("Se elimino un elemento");
	            arreglo[tope-1]= "";
	         tope--;
	        } 
	     
	 }
	 
	   
	 public void mostarc ()
	 {
	     for(int tope = 4; tope >= 0; tope--){
	            System.out.println("" +arreglo[tope]);            
	        }
	 }
	  
	   public void Menu(){
	        Scanner leer=new Scanner(System.in); 
	        int opcion,opc;
	        
	        do{
	        System.out.println("**********************************************");
	        System.out.println("++++++++++++++Colas  ++++++++++++++++");
	        System.out.println("1.- Insertar ");
	        System.out.println("2.- Eliminar  ");
	        System.out.println("3.- mostrar   ");
	        System.out.println("4.- Salir  ");
	        System.out.println("**********************************************");
	        System.out.println("Elige una opcion ---->");
	        opcion=leer.nextInt();
	        switch(opcion){
	            case 1:
	              insertarcc();
	                
	            break;
	                
	            case 2:
	              eliminarc();  
	            break;
	                
	            case 3:
	               mostarc();
	            break;
	            
	         
	               
	             
	            case 4:
	                System.out.println("CAMBIO Y FUERA ");
	            break;
	                
	            
	            default: 
	            {
	                System.out.println("Corazon la opcion que ingresaste es incorresta :c  ");    
	            }    
	                
	                
	        }
	    
	            System.out.println("--Quieres seguir en el menu ingresa-- 7)si  8)no"); 
	            opc=leer.nextInt();
	}
	        while(opc==7);
	        
	        if(opc==8){
	            System.out.println("Gracias por estar aqui");
	        }
	                
	         
	     
	     
	                
	     }
	    
	    
	    
	}

		
		
		
		
		
	



	
	
