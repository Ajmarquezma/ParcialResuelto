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
public class Tipo {

    private String codigo;

    public Tipo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
    @Override
    public String toString() {
        return codigo;
    }

}
