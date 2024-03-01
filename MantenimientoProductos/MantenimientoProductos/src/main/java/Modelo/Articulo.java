/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ariel
 */
public class Articulo {
    
    //variables
    private String codigo;
    private String articulo;
    private int cantidad;

    
    //constructor
    public Articulo() {
    }

    
    public Articulo(String codigo, String articulo, int cantidad) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    //metodos get
    public String getCodigo() {
        return codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    //metodos set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getInformacionArticulo()
            {
                return "\nN. Codigo: " + getCodigo() + " Articulo: " + getArticulo() + " Cantidad: " + getCantidad();
            }
            
}