import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("1. FUNCIÓN COMPROBAR STRING EN LISTA");
        String[] lenguajes = {"Java", "Python", "C++", "Kotlin"};
        System.out.println("¿Está 'python' en la lista?: " + comprobarStringEnLista(lenguajes, "python"));
        System.out.println("¿Está 'JavaScript' en la lista?: " + comprobarStringEnLista(lenguajes, "JavaScript"));

        System.out.println("\n2. FUNCIÓN ELIMINAR ELEMENTO");
        ArrayList<String> nombres = new ArrayList<>(List.of("Ana", "Juan", "Pedro", "María"));
        System.out.println("Lista inicial: " + nombres);
        System.out.println("Eliminar posición 1: " + eliminarElemento(nombres, 1));
        System.out.println("Lista resultante: " + nombres);
        System.out.println("Eliminar posición 10: " + eliminarElemento(nombres, 10));

        System.out.println("\n3. FUNCIÓN FILTRAR EXTREMOS");
        ArrayList<Double> extremosFiltrados = filtrarExtremos(15.5, 3.2, 8.7, 24.1, 1.0, 19.8);
        System.out.println("Lista sin el valor mínimo y máximo: " + extremosFiltrados);

        System.out.println("\n4. FUNCIÓN SUMAR POSITIVOS");
        ArrayList<Integer> numeros = new ArrayList<>(List.of(12, -7, 5, -3, 20, -1));
        System.out.println("La suma de los números positivos es: " + sumarPostivos(numeros));

        System.out.println("\n5. FUNCIÓN GUARDAR NO REPETIDOS");
        ArrayList<String> palabras = new ArrayList<>(List.of("sol", "luna", "Sol", "estrella", "LUNA", "mar"));
        System.out.println("Lista sin palabras repetidas: " + guardarNoRepetidos(palabras));
    }

    public static boolean comprobarStringEnLista(String[] lista, String texto) {
        if (lista == null || texto == null) {
            System.out.println("Error, no se puede introducir NULL como parámetro");
            return false;
        }

        for (String palabra : lista) {
            if (palabra.equalsIgnoreCase(texto)) {
                return true;
            }
        }
        return false;
    }

    public static String eliminarElemento(ArrayList<String> lista, int numero) {
        if (lista == null) {
            return "No se pueden introducir una lista vacía";
        }

        if (numero >= 0 && numero < lista.size()) {
            lista.remove(numero);
            return "Elemento eliminado";
        } else {
            return "Elemento no encontrado";
        }
    }

    public static ArrayList<Double> filtrarExtremos(double num1, double num2, double num3, double num4, double num5, double num6) {
        ArrayList<Double> lista = new ArrayList<>(List.of(num1, num2, num3, num4, num5, num6));
        lista.sort(null);
        lista.remove(lista.size() - 1);
        lista.remove(0);
        return lista;
    }

    public static int sumarPostivos(ArrayList<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (int numero : lista) {
            if (numero > 0) {
                total += numero;
            }
        }
        return total;
    }

    public static ArrayList<String> guardarNoRepetidos(ArrayList<String> lista) {
        if (lista == null){
            return new ArrayList<>();
        }

        ArrayList<String> nuevaLista = new ArrayList<>();
        for (String palabra : lista){
            boolean yaExiste = false;
            for (String palabraNueva : nuevaLista){
                if (palabra.equalsIgnoreCase(palabraNueva)){
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste){
                nuevaLista.add(palabra);
            }
        }
        return nuevaLista;
    }
}
