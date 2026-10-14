public class Cuenta {
    // para crear un atributo , necesitamos un modificador de acceso( public , private o protected)
    // + tipo + nombre
    // private solo acceso dentro de la propia clase
    //encapsulacion : atributos privados + metodos publicos get y set
    public String cliente;
    public String numerodecuenta;
    public double interes;
    public double saldo;

// constructores---> por defcto , por parametros , copia
    //public + nombre de la clase(parametros)
    public Cuenta (String cliente, double interes, String numerodecuenta, double saldo){
        this.cliente=cliente;
        this.interes=interes;
        this.numerodecuenta=numerodecuenta;
        this.saldo=saldo;
    }

    // get--- public + tipo de valor  + nombre(){
    // return valor;
    //}

    public String getCliente(){
        return cliente;
    }
    public double getInteres() {
        return interes;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getnumerodecuenta() {
        return numerodecuenta;
    }
    // setter --> public +void + nombre (ojo-----atributo obligatorio)
    // this.atributo= parametro
    //}
    public void setcliente(String cliente){
        this.cliente=cliente;
    }
    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


