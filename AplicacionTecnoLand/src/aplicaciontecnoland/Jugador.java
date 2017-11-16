/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciontecnoland;

/**
 *
 * @author Profesor
 */
public class Jugador {
    private String nombre;
    private int edad;
    private int puntuacion;


    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = 0;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * @param puntuacion the puntuacion to set
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " \n" +
                "Edad: " + this.edad + " \n" +
                "Puntuación: " + this.puntuacion;
    }
    
    
    
    
    
    
}
