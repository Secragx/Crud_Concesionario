
package concesionario;

import Modelo.ConsultaReferencia;
import Modelo.concesionario;
import Vista.DiseñoReferencia;
import Controlador.ControladorReferencia;

public class Concesionario {

    public static void Concesionario(String[] args) {
       // Crea la instancia de la vista (DiseñoReferencia)
        DiseñoReferencia vista = new DiseñoReferencia();

        // Crea la instancia del modelo (concesionario y ConsultaReferencia)
        concesionario modelo = new concesionario();
        ConsultaReferencia consulta = new ConsultaReferencia();

        // Crea la instancia del controlador
        ControladorReferencia controlador = new ControladorReferencia(modelo, vista, consulta);

        // Muestra la ventana principal
        vista.setVisible(true);
    }
    
}
