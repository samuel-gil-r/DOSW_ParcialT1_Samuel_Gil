package edu.dosw.parcial.DOSW_ParcialT1;

public class ePaycoFactory implements IProveedorFactory {
    @Override
    public RespuestaPago procesarPago(SolicitudPago s) {
        String respuesta = "x_response=Aceptada&x_transaction_id=EP-112233";
        if (respuesta.contains("Aceptada"))
            return new RespuestaPago("APROBADO", "TX-112233",
                    "Pago procesado correctamente con ePayco",
                    java.time.LocalDate.now().toString());
        return new RespuestaPago("RECHAZADO", null,
                "Pago rechazado por ePayco",
                java.time.LocalDate.now().toString());
    }
}