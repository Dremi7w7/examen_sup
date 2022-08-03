/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Categoria;
import modelo.Libro;

/**
 *
 * @author Dremi7w7
 */
public interface ICategoriaServicio {
    public Categoria crear(Categoria categoria);
    public Categoria buscarPorCodigo(int codigoCategoria);
    public int buscarPosicion(Categoria categoria);
    public List<Categoria> listar();  
}
