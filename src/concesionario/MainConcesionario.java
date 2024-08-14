
package concesionario;

import Controlador.ControladorPrincipal;
import Controlador.ControladorReferencia;
import Modelo.ConsultaReferencia;
import Modelo.concesionario;
import Vista.DiseñoPrincipal;
import Vista.DiseñoReferencia;
import Modelo.conexion;

public class MainConcesionario {


    public static void main(String[] args) {
        concesionario con = new concesionario();//GPT
        ConsultaReferencia proC = new ConsultaReferencia();
        DiseñoReferencia frmRefe = new DiseñoReferencia();
        ControladorReferencia ctrlRefe = new   ControladorReferencia(con,frmRefe,proC);
        DiseñoPrincipal frmPri =new  DiseñoPrincipal();
        ControladorPrincipal ctrlPri = new ControladorPrincipal (frmPri,frmRefe);
        ctrlPri.inicar();
        frmPri.setVisible(true); 
    }
    
}
