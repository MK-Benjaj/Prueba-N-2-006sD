/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Peliculas extends Catalogo{
    private int calificacion;
    private int duracion;

    public Peliculas() {
    }

    public Peliculas(int calificacion, int duracion) {
        this.calificacion = calificacion;
        this.duracion = duracion;
    }

    public Peliculas(int calificacion, int duracion, int id, String recomendada, String TipoContenido) {
        super(id, recomendada, TipoContenido);
        this.calificacion = calificacion;
        this.duracion = duracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "calificacion=" + calificacion + ", duracion=" + duracion + '}';
    }
    
}
