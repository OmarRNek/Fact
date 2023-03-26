import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {

    private int numeroFactura;
    private List<ItemFactura> items;

    public Factura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
        this.items = new ArrayList<ItemFactura>();
    }

    public void addItem(ItemFactura item) {
        items.add(item);
    }

    public void imprimirFactura() {
        double totalFactura = 0.0;
        double iva;
        double totalConIva;
        System.out.println("Número de factura: " + numeroFactura);
        System.out.println("Cliente:");
        System.out.println("Nombre: " + Cliente.getNombre());
        System.out.println("Direccion: " + Cliente.getDireccion());
        System.out.println("Codigo postal: " + Cliente.getCodigoPostal());
        System.out.println("Detalles de factura:");
        System.out.println("Producto \t Cantidad \t Precio \t SubTotal");
        for (ItemFactura item : items) {
            double totalLinea = item.getCantidad() * item.getPrecio();
            System.out.println(item.getProducto().getDescripcion() + "\t" + item.getCantidad() + "\t" + item.getPrecio() + "\t" + totalLinea);
            totalFactura += totalLinea;
        }
        iva = totalFactura * 0.16;
        totalConIva = totalFactura + iva;
        System.out.println("Total: " + totalConIva);
    }
}



