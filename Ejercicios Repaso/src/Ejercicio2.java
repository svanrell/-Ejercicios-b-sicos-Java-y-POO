public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = "Hola que tal todo";
        System.out.println("EJEMPLO 1: \"" + texto + "\"");
        System.out.println("Longitud: " + comprobarLongitud(texto));
        System.out.print("Contiene hola: " + comprobarSiContieneHola(texto));
        System.out.println("Reemplazar hola: " + reemplazarHola(texto));
        System.out.println("Vocales: la cadena tiene " + calcularVocales(texto) + " vocales");

        String texto2 = "Buenos dias a todos";
        System.out.println("EJEMPLO 2 (sin 'hola'): \"" + texto2 + "\"");
        System.out.println("Longitud: " + comprobarLongitud(texto2));
        System.out.println("Contiene hola: " + comprobarSiContieneHola(texto2));
        System.out.println("Reemplazar hola: " + reemplazarHola(texto2));
        System.out.println("Vocales: la cadena tiene " + calcularVocales(texto2) + " vocales");

        String texto3 = "hola";
        System.out.println("EJEMPLO 3: \"" + texto3 + "\"");
        System.out.println("Longitud: " + comprobarLongitud(texto3));
        System.out.print("Contiene hola: " + comprobarSiContieneHola(texto3));
        System.out.println("Reemplazar hola: " + reemplazarHola(texto3));
        System.out.println("Vocales: la cadena tiene " + calcularVocales(texto3) + " vocales");
    }

    public static String comprobarLongitud(String texto) {
        if (texto.length() < 5) {
            return "Texto corto";
        } else {
            return "Texto largo";
        }
    }

    public static String comprobarSiContieneHola(String texto) {
        String mensaje = "";
        String[] palabras = texto.strip().toLowerCase().split("\\s+"); // separa el texto por los espacios

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals("hola")) {
                mensaje += "La subcadena 'hola' " + "aparece en la posición: " + i + "\n";
            }
        }

        if (mensaje.isEmpty()) {
            mensaje = "Mi texto: " + texto + " no contiene la cadena hola";
        }
        return mensaje;
    }

    public static String reemplazarHola(String texto) {
        String[] palabras = texto.strip().toLowerCase().split("\\s+");
        boolean modificado = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals("hola")) {
                palabras[i] = "adios";
                modificado = true;
            }
        }

        if (modificado) {
            return String.join(" ", palabras); // hacemos la frase con espacios en blanco entre palabras
        } else {
            return "Mi texto no contiene la subcadena hola";
        }
    }

    public static int calcularVocales(String texto) {
        enum vocales {
            a,
            e,
            i,
            o,
            u,
        }
        int contador = 0;
        String textoMin = texto.strip().toLowerCase();

        for (int i = 0; i < textoMin.length(); i++) {
            char letra = textoMin.charAt(i);
            for (vocales vocal : vocales.values()) {
                if (vocal.name().equals(String.valueOf(letra))) { // transformar del objeto vocales a String para poder
                                                                  // compararlo
                    contador += 1;
                    break;
                }
            }
        }
        return contador;
    }
}
