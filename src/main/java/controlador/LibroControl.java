/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Categoria;
import modelo.Libro;
import servicio.CategoriaServicio;
import servicio.LibroServicio;

/**
 *
 * @author Dremi7w7
 */
public class LibroControl {
    private final LibroServicio libroServicio = new LibroServicio();
    private final CategoriaServicio  categoriaServicio = new CategoriaServicio();
    

public Libro crear(String [] args){
    
        Categoria categoria=this.categoriaServicio.buscarPorCodigo(Integer.valueOf(args[0]));
        Libro libro = new Libro(categoria, Integer.valueOf(args[1]),args[2],Integer.valueOf(args[3])); 
              
        this.libroServicio.crear(libro);
        return libro;
    }
     
public List<Libro> listar(){
        return this.libroServicio.listar();
    }
public Libro buscarLibro (String args){
    return this.libroServicio.buscarPorCodigo(Integer.valueOf(args));
     }
public Libro buscarPorCodigo (String args){
    return this.libroServicio.buscarPorCodigo(Integer.valueOf(args));
  }
    
    
    
    
    
    
}
