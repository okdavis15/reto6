package reto; 
 
import java.util.Scanner; 
 
public class Reto {     static int A = 10; 
    static int B = 5; 
 
    public static void main(String[] args) { 
       
        Scanner obj = new Scanner(System.in);         int Valor1;         int Valor2;         int Resultado;  
        int Parametro; 
 
        System.out.println("Ingersa el primer Valor:"); 
         
        Valor1 = obj.nextInt(); 
         
        System.out.println("Ingresa el segundo Valor:"); 
         
        Valor2 = obj.nextInt(); 
         
        Resultado = Valor1 + Valor2; 
         
        System.out.println("El resultado es: "+Resultado); 
         
        Parametro = A + B; 
        System.out.println("El resultado de la suma de los parametros es: "+Parametro); 
    } 
    
} 
