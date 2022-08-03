/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Libro;

/**
 *
 * @author Dremi7w7
 */
public interface ILibroServicio {
    public Libro crear(Libro libro);
    public List<Libro> listar();  
    public Libro buscarPorCodigo(int codigoLibro);
    public int buscarPosicion(Libro libro);
}
