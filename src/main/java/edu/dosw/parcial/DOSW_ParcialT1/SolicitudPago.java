package edu.dosw.parcial.DOSW_ParcialT1;

public class SolicitudPago {
    private String nombre, documento, correo, concepto, moneda, medioPago;
    private double monto;

    public SolicitudPago(String nombre, String documento, String correo,
                         String concepto, double monto, String moneda, String medioPago) {
        this.nombre = nombre;       this.documento = documento;
        this.correo = correo;       this.concepto = concepto;
        this.monto = monto;         this.moneda = moneda;
        this.medioPago = medioPago;
    }

    public String getNombre()    { return nombre; }
    public String getDocumento() { return documento; }
    public String getCorreo()    { return correo; }
    public String getConcepto()  { return concepto; }
    public double getMonto()     { return monto; }
    public String getMoneda()    { return moneda; }
    public String getMedioPago() { return medioPago; }
}
