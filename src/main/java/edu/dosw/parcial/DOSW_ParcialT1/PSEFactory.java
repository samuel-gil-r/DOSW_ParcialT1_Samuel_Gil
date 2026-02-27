package edu.dosw.parcial.DOSW_ParcialT1;

public class PSEFactory implements IProveedorFactory {
    @Override
    public RespuestaPago procesarPago(SolicitudPago s) {
        String respuesta = "ESTADO=APROBADO|REFERENCIA=PSE-445521";
        if (respuesta.contains("APROBADO"))
            return new RespuestaPago("APROBADO", "TX-445521",
                    "Pago PSE procesado exitosamente",
                    java.time.LocalDate.now().toString());
        return new RespuestaPago("RECHAZADO", null,
                "Pago rechazado por PSE",
                java.time.LocalDate.now().toString());
    }
}
