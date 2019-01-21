package ejercicios;

import java.util.Scanner;
import sun.security.util.Length;

public class Menu 
{
    public static void main(String[] args) 
    {
        ejercicios.Ejercicio1 op1 = new ejercicios.Ejercicio1();
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        do 
        {                
            System.out.println("----------MENU-------------");
            System.out.println("Estos son los ejercicios que he realizado de la pagina Proyect euler");
            System.out.println("Ejercicio 1");
            System.out.print("Selecciona el numero del ejercio:");
            opcion = teclado.nextInt();
            switch(opcion)
            {
                case 1: op1.Porblema1();break;
                default: System.out.println("Opcion no disponible.");
            }
        } 
        while (opcion!=0);
        {
            System.out.println("Fin del programa");
            System.out.println("Hecho por Miguel Orjuela");
        }
    }
}
