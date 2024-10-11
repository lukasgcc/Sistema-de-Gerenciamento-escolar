/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescolar;

/**
 *
 * @author Lucas
 */
public class SessaoAluno {
    private static SessaoAluno instancia;
    private String raAluno;

    private SessaoAluno() {
     
    }

    public static synchronized SessaoAluno getInstancia() {
        if (instancia == null) {
            instancia = new SessaoAluno();
        }
        return instancia;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }
}