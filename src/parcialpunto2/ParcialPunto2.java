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
public class ParcialPunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("12345");
        Tipo consignacion = new Tipo("1");
        Tipo retiro = new Tipo("2");
        Cuenta c = new Cuenta(1, 0, "26/09/17", "Aldo");
        Cuenta u = new Cuenta(2, 1, "26/09/17", "José");
        banco.addTipos(consignacion);
        banco.addTipos(retiro);
        banco.addCuentas(c);
        banco.addCuentas(u);
        
        c.crearMovimientos(consignacion, "26/09/17", 2);
        c.crearMovimientos(retiro, "26/09/17", -1);
        
        u.crearMovimientos(consignacion, "26/09/17", 2);
        u.crearMovimientos(retiro, "26/09/17", -1);
        
        System.out.println(banco);
    }

}
