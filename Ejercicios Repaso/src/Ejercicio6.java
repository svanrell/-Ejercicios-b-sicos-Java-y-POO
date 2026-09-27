public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("PRUEBA DE LA CLASE PRODUCTO");

        // PRODUCTOS
        Producto producto1 = new Producto("Teclado Mecánico", 45.0);
        Producto producto2 = new Producto("Ratón Inalámbrico", 25.0);

        System.out.println("\n1. Valores iniciales de los productos:");
        System.out.println("Producto 1 -> Nombre: " + producto1.getNombreProducto() + " | Precio: "
                + producto1.getPrecio() + " €");
        System.out.println("Producto 2 -> Nombre: " + producto2.getNombreProducto() + " | Precio: "
                + producto2.getPrecio() + " €");

        System.out.println("\n2. Convertir precio a pesetas (Producto 1):");
        producto1.cambiaPrecioAPesetas();
        System.out.println("Producto 1 -> Nombre: " + producto1.getNombreProducto() + " | Precio en pesetas: "
                + producto1.getPrecio() + " pts");

        System.out.println("\n3. Modificar precio de Producto 2 a null:");
        producto2.setPrecio(null);
        System.out.println(
                "Producto 2 -> Nombre: " + producto2.getNombreProducto() + " | Precio: " + producto2.getPrecio());
        System.out.println("\n4. Llamar a cambiaPrecioAPesetas con precio null:");
        producto2.cambiaPrecioAPesetas();
    }

    public static class Producto {
        private String nombreProducto;
        private Double precio; // uso el objeto Double en mayúsculas porque las primitivas (double) no aceptan null y no queda de otra.

        public Producto(String nombreProducto, Double precio) {
            this.nombreProducto = nombreProducto;
            this.precio = precio;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;
        }

        public String getNombre() {
            return nombreProducto;
        }

        public void setNombre(String nombre) {
            this.nombreProducto = nombre;
        }

        public Double getPrecio() {
            return precio;
        }

        public void setPrecio(Double precio) {
            this.precio = precio;
        }

        public void cambiaPrecioAPesetas() {
            try {
                this.precio = this.precio * 166;
            } catch (NullPointerException e) {
                System.out.println("Error: No se puede convertir a pesetas porque el precio es null.");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Ejercicio6.main(args);
    }
}
