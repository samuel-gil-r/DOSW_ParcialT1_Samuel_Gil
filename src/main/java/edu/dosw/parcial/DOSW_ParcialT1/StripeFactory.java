package edu.dosw.parcial.DOSW_ParcialT1;

public class StripeFactory implements IProveedorFactory {
    @Override
    public RespuestaPago procesarPago(SolicitudPago s) {
        String respuesta = "stripe_status=succeeded&charge_id=ch_992341";
        if (respuesta.contains("succeeded"))
            return new RespuestaPago("APROBADO", "TX-992341",
                    "Pago procesado correctamente con Stripe",
                    java.time.LocalDate.now().toString());
        return new RespuestaPago("PENDIENTE", "TX-992341",
                "Transaccion en validacion bancaria",
                java.time.LocalDate.now().toString());
    }
}