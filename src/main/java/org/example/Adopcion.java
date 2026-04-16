package org.example;

import java.util.Date;

public class Adopcion {
    private int idAdopcion;
    private Date fechaAdopcion;
    private Mascota mascotaAdoptada; // Referencia a objeto Mascota [cite: 47, 76]
    private Adoptante nuevoDueño; // Referencia a objeto Adoptante [cite: 47, 77]

    public Adopcion(int idAdopcion, Mascota mascota, Adoptante adoptante) {
        this.idAdopcion = idAdopcion;
        this.mascotaAdoptada = mascota;
        this.nuevoDueño = adoptante;
        this.fechaAdopcion = new Date(); // Fecha actual [cite: 45]
    }

    public boolean procesarAdopcion() {
        // Verifica si la mascota está disponible [cite: 48, 78]
        if (!mascotaAdoptada.getEstaAdoptado()) {
            mascotaAdoptada.cambiarEstadoAdopcion(); // Cambia el estado del animal [cite: 48]
            System.out.println("¡Adopción procesada con éxito!");
            return true;
        } else {
            System.out.println("Error: La mascota ya ha sido adoptada.");
            return false;
        }
    }

    public String generarCertificado() {
        return "--- CERTIFICADO DE ADOPCIÓN ---\n" +
                "Folio: " + idAdopcion + "\n" +
                "Fecha: " + fechaAdopcion + "\n" +
                "Adoptante: " + nuevoDueño.getNombreCompleto() + "\n" +
                "Mascota: " + mascotaAdoptada.getNombre() + "\n" +
                "-------------------------------";
    }
}
