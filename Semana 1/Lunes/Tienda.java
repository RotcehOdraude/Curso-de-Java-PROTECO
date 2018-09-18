import java.util.ArrayList;
public class Tienda{
  private int dineroGuardado;
  private String direccion;
  private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
  private ArrayList<Producto> productos = new ArrayList<Producto>();
  static int contadorPrdoductos = 0;
  static int contadorEmpleados = 0;

  public Tienda(int dineroGuardado, String direccion){
    this.dineroGuardado = dineroGuardado;
    this.direccion = direccion;
  }
  public void setEmpleado(Empleado emp){
    empleados.add(emp);
    contadorEmpleados++;
  }
  public void setProducto(Producto prod){
    productos.add(prod);
    contadorPrdoductos++;
  }
}
