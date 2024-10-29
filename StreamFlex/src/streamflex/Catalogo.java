/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamflex;

/**
 *
 * @author Cetecom
 */
public abstract class Catalogo {
    private int id;
    private String recomendada;
    private String TipoContenido;

    public Catalogo() {
    }
    public Catalogo(int id, String recomendada, String TipoContenido) {
        this.id = id;
        this.recomendada = recomendada;
        this.TipoContenido = TipoContenido;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getRecomendada() {
        return recomendada;
    }

    public void setRecomendada(String recomendada) {
        this.recomendada = recomendada;
    }

    public String getTipoContenido() {
        return TipoContenido;
    }

    public void setTipoContenido(String TipoContenido) {
        this.TipoContenido = TipoContenido;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "id=" + id + ", recomendada=" + recomendada + ", TipoContenido=" + TipoContenido + '}';
    }
    
}
