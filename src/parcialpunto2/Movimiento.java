/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpunto2;

/**
 *
 * @author Estudiante
 */
public class Movimiento {

    private Tipo tipo;
    private String fecha;
    private double saldoAnterior;

    private double monto;

    public Movimiento(Tipo tipo, String fecha, double saldoAnterior, double monto) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return '\n' + "Tipo de movimiento: " + this.tipo + '\n' + "Fecha del movimiento: " + fecha + '\n' + "Saldo anterior: " + saldoAnterior + '\n' + "Monto del movimiento: " + monto;
    }

}
