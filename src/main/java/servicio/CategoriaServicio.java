/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Libro;

/**
 *
 * @author Dremi7w7
 */
public class CategoriaServicio implements ICategoriaServicio {
    private static List<Categoria> categoriaList = new ArrayList<>();

    @Override
    public Categoria crear(Categoria categoria) {
        this.categoriaList.add(categoria);
        return categoria;
    }

    @Override
    public Categoria buscarPorCodigo(int codigoCategoria) {
        Categoria categoria=null;
        for(var b:this.categoriaList){
            if(codigoCategoria==b.getCodigo()){
                categoria=b;
                break;
            }
        }
        return categoria;
    }

    @Override
    public int buscarPosicion(Categoria categoria) {
        int posicion=-1;
        for(var b:this.categoriaList){
            posicion++;
            if(b.getCodigo()==categoria.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Categoria> listar() {
        return this.categoriaList;
    }


    

    
    
    
    
}
