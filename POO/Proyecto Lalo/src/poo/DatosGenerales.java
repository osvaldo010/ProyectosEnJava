/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;

/**
 *
 * @author josee
 */
public class DatosGenerales implements Serializable
{

    private String cve;
    private String nom;
    private String primerAp;
    private String segundoAp;
    private char sexo;
    private boolean desnutricion;
    private boolean sobrepeso;
    private boolean alergias;
    private boolean obesidad;
    private boolean diabetes;

    public DatosGenerales(String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes)
    {
        this.cve = cve;
        this.nom = nom;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.sexo = sexo;
        this.desnutricion = desnutricion;
        this.sobrepeso = sobrepeso;
        this.alergias = alergias;
        this.obesidad = obesidad;
        this.diabetes = diabetes;
    }

    public String getCve()
    {
        return cve;
    }

    public void setCve(String cve)
    {
        this.cve = cve;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrimerAp()
    {
        return primerAp;
    }

    public void setPrimerAp(String primerAp)
    {
        this.primerAp = primerAp;
    }

    public String getSegundoAp()
    {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp)
    {
        this.segundoAp = segundoAp;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public boolean isDesnutricion()
    {
        return desnutricion;
    }

    public void setDesnutricion(boolean desnutricion)
    {
        this.desnutricion = desnutricion;
    }

    public boolean isSobrepeso()
    {
        return sobrepeso;
    }

    public void setSobrepeso(boolean sobrepeso)
    {
        this.sobrepeso = sobrepeso;
    }

    public boolean isAlergias()
    {
        return alergias;
    }

    public void setAlergias(boolean alergias)
    {
        this.alergias = alergias;
    }

    public boolean isObesidad()
    {
        return obesidad;
    }

    public void setObesidad(boolean obesidad)
    {
        this.obesidad = obesidad;
    }

    public boolean isDiabetes()
    {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes)
    {
        this.diabetes = diabetes;
    }
    

}
