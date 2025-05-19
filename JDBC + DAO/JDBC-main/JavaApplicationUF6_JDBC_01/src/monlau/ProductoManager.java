
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        ProductoDAO producto =new ProductoDAOImpl();
        
        //agregar nuevo producto
        //producto.insert(new Producto(200,"Pollo",10.0));
        
        //obtener el producto con el ID = 100
        Producto p = producto.read(200);
        System.out.println(p);

        Producto pi = (new Producto(201, "Pollo", 10.0));
        System.out.println(pi);
        Producto pu = (new Producto(202, "Pollo", 10.0));
        System.out.println(pu);
        Producto pd = (new Producto(203, "Pollo", 10.0));
        System.out.println(pd);
    }
}
