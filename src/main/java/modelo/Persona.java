/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class Persona {
    
    private int id_persona;
    private String persona_nombres;
    private String personas_apater;
    private String persona_amater;
    private String persona_foto;
    private String persona_direccion;
    private String persona_direccion_ref;

    public Persona() {
    }

    public Persona(int id_persona, String persona_nombres, String personas_apater, String persona_amater, String persona_foto, String persona_direccion, String persona_direccion_ref) {
        this.id_persona = id_persona;
        this.persona_nombres = persona_nombres;
        this.personas_apater = personas_apater;
        this.persona_amater = persona_amater;
        this.persona_foto = persona_foto;
        this.persona_direccion = persona_direccion;
        this.persona_direccion_ref = persona_direccion_ref;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getPersona_nombres() {
        return persona_nombres;
    }

    public void setPersona_nombres(String persona_nombres) {
        this.persona_nombres = persona_nombres;
    }

    public String getPersonas_apater() {
        return personas_apater;
    }

    public void setPersonas_apater(String personas_apater) {
        this.personas_apater = personas_apater;
    }

    public String getPersona_amater() {
        return persona_amater;
    }

    public void setPersona_amater(String persona_amater) {
        this.persona_amater = persona_amater;
    }

    public String getPersona_foto() {
        return persona_foto;
    }

    public void setPersona_foto(String persona_foto) {
        this.persona_foto = persona_foto;
    }

    public String getPersona_direccion() {
        return persona_direccion;
    }

    public void setPersona_direccion(String persona_direccion) {
        this.persona_direccion = persona_direccion;
    }

    public String getPersona_direccion_ref() {
        return persona_direccion_ref;
    }

    public void setPersona_direccion_ref(String persona_direccion_ref) {
        this.persona_direccion_ref = persona_direccion_ref;
    }
    
}
