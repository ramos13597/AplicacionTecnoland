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
public class Juego {
    private String nombre;
    private Jugador[] vParticipantes;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.vParticipantes = new Jugador[5];
    }
    
    public Jugador[] ganadores(){
        Jugador vGanadores[] = new Jugador[3];
        //Recorrer el vector de jugadores y ordenarlos por puntuación
        
        
        //Devolver el vector con los 3 mejores jugadores
        return vGanadores;
    }
    
    
    
    public boolean anadirParticipante(Jugador jugador){
        //Hay que tener cuidado de que no se repita el nombre del jugador
        //Devolver si se ha podido inscribir el jugador o 
        //ya no hay sitio en el vector o el jugador ya está inscrito.
        return false;
    }
    
    
    public boolean ponerPuntosJugador(int puntos, String nombreJugador){
        
        
        //Devolver true si se han añadido correctamente
        //False si no se han podido añadir por no encontrar el jugador
        return false;
    }
    
    
    public String verJugadores(){
        //Devolver un listado de los jugadores inscritos en el juego
        return "";
    }
    
}
