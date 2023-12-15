/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.lachupas;

import java.time.LocalDate;

enum Productos{TORNILLO, TUERCA, ARANDELA, SOPLETE, OTHER}
public class Bill {
    
    private Productos[] productos;
    private float[] precios;
    private LocalDate fecha;
    
    public Bill (Productos[] miProducto, float[] miPrecio, LocalDate miFecha){
        productos = miProducto;
        precios = miPrecio;
        fecha = miFecha;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public void setProductos(Productos[] productos) {
        this.productos = productos;
    }

    public float[] getPrecios() {
        return precios;
    }

    public void setPrecios(float[] precios) {
        this.precios = precios;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    } 
}
