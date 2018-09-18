public class Prueba{
    public static void main(String[] args) {
      Tienda Sanborns = new Tienda(1500,"Av. tienda 1");
      Tienda Liverpool = new Tienda(3000,"Av. Londres 7");
      Tienda Sara = new Tienda(8000,"Prolongacion Dinero 9");
      Tienda RadioShak = new Tienda(9222,"calle deudas 18");

      Producto papas = new Producto(10,"Sabritas");
      Sanborns.setProducto(papas);
      Producto refresco = new Producto(12,"Pepsi");
      Sanborns.setProducto(refresco);
      Producto pan = new Producto(10,"Bimbo");
      Sanborns.setProducto(pan);
      Producto panDulce = new Producto(8,"Negrito");
      Sanborns.setProducto(panDulce);
      Empleado martin = new Empleado(5000,"Martin Rodriguez","Cajero");
      Sanborns.setEmpleado(martin);
      Empleado juan = new Empleado(5000,"Martin Rodriguez","Cajero");
      Sanborns.setEmpleado(juan);
      Empleado jorge = new Empleado(5000,"Martin Rodriguez","Cajero");
      Sanborns.setEmpleado(jorge);
      Empleado pedro = new Empleado(5000,"Martin Rodriguez","Cajero");
      Sanborns.setEmpleado(pedro);

      

    }
}
