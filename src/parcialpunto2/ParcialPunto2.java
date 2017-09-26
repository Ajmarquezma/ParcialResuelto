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
        Tipo consignacion =new Tipo("1");
        Tipo retiro =new Tipo("2");
        banco.addTipos(consignacion);
        banco.addTipos(retiro);
        
    }
    
}
