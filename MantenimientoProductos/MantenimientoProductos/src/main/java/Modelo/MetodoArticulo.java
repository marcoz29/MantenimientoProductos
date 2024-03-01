
package Modelo;


import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ariel
 */
public class MetodoArticulo {
    
    private ArrayList <Articulo> arrayArticulo;
    String arregloInformacionConsultada[] = new String[2];
    
    public MetodoArticulo(){
        
        arrayArticulo = new ArrayList <Articulo>();
    }
    
    //agrega un objeto al arreglo
    public void agregarArticulo (String informacion[])
    {
        Articulo temporal = new Articulo(informacion[0], informacion[1],Integer.parseInt(informacion[2]));
        arrayArticulo.add(temporal);
    }//fin agregarArticulo
    
    public void mostrarInformacion()
    {
        for(int i=0; i<arrayArticulo.size(); i++)
        {
            JOptionPane.showMessageDialog(null, arrayArticulo.get(i).getInformacionArticulo());
        }
    }//fin mostrarInformacion
    
    public boolean consultarArticulo(String codigo)
    {
        boolean existe = false;
        
        for(int i=0; i<arrayArticulo.size(); i++)
        {
            if(arrayArticulo.get(i).getCodigo().equals(codigo))
            {
                arregloInformacionConsultada[0] = arrayArticulo.get(i).getArticulo();
                arregloInformacionConsultada[1] = ""+arrayArticulo.get(i).getCantidad();
                existe = true;
                
            }//fin del if
        }//fin del for
        
        return existe;
    }//fin de consultarArticulo
    
    public void modificarArticulo(String arreglo[])
    {
        for(int i=0; i<arrayArticulo.size(); i++)
        {
            if(arrayArticulo.get(i).getCodigo().equals(arreglo[0]))
            {
                arrayArticulo.get(i).setArticulo(arreglo[1]);
                arrayArticulo.get(i).setCantidad(Integer.parseInt(arreglo[2]));
            }//fin del if
        }//fin del for
    }//fin del metodo modificarArticulo
    
    public void eliminarArticulo(String arreglo[])
    {
        for (int i=0; i<arrayArticulo.size(); i++)
        {
            arrayArticulo.remove(i);
        }//fin del for
    }//fin de eliminarArticulo 
    
    public boolean consultarRegistro(){
        boolean existe= false;
        
        for(int i=0; i<arrayArticulo.size();i++)
        {
            if(arrayArticulo.get(i) != null)
            {
                existe = true;
            }//fin del if
        }//fin del for
        return existe;
               
    }//fin de consultarRegistro
    
    public String mostrarInformacionRegistro()
    {
        String imprimir = "";
        for (int i=0; i<arrayArticulo.size();i++)
        {
            imprimir += arrayArticulo.get(i).getInformacionArticulo();
        }
        return imprimir;
    }//fin de mostrarInformacionRegistro
    
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }
}
