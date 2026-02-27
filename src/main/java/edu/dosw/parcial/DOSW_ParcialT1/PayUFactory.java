package edu.dosw.parcial.DOSW_ParcialT1;

public class PayUFactory implements IProveedorFactory {
    @Override
    public RespuestaPago procesarPago(SolicitudPago s) {
        String respuesta = "{\"state\":\"APPROVED\",\"orderId\":\"889231\"}";
        if (respuesta.contains("APPROVED"))
            return new RespuestaPago("APROBADO", "TX-889231",
                    "Pago procesado correctamente con PayU",
                    java.time.LocalDate.now().toString());
        return new RespuestaPago("RECHAZADO", null,
                "Pago rechazado por PayU",
                java.time.LocalDate.now().toString());
    }
}
