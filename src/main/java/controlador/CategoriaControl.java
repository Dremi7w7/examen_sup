/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Categoria;
import servicio.CategoriaServicio;


/**
 *
 * @author Dremi7w7
 */
public class CategoriaControl {
    private final CategoriaServicio categoriaServicio = new CategoriaServicio();
        public Categoria crear(String [] params){
        var categoria = new Categoria(Integer.valueOf(params[0]),params[1]); 
              
        this.categoriaServicio.crear(categoria);
        return categoria;
    }
        
        
    public List<Categoria> listar(){
        return this.categoriaServicio.listar();
    }
    
    public Categoria buscarPorCodigo (String arg){
        return this.categoriaServicio.buscarPorCodigo(Integer.valueOf(arg));
  }
}
