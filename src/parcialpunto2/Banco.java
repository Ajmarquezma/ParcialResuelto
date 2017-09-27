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
public class Banco {

    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;
    private String codigo;

    public Banco(String codigo) {
        this.tipos = new ArrayList();
        this.cuentas = new ArrayList();
        this.codigo = codigo;
    }

    public void addTipos(Tipo tipo) {
        this.tipos.add(tipo);
    }

    public void addCuentas(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Banco: " + '\n' + "Codigo del Banco: " + codigo + '\n' + "Tipos de movimientos: " + tipos + '\n' +"Cuentas existentes: " + cuentas;
    }

}
