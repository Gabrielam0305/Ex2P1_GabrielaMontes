/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class Conejo {
    public String nombre;
    public int venta;
    public int compra;

    public Conejo() {
    }

    public Conejo(String nombre, int venta, int compra) {
        this.nombre = nombre;
        this.venta = 170;
        this.compra = 150;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    

}
