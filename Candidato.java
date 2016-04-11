/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nocturno
 */
public class Candidato {

    private String DNI;
    private String Nombre;
    private String Apellido;
    private String FechaNacimiento;
    private float NotaMedia;
    private String Preferencia1;
    private String Preferencia2;
    private String Preferencia3;
    private String Destino;

    public String getDNI() { return DNI;  }
    public void setDNI(String DNI) { this.DNI = DNI;   }

    public String getNombre() {  return Nombre;   }
    public void setNombre(String Nombre) {  this.Nombre = Nombre; }

    public String getApellido() {  return Apellido;  }
    public void setApellido(String Apellido) {  this.Apellido = Apellido;  }

    public String getFechaNacimiento() { return FechaNacimiento; }
    public void setFechaNacimiento(String FechaNacimiento) { this.FechaNacimiento = FechaNacimiento;   }

    public float getNotaMedia() {   return NotaMedia;     }
    public void setNotaMedia(float NotaMedia) {   this.NotaMedia = NotaMedia;  }

    public String getPreferencia1() {       return Preferencia1;    }
    public void setPreferencia1(String Preferencia1) {           this.Preferencia1 = Preferencia1;      }

    public String getPreferencia2() {        return Preferencia2;    }
    public void setPreferencia2(String Preferencia2) {           this.Preferencia2 = Preferencia2;    }

    public String getPreferencia3() {     return Preferencia3;     }
    public void setPreferencia3(String Preferencia3) {    this.Preferencia3 = Preferencia3;   }

    
    
    
    public String getDestino() {  return Destino;   }
    public void DestinoCodigo(String Destino) {   this.Destino = Destino;    }
    /**
     * Clase que asigna candidatos a puestos
     * 
     */
    public void Asignar() {
        for (int i=0; i<Array_Candidatos.length(); i++) {
            for (int j=0; j<Array_Puestos.length(); j++) {  // bucle de puestos desde el primero al ultimo de libres
                if (Array_Candidatos[i].Preferencia1 == Array_Puestos[j].Cod_Puesto) { // si preferencia1 = puesto
                        this.DestinoCodigo(Preferencia1);  // asignar destino
                        Puesto.setDisponible(false);          // asignar no disponible del puesto
                        break; }                            //bucle puestos
                else if (Array_Candidatos[i].Preferencia2 == Array_Puestos[j].Cod_Puesto) { // si preferencia2 = puesto
                        this.DestinoCodigo (Preferencia2);  // asignar destino
                        Puesto.setDisponible(false);          // asignar no disponible del puesto
                        break; }                       //bucle puestos
                else if (Array_Candidatos[i].Preferencia3 == Array_Puestos[j].Cod_Puesto) { // si preferencia3 = puesto
                        this.DestinoCodigo (Preferencia3);  // asignar destino
                        Puesto.setDisponible(false);          // asignar no disponible del puesto
                        break; }                        //bucle puestos
                else this.DestinoCodigo ("0?000/000");
            } // fin bucle puestos
        } // fin bucle candidatos
                    
    }
    
    
    
}