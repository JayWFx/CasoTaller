package org.example;

public class Mascota {
    private int idMascota;
    private String nombre;
    private String especie;
    private int edadMeses;
    private boolean estaAdoptado; // Atributo privado [cite: 21, 61]

    public Mascota(int idMascota, String nombre, String especie, int edadMeses) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.edadMeses = edadMeses;
        this.estaAdoptado = false; // Por defecto inicia disponible [cite: 21]
    }

    public void registrarMascota() {
        System.out.println("Registrando mascota: " + nombre + " (" + especie + ")");
    }

    public void cambiarEstadoAdopcion() {
        this.estaAdoptado = true; // Cambia a verdadero al concretar el trámite [cite: 24, 63]
    }

    public String mostrarInformacion() {
        return "ID: " + idMascota + " | Nombre: " + nombre + " | Especie: " + especie +
                " | Edad: " + edadMeses + " meses | Adoptado: " + (estaAdoptado ? "Sí" : "No");
    }

    // Getters necesarios para la lógica de adopción
    public boolean getEstaAdoptado() { return estaAdoptado; }
    public String getNombre() { return nombre; }
}
