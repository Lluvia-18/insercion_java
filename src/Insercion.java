//Autores:Lluvia Estefania Villanueva Lazo 
//Katya Valentina Grifaldo Martinez
//Fecha: 09/11/2026
//GTID244
//Implementacion del pseudocodigo a java


import java.util.Arrays;

public class Insercion {

    // Ordenamiento por inserción (ascendente)
    public static void insercion(int[] arreglo) {
        int n = arreglo.length;                       // n = tamaño del arreglo

        for (int i = 1; i <= n - 1; i++) {            // Para i = 1 hasta n-1
            int clave = arreglo[i];                   // clave = arreglo[i]
            int j = i - 1;                            // j = i - 1

            while (j >= 0 && arreglo[j] > clave) {    // Mientras j >= 0 y arreglo[j] > clave
                arreglo[j + 1] = arreglo[j];          // arreglo[j+1] = arreglo[j]
                j--;                                  // j = j - 1
            }                                         // FinMientras

            arreglo[j + 1] = clave;                   // arreglo[j+1] = clave
        }                                             // FinPara
    }

    public static void main(String[] args) {
        int[] tarjetas = {5, 3, 8, 4, 2};

        System.out.println("Arreglo en desorden: " + Arrays.toString(tarjetas));

        insercion(tarjetas);

        System.out.println("Arreglo ordenado: " + Arrays.toString(tarjetas));
    }
}