public class MPO1 {
    public static void main (String[] args) {
       // ¿como crear un objeto?
        //nombre de la clase + nombre del objeto = new + nombre del constructor+();
        // nombre constructor tendra el mismo nombre que el nombre de la clase
        Cuenta c1 = new Cuenta("Carlos", 2.34,"ES34235235235234", 2000);
        // c1.cliente = "Pepe";
        //c1.numerodecuenta = "ES34346346236345";
        //c1.interes= 4.5;
        //c1.saldo= 1000;
        //System.out.println(c1.cliente);
        System.out.println(c1.getCliente());
        Cuenta c2= new Cuenta("Pepe",3.14, "ES353464563635646", 1000 );
    }
}
