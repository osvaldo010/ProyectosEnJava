/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author josee
 */
public class Alumnos extends  DatosGenerales
{
    private int viveCon;
    private int carrera;

    public Alumnos()
    {
    }

    public Alumnos(int viveCon, int carrera, String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String otras)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
        this.viveCon = viveCon;
        this.carrera = carrera;
    }
    
    

    public int getViveCon()
    {
        return viveCon;
    }

    public void setViveCon(int viveCon)
    {
        this.viveCon = viveCon;
    }

    public int getCarrera()
    {
        return carrera;
    }

    public void setCarrera(int carrera)
    {
        this.carrera = carrera;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\t" + viveCon +"\t\t"+ carrera +"\n";
    }
    
}
