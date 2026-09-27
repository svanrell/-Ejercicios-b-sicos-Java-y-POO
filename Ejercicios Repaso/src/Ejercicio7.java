public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("PRUEBA DE LA CLASE EMPLEADO");

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        empleado1.setNombre("Lucía Gómez");
        empleado1.setSalarioMensual(1800.0);

        empleado2.setNombre("Carlos Ruiz");
        empleado2.setSalarioMensual(2400.0);

        System.out.println("\n1. Valores iniciales de los empleados:");
        System.out.println("Empleado 1 -> Nombre: " + empleado1.getNombre() + " | Salario mensual: "
                + empleado1.getSalarioMensual() + " €");
        System.out.println("Empleado 2 -> Nombre: " + empleado2.getNombre() + " | Salario mensual: "
                + empleado2.getSalarioMensual() + " €");

        System.out.println("\n2. Calcular salario anual de Empleado 1:");
        empleado1.calcularSalarioAnual();
        System.out.println("Empleado 1 -> Salario anual: " + empleado1.getSalarioMensual() + " €");

        System.out.println("\n3. Modificar salario mensual de Empleado 2 a null:");
        empleado2.setSalarioMensual(null);
        System.out.println("Empleado 2 -> Nombre: " + empleado2.getNombre() + " | Salario mensual actual: "
                + empleado2.getSalarioMensual());

        System.out.println("\n4. Calcular salario anual de Empleado 2 con salario null:");
        empleado2.calcularSalarioAnual();
    }

    public static class Empleado {
        private String nombre;
        private Double salarioMensual;

        public Empleado() {
        }

        public Empleado(String nombre, Double salarioMensual) {
            this.nombre = nombre;
            this.salarioMensual = salarioMensual;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Double getSalarioMensual() {
            return salarioMensual;
        }

        public void setSalarioMensual(Double salarioMensual) {
            this.salarioMensual = salarioMensual;
        }

        public void calcularSalarioAnual() {
            try {
                this.salarioMensual = this.salarioMensual * 12;
            } catch (NullPointerException e) {
                System.out.println("Error: No se puede calcular el salario anual porque el salario mensual es null.");
            }
        }
    }
}

class MaiN {
    public static void main(String[] args) {
        Ejercicio7.main(args);
    }
}
