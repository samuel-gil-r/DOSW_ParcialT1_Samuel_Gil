package edu.dosw.parcial.DOSW_ParcialT1;

public class Main {
    public static void main(String[] args) {

        SolicitudPago solicitud = new SolicitudPago(
                "Juan Pérez",
                "1023456789",
                "juan.perez@mail.escuelaing.edu.co",
                "Bootcamp Backend",
                350000,
                "COP",
                "TARJETA"
        );

        IProveedorFactory factory = new PayUFactory();
        System.out.println(factory.procesarPago(solicitud));
    }
}