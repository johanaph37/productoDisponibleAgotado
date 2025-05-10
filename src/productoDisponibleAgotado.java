import java.util.Scanner;
public class productoDisponibleAgotado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de stock del producto:");
        int cantidadProducto = sc.nextInt();
        if (cantidadProducto > 0) {
            System.out.println("Disponible");
        } else {System.out.println("Agotado");}
        sc.close();
    }
}
