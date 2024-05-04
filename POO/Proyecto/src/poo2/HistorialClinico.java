/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

import java.util.Date;

/**
 *
 * @author Estrada
 */
public class HistorialClinico
{
    private String padecimientoAct;
    private String antedecendentesPer;
    private String medicamento;
    private String planTratamiento;
    private Date fecha;

    public HistorialClinico()
    {
    }

    public HistorialClinico(String padecimientoAct, String antedecendentesPer, String medicamento, String planTratamiento, Date fecha)
    {
        this.padecimientoAct = padecimientoAct;
        this.antedecendentesPer = antedecendentesPer;
        this.medicamento = medicamento;
        this.planTratamiento = planTratamiento;
        this.fecha = fecha;
    }
    
    public String desp()
    {
        String s = "";
        
        return "Padecimientos: " + "\n" + padecimientoAct + "Antecedentes: " + "\n" + antedecendentesPer + "Medicamento: " + "\n" + medicamento + "Tratamiento: " + "\n" + planTratamiento + "Fecha: "+ "\n" + fecha;
    }

    /**
     * @return the padecimientoAct
     */
    public String getPadecimientoAct()
    {
        return padecimientoAct;
    }

    /**
     * @param padecimientoAct the padecimientoAct to set
     */
    public void setPadecimientoAct(String padecimientoAct)
    {
        this.padecimientoAct = padecimientoAct;
    }

    /**
     * @return the antedecendentesPer
     */
    public String getAntedecendentesPer()
    {
        return antedecendentesPer;
    }

    /**
     * @param antedecendentesPer the antedecendentesPer to set
     */
    public void setAntedecendentesPer(String antedecendentesPer)
    {
        this.antedecendentesPer = antedecendentesPer;
    }

    /**
     * @return the medicamento
     */
    public String getMedicamento()
    {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(String medicamento)
    {
        this.medicamento = medicamento;
    }

    /**
     * @return the planTratamiento
     */
    public String getPlanTratamiento()
    {
        return planTratamiento;
    }

    /**
     * @param planTratamiento the planTratamiento to set
     */
    public void setPlanTratamiento(String planTratamiento)
    {
        this.planTratamiento = planTratamiento;
    }

    /**
     * @return the fecha
     */
    public Date getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    
    
}
