/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author 52644
 */
public class Producto {
    private Long idProducto;
    private String  categoria; //Cambiar a enum
    private String nombreProducto;
    private boolean disponible;
    private int existencias;
    private List<Review> reseñas;
}