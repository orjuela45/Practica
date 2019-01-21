package ejercicios;

import java.util.Scanner;

public class Ejercicio2 
{
    public static int serie[]= new int[1000];
    public void Problema2()
    {
        Scanner teclado = new Scanner(System.in);
        int repetir=0;
        int maximo=0;
        int suma=0;
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Cada nuevo término en la secuencia de Fibonacci se genera al agregar los dos términos anteriores. Al comenzar con 1 y 2, los primeros 10 términos serán:\n" +
            "1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...\nAl considerar los términos en la secuencia de Fibonacci cuyos valores no exceden los cuatro millones, encuentre la suma de los términos de valor par.");
        System.out.print("En este programa el usuario digitara el numero de terminos de la serie de Fibonacci  y luego sumara los pares. Digite el numero de terminos: ");
        maximo = teclado.nextInt();
        System.out.println("La serie de Fibonacci de los primeros " + maximo + " son:");
        Fibonacci(maximo);
        suma = suma(maximo);
        System.out.println("Y la suma de los pares de la serie anterior de Fibonacci es: " + suma);
        do {            
            System.out.println("Desea Volver realizar el ejercicio?(1 si o 2 no)");
            repetir = teclado.nextInt();
            switch(repetir)
            {
                case 1: Problema2();break;
                default: System.out.println("Opcion no disponible");
            }
        } while (repetir!=2);
    }
    public void Fibonacci(int maximo)
    {
        int nuevo=0,viejo1=1, viejo2=0; 
        for(int i=0; i<maximo;i++)
        {
            nuevo = viejo1 + viejo2;
            serie[i] = nuevo;
            viejo2 = viejo1;
            viejo1 = nuevo;                   
        }
        for(int i=0; i<maximo;i++)
        {
            if(serie[i]==0)
            {
                break;
            }
            else
            {
                System.out.print(serie[i]+ ", ");
            }
        }
    }
    public int suma(int maximo)
    {
        int resultado=0;
        for(int i=0;i<maximo;i++)
        {
            if(serie[i]%2==0)
            {
                resultado =  resultado + serie[i];
            }
        }
        return resultado;
    }
}
