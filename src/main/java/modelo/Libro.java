/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dremi7w7
 */
public class Libro {
    private Categoria categoria; 
    private int codigo;
    private String nombre; 
    private int year; 

    public Libro(Categoria categoria, int codigo, String nombre, int year) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.year = year;
    }

    public Libro(Categoria categoria, Integer codigo, String nombre, Integer year) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.year = year;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getYear() {
        return year;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Libro{" + "categoria=" + categoria + ", codigo=" + codigo + ", nombre=" + nombre + ", year=" + year + '}';
    }

}
