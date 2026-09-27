public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE LA CLASE PERSONA ===");

        Persona persona1 = new Persona("Ana López", 20, 1.65);
        Persona persona2 = new Persona("Carlos Gómez", 35, 1.82);

        System.out.println("\n1. Información inicial");
        persona1.mostrarInfo();
        persona2.mostrarInfo();

        System.out.println("\n2. Conversión de altura a centímetros");
        System.out.println(persona1.getNombre() + " mide " + persona1.convertirAlturaACentimetros() + " cm");
        System.out.println(persona2.getNombre() + " mide " + persona2.convertirAlturaACentimetros() + " cm");

        System.out.println("\n3. Cumplir años");
        System.out.println(persona1.getNombre() + " cumple años...");
        persona1.cumplirAnios();
        persona1.mostrarInfo();

        System.out.println(persona2.getNombre() + " cumple años...");
        persona2.cumplirAnios();
        persona2.mostrarInfo();
    }

    public static class Persona {
        private String nombre;
        private int edad;
        private double altura; // en metros

        public Persona(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void cumplirAnios() {
            this.edad++;
        }

        public void mostrarInfo() {
            System.out.println(
                    "Nombre: " + this.nombre + " | Edad: " + this.edad + " años | Altura: " + this.altura + " m");
        }

        public double convertirAlturaACentimetros() {
            return this.altura * 100;
        }
    }
}
