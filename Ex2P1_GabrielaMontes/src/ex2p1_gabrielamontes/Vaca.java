/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_gabrielamontes;

/**
 *
 * @author Gabriela Montes
 */
public class Vaca {
    public String nombre;
    public int venta;
    public int compra;

    public Vaca() {
    }

    public Vaca(String nombre, int venta, int compra) {
        this.nombre = nombre;
        this.venta = 400;
        this.compra = 350;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
