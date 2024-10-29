/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Catalogo {
    private int duracion;
    private String enfoque;    

    public Documentales() {
    }

    public Documentales(int duracion, String enfoque) {
        this.duracion = duracion;
        this.enfoque = enfoque;
    }

    public Documentales(int duracion, String enfoque, int id, String recomendada, String TipoContenido) {
        super(id, recomendada, TipoContenido);
        this.duracion = duracion;
        this.enfoque = enfoque;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEnfoque() {
        return enfoque;
    }

    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

    @Override
    public String toString() {
        return "Documentales{" + "duracion=" + duracion + ", enfoque=" + enfoque + '}';
    }

  
}