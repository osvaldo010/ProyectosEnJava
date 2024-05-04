/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

/**
 *
 * @author josee
 */
public class Personal extends DatosGenerales
{
    private char estatus; 

    public Personal()
    {
    }
    
    

    public Personal(char estatus, String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String otras)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
        this.estatus = estatus;
    }

    public char getEstatus()
    {
        return estatus;
    }

    public void setEstatus(char estatus)
    {
        this.estatus = estatus;
    }
    
    
    @Override
    public String toString()
    {
        return super.toString() + "\t" + estatus;
    }
    
}
