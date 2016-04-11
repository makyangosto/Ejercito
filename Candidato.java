/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christian
 */
public class Candidato {
    String dni;
    String nombre; 
    String apellidos; 
    String fechadenacimiento; 
    int notamedia;
    String preferencias; 
   Puesto puestoasignado;
   Candidato()
   {
       puestoasignado=new Puesto();
       puestoasignado.codigo="0?000/000";

   }
}
