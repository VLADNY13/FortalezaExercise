/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortaleza;

/**
 *
 * @author estudiante
 */
public class Programa {
    
   private String nombreP;
   private String codigoP;
   private String departamento;
   private String materia1, materia2, materia3;

    public Programa() {
    }

    public Programa(String nombreP, String codigoP, String departamento, String materia1, String materia2, String materia3) {
        this.nombreP = nombreP;
        this.codigoP = codigoP;
        this.departamento = departamento;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

   
   
   
}
