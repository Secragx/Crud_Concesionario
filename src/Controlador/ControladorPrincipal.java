
package Controlador;

import Vista.DiseñoPrincipal;
import Vista.DiseñoReferencia;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ControladorPrincipal implements ActionListener {
    private DiseñoPrincipal FrmPri;
    private DiseñoReferencia FrmRef;
    
    public ControladorPrincipal(DiseñoPrincipal frmPri, DiseñoReferencia frmRef){
        this.FrmPri = frmPri;
        this.FrmRef = frmRef;
        this.FrmPri.btn_referencias.addActionListener(this);
        this.FrmPri.btn_salir.addActionListener(this);
    }
 public void inicar(){
    FrmRef.setTitle("Producto");
    FrmPri.setTitle("Principal");
    FrmPri.setLocationRelativeTo(null);
    FrmRef.setLocationRelativeTo(null);
}
    @Override
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==FrmPri.btn_referencias){
            FrmRef.setVisible(true);
            //frmPri.dispose();
        }
        
        if(e.getSource()==FrmPri.btn_salir){
        System.exit(0);
        }   
    }
}