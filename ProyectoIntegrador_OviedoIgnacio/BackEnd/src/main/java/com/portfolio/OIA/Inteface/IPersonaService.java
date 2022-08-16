package com.portfolio.OIA.Inteface;

import com.portfolio.OIA.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer una Persona
    public List<Persona> getPersona();
    
    // Guardar una Persona
    public void savePersona(Persona persona);
    
    // Eliminar una Persona
    public void deletePersona(Long id);
    
    // Encontrar una Persona
    public Persona findPersona(Long id);
}
