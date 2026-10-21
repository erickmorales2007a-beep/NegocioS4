public class Main {
    public static void main(String[] args) {
        System.out.println("Total antes de crear objetos: " + Producto.getTotalCreados());

        Producto producto1 = new Producto("Mouse", 20, "Tecnología");
        System.out.println("Después de crear uno - Total: " + Producto.getTotalCreados());

        Producto producto2 = new Producto("Teclado", 45, "Tecnología");
        Producto producto3 = new Producto("Laptop", 850, "Computación");

        System.out.println("Total después de crear tres: " + Producto.getTotalCreados());

        System.out.println("\n--- Detalle de Productos ---");
        System.out.println("Objeto 1 → ID " + producto1.getId() + " | Nombre: " + producto1.getNombre());
        System.out.println("Objeto 2 → ID " + producto2.getId() + " | Nombre: " + producto2.getNombre());
        System.out.println("Objeto 3 → ID " + producto3.getId() + " | Nombre: " + producto3.getNombre());
    }
}