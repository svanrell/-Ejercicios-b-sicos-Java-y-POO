import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("1. FUNCIÓN SALUDO");
        saludo("Carlos");
        saludo("");

        System.out.println("\n2. FUNCIÓN MEDIA");
        int[] notas = {5, 7, 8, 9, 6};
        System.out.println("La media de las notas es: " + media(notas));

        System.out.println("\n3. FUNCIÓN FORMATEAR ARRAY");
        String[] elementos = {"Primero", "Segundo", "Tercero", "Cuarto"};
        formatearArray(elementos);

        System.out.println("\n4. FUNCIÓN ORDENAR STRINGS");
        List<String> listaOrdenada = ordenarStrings("Zanahoria", "manzana", "Plátano", "kiwi", "fresa", "Aguacate");
        System.out.println("Lista ordenada (sin distinguir mayúsculas): " + listaOrdenada);

        System.out.println("\n5. FUNCIÓN DEVOLVER NÚMERO MÁS ALTO");
        int[] numeros = {14, 52, 9, 87, 23, 65};
        System.out.println("El número más alto del array es: " + devolverNumeroMasAlto(numeros));
    }

    public static void saludo(String texto) {
        if (texto.isEmpty()) {
            System.out.println("No ha introducido texto");
        } else {
            System.out.println("Hola " + texto);
        }
    }

    public static double media(int[] numeros) {
        int sumaNotas = 0;
        int cantidadNotas = numeros.length;
        for (int numero : numeros) {
            sumaNotas += numero;
        }
        return (double) sumaNotas / cantidadNotas;
    }

    public static void formatearArray(String[] lista){
        for (int i=0; i < lista.length; i++){
            System.out.println("El elemento " + i + " de la lista es: " + lista[i]);
        }
    }

    public static List<String> ordenarStrings(String texto1, String texto2, String texto3, String texto4, String texto5, String texto6){
        List<String> listaPalabras = new ArrayList<>(List.of(texto1,texto2,texto3,texto4,texto5,texto6));
        listaPalabras.sort(String.CASE_INSENSITIVE_ORDER); // compara el texto dándole igual mayúsculas y minúsculas
        return listaPalabras;
    }

    public static int devolverNumeroMasAlto(int[] numeros){
        int max= numeros[0];
        for (int i=1; i < numeros.length; i++){
            if (numeros[i] > max){
                max = numeros[i];
            }
        }
        return max;
    }
}
