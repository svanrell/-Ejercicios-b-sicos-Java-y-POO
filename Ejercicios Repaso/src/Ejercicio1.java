public class Ejercicio1 {
    public static void main(String[] args) {
        int numero1 = 8;
        System.out.println("EJEMPLO 1 (menor que 15):");
        System.out.println(comprobarNumero(numero1));

        int numero2 = 15;
        System.out.println("EJEMPLO 2 (igual a 15):");
        System.out.println(comprobarNumero(numero2));

        int numero3 = 22;
        System.out.println("EJEMPLO 3 (mayor que 15):");
        System.out.println(comprobarNumero(numero3));

        System.out.println("\nEJECUCIÓN DEL 5 AL 30:");
        for (int i = 5; i < 31; i++) {
            System.out.println(comprobarNumero(i));
        }
    }

    public static String comprobarNumero(int numero) {
        if (numero < 15) {
            return "El número: " + numero + " es menor que 15";
        } else if (numero > 15) {
            return "El número: " + numero + " es mayor que 15";
        } else {
            return "El número: " + numero + " es igual a 15";
        }
    }
}