import Entidades.Vendedor;
import Servicio.VendedorServicio;

public class Main {
    public static void main(String[] args) throws Exception {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
}
