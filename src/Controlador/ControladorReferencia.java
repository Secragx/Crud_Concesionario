
package Controlador;

import Modelo.ConsultaReferencia;
import Modelo.concesionario;
import Vista.DiseñoReferencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorReferencia implements ActionListener {
   private concesionario con;
   private DiseñoReferencia FrmRefe;
   private ConsultaReferencia proC;
    
    public ControladorReferencia (concesionario con, DiseñoReferencia FrmRefe, ConsultaReferencia proC) {
        this.con = con;
        this.FrmRefe = FrmRefe;
        this.proC = proC;
        this.FrmRefe.btn_agregar.addActionListener((ActionListener) this);
        this.FrmRefe.btn_modificar.addActionListener((ActionListener) this);
        this.FrmRefe.btn_limpiar.addActionListener((ActionListener) this);
        this.FrmRefe.btn_buscar.addActionListener((ActionListener) this);
        this.FrmRefe.btn_eliminar.addActionListener((ActionListener) this);
        this.FrmRefe.btn_volver.addActionListener((ActionListener) this);        
    }   
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
        /////// boton agregar//////
        if(e.getSource()==FrmRefe.btn_agregar){
            con.setMatricula(Integer.parseInt(FrmRefe.txt_id.getText()));
            con.setReferencia(FrmRefe.txt_matricula.getText());
            con.setPrecio(Integer.parseInt(FrmRefe.txt_precio.getText()));
            if(proC.registrar(con)){
                JOptionPane.showMessageDialog(null,"Referencia Agregada");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al agregar");
                limpiar();
            }
            
        }        
        /////// fin agregar //////                
        /////// boton modificar //////
        if(e.getSource()==FrmRefe.btn_modificar){
            con.setId(Integer.parseInt(FrmRefe.txt_id.getText()));
            con.setMatricula(Integer.parseInt(FrmRefe.txt_matricula.getText()));
            con.setReferencia(FrmRefe.txt_referencia.getText());
            con.setPrecio(Integer.parseInt(FrmRefe.txt_precio.getText()));
            if(proC.modificar(con)){
                JOptionPane.showMessageDialog(null,"Referencia modificada");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar");
                limpiar();
            }
        }
         /////// boton eliminar //////
        if(e.getSource()==FrmRefe.btn_eliminar){
            con.setId(Integer.parseInt(FrmRefe.txt_id.getText()));
            if(proC.eliminar(con)){
                JOptionPane.showMessageDialog(null,"Referencia eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
        }
        /////// boton buscar //////
        if(e.getSource()==FrmRefe.btn_buscar){
            con.setId(Integer.parseInt(FrmRefe.txt_id.getText()));
            if(proC.buscar(con)){                
              FrmRefe.txt_id.setText(String.valueOf(con.getId()));
              FrmRefe.txt_matricula.setText(String.valueOf(con.getMatricula()));
              FrmRefe.txt_referencia.setText(con.getReferencia());
              FrmRefe.txt_precio.setText(String.valueOf(con.getPrecio()));              
            }else{
                JOptionPane.showMessageDialog(null,"Error al buscar");
                limpiar();
            }
        }// fin buscar/////
        
        ///Limpiar
        if(e.getSource()==FrmRefe.btn_limpiar){
        limpiar();
        } 
    }// fin limpiar         
        private void limpiar() {
       FrmRefe.txt_matricula.setText(null);
       FrmRefe.txt_id.setText(null);
       FrmRefe.txt_referencia.setText(null);
       FrmRefe.txt_precio.setText(null);      
    }
}

