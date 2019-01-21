package ejercicios;
import java.util.Scanner;

public class Ejercicio1 
{
    public static int tope;
    public static int multiplos[] = new int[1000];
    public void Problema1()
    {
        Scanner teclado = new Scanner(System.in);
        int suma=0;
        int repetir=0;
        Ejercicio1 op= new Ejercicio1();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Si enumeramos todos los números naturales por debajo de 10 que son múltiplos de 3 o 5, obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.\n" 
            + "Encuentra la suma de todos los múltiplos de 3 o 5 debajo de 1000.");
        System.out.print("Altere el ejercicio para que el usuario pueda asignar hasta que numero tope llegar. Por facor digite el tope: ");
        tope = teclado.nextInt();
        op.numeros();
        System.out.println("Estos son los multiplos de 3 y 5 del 1 al " + tope);
        for(int i=0;i<multiplos.length;i++)
        {
            if(multiplos[i]==0)
            {
                break;
            }
            else
            {          
                System.out.print(multiplos[i] +" ");
                if(i%20==0)
                {
                    if(i!=0)
                    {
                        System.out.println("");
                    }
                }
            }
        }
        suma = op.suma();
        System.out.println("\nY la suma total de estos numeros seria: " + suma);
        do {            
            System.out.println("Desea Volver realizar el ejercicio?(1 si o 2 no)");
            repetir = teclado.nextInt();
            switch(repetir)
            {
                case 1: Problema1();break;
                default: System.out.println("Opcion no disponible");
            }
        } while (repetir!=2);
    }
    public void numeros()
    {
        int contador=0;
        for(int i=1; i<tope; i++)
        {
            if(i%5==0 && i%3==0)
            {
                multiplos[contador] = i;
                contador++;
            }
            else
            {
                if(i%3==0)
                {
                    multiplos[contador] = i;
                    contador++;
                }
                else
                {
                    if(i%5==0)
                    {
                        multiplos[contador] = i;
                        contador++;
                    }
                }
            }
        }
    }
    public int suma()
    {
        int resultado=0;
        for(int i=0;i<multiplos.length;i++)
        {
            resultado= multiplos[i] + resultado;
        }
        return resultado;
    }
}
