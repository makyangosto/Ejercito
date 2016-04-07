/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christian
 */
public class ListaCandidatos {
    Candidato [] candidatos;
    int contador;
    int tamanio;
    ListaCandidatos()
    {
        candidatos=new Candidato[10];
        contador=0;
        tamanio=10;
    }
    public void setCandidato(Candidato candidato) //añade un candidato
    {
        if(contador<tamanio)
        { candidatos[contador]=candidato;
        contador++;
        }
        else
        {
            Candidato [] auxiliar;
                   auxiliar =new Candidato[10*tamanio];
                   for(int i=0;i<contador;i++)
                   {
                       auxiliar[i]=candidatos[i];
                   }
                   candidatos=auxiliar;
                   candidatos[contador]=candidato;
                   contador++;
        }
    }
    public void ordenarCandidatos(){  //Ordena los candidatos por nota de menor a mayor
        
       Candidato auxiliar;
        for(int i=0;i<contador;i++)
        {
            for(int j=0;j<contador;j++)
            {
                if(candidatos[j].notamedia>candidatos[i].notamedia)
                {
                    auxiliar=candidatos[j];
                    candidatos[i]=auxiliar;
                    candidatos[j]=auxiliar;
                }
            }
        }
    }
    
    public Candidato getCandidato(int posicion) //devuelve un candidato dado como parametro su posicion
    {   Candidato ejemplo=new Candidato();
        if(posicion<contador)
        {ejemplo=candidatos[posicion];
        
        }
        return ejemplo;
    }
    
    public Candidato[] getAsignados() //devuelve todos los candidatos con puestos asignados
    {
        Candidato [] auxiliar1;
        auxiliar1=new Candidato[contador];
        for(int i=0;i<contador;i++)
        {
            if(candidatos[i].puestoasignado.codigo.compareTo("0?000/000")==0)
            {
                auxiliar1[i]=candidatos[i];
            }
        }
        return auxiliar1;
    }
}
