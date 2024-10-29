/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Series extends Catalogo {
    private int temporadas;

    public Series() {
    }

    public Series(int temporadas) {
        this.temporadas = temporadas;
    }

    public Series(int temporadas, int id, String recomendada, String TipoContenido) {
        super(id, recomendada, TipoContenido);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Series{" + "temporadas=" + temporadas + '}';
    }
    
}