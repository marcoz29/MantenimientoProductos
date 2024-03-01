
package Controlador;

import Modelo.MetodoArticulo;
import Vista.FrmVentanaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author ariel
 */
public class ControladorVentanaArticulo implements ActionListener{

    public MetodoArticulo metodoArticulo;
    FrmVentanaCliente frmVentana;
    
    public ControladorVentanaArticulo(FrmVentanaCliente frmVentana)
    {
        metodoArticulo = new MetodoArticulo();
        this.frmVentana = frmVentana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Agregar"))
        {
            try{
          
           metodoArticulo.agregarArticulo(frmVentana.devolverInformacion());
           frmVentana.mostrarMensaje("El articulo fue agregado correctamente.");
           frmVentana.resetearGUI();
           
            }catch(Exception p)
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos en los campos.");
            }
        }
        if(e.getActionCommand().equals("Buscar"))
        {
            buscar();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodoArticulo.modificarArticulo(frmVentana.devolverInformacion());
            frmVentana.mostrarMensaje("El articulo fue modificado correctamente.");
            frmVentana.resetearGUI();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodoArticulo.eliminarArticulo(frmVentana.devolverInformacion());
            frmVentana.mostrarMensaje("El articulo se elimino correctamente");
            frmVentana.resetearGUI();
        }
        if(e.getActionCommand().equals("Busqueda General"))
        {
            buscarArticulo();
        }
    }//fin del actionPerformed
    
    public void buscar()
    {
        if(metodoArticulo.consultarArticulo(frmVentana.devolverCodigo()))
        {
            frmVentana.mostrarInformacion(metodoArticulo.getArregloInformacion());
            frmVentana.habilitarEdicion();
        }
        else
            frmVentana.mostrarMensaje("El articulo buscado no se encuentra.");
        frmVentana.habilitarAgregar();
    }//fin del metodo buscar
    
    public void buscarArticulo(){
        if(metodoArticulo.consultarRegistro() == true)
        {
            frmVentana.mostrarInformacionRegistro(metodoArticulo.mostrarInformacionRegistro());
        }
        else
        {
            frmVentana.mostrarInformacionRegistro("---> Registro de articulos vacio <---");
        }
    }//fin del metodo buscarArticulo
        
            
}//fin de la clase

