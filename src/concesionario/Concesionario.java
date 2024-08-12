
package concesionario;

import Modelo.ConsultaReferencia;
import Vista.DiseñoPrincipal;
import Vista.DiseñoReferencia;
import Controlador.ControladorPrincipal;

public class Concesionario {

    public static void Concesionario(String[] args) {
        /**
       // Crea la instancia de la vista (DiseñoReferencia)
       DiseñoPrincipal vista_a = new DiseñoPrincipal(); 
       DiseñoReferencia vista = new DiseñoReferencia();

       // Crea la instancia del modelo (concesionario y ConsultaReferencia)
        Concesionario modelo = new Concesionario();
        ConsultaReferencia consulta = new ConsultaReferencia();

        // Crea la instancia del controlador
        ControladorReferencia controlador = new ControladorReferencia(vista_a, vista,  consulta);

        // Muestra la ventana principal
        vista.setVisible(true);
        * 
        
         // 1. Crear una instancia del modelo
        Concesionario modelo = new Concesionario();
        
        // 2. Crear una instancia de la clase que se encarga de las consultas a la base de datos
        ConsultaReferencia consulta = new ConsultaReferencia();
        
        // 3. Crear una instancia de la vista
        DiseñoReferencia vista_ref = new DiseñoReferencia();
        DiseñoPrincipal vista_Pri = new DiseñoPrincipal();
        
        // 4. Crear una instancia del controlador y conectar modelo, vista y consultas
        ControladorPrincipal controlador = new ControladorPrincipal(modelo, vista_Pri, consulta);
        
        // 5. Mostrar la ventana principal (la vista)
        vista.setVisible(true);
        **/
        
                // Crear una instancia del modelo
        Concesionario modelo = new Concesionario();

        // Crear una instancia de la vista principal
        DiseñoPrincipal vista = new DiseñoPrincipal();

        // Crear una instancia del controlador y conectar modelo y vista
        ControladorPrincipal controlador = new ControladorPrincipal(modelo, vista);

        // Mostrar la ventana principal
        vista.setVisible(true);
    }
    
}
