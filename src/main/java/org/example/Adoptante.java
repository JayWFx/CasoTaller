package org.example;

public class Adoptante {
    private int idAdoptante;
    private String nombreCompleto;
    private String telefono;
    private String direccion;

    public Adoptante(int idAdoptante, String nombreCompleto, String telefono, String direccion) {
        this.idAdoptante = idAdoptante;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void registrarAdoptante() {
        System.out.println("Perfil creado para: " + nombreCompleto);
    }

    public void solicitarAdopcion() {
        System.out.println(nombreCompleto + " ha iniciado una solicitud de interés.");
    }

    // Getter para el certificado
    public String getNombreCompleto() { return nombreCompleto; }
}
