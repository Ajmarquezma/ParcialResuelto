/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpunto2;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Cuenta {
    
    private ArrayList<Movimiento> movimientos;
    private int numeroCuenta;
    private double saldoCuenta;
    private String fecha;
    private String nombreCliente;

    public Cuenta(int numeroCuenta, double saldoCuenta, String fecha, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        ArrayList<Movimiento> movimientos= new ArrayList();
        this.movimientos = movimientos;
    }
    
    public void crearMovimientos(Tipo tipo, String fecha, double monto){
        Movimiento nuevoMovimiento = new Movimiento(tipo,fecha,this.saldoCuenta,monto);
        movimientos.add(nuevoMovimiento);
    }
   
    
}
