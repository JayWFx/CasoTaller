package org.example;
public class Main {
    public static void main(String[] args) {
        // 1. Crear objetos
        Mascota perro = new Mascota(101, "Rex", "Perro", 24);
        Adoptante persona = new Adoptante(505, "Juan Pérez", "555-1234", "Av. Siempre Viva 123");

        // 2. Ejecutar métodos iniciales
        perro.registrarMascota();
        persona.registrarAdoptante();

        // 3. Ver estado antes de adopción
        System.out.println(perro.mostrarInformacion());

        // 4. Realizar el trámite de adopción
        Adopcion tramite = new Adopcion(1, perro, persona);
        if (tramite.procesarAdopcion()) {
            // 5. Mostrar certificado si fue exitoso
            System.out.println(tramite.generarCertificado());
        }

        // 6. Ver estado final de la mascota
        System.out.println(perro.mostrarInformacion());
    }
}