package edu.dosw.parcial.DOSW_ParcialT1;

public class RespuestaPago {
    private String estado, codigoTransaccion, mensaje, fecha;

    public RespuestaPago(String estado, String codigoTransaccion,
                         String mensaje, String fecha) {
        this.estado = estado;
        this.codigoTransaccion = codigoTransaccion;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "\n Estado:  " + estado +
                "\n Codigo:  " + codigoTransaccion +
                "\n Mensaje: " + mensaje +
                "\n Fecha:   " + fecha;
    }
}
