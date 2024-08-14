package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * Clase ConsultasDestino para realizar operaciones CRUD en la tabla referencia.
 */
    public class ConsultaReferencia extends conexion {
    
        //////////////METODO RESGISTRAR/////
    public boolean registrar(concesionario p){
        PreparedStatement ps =null;
        Connection con = getConexion();
        String sql ="insert into referencia (matricula,referencia,precio)values(?,?,?)";
        
    try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,p.getMatricula());
            ps.setString(2,p.getReferencia());
            ps.setInt(3,p.getPrecio());
            ps.execute();
            return true;
    }catch(SQLException e){  
        System.err.print(e);
            return false;
        }        
    }
    
 //////////////METODO MODIFICAR /////
    public boolean modificar (concesionario p){
           PreparedStatement ps =null;
        Connection con = getConexion();
        String sql ="update referencia set matricula=?,referencia=?,precio=? where id=?";
        
    try{
            ps =con.prepareStatement(sql);
            ps.setInt(1,p.getMatricula());
            ps.setString(2,p.getReferencia());
            ps.setInt(3,p.getPrecio());
            ps.setInt(4,p.getId());
            ps.execute();
            return true;
    }catch(SQLException e){  
       System.err.println(e);
            return false;
        }        
    }

///////METODOO ELIMINAR/////
    public boolean eliminar (concesionario p){    
        PreparedStatement ps =null;
        Connection con = getConexion();
        String sql ="delete from referencia where id=?";
        
    try{
            ps =con.prepareStatement(sql);
            ps.setInt(1,p.getId());                       
            ps.execute();
            return true;
    }catch(SQLException e){  
       System.err.println(e);
            return false;
        }        
    }

//////// METODO BUSCAR/////////////
    public boolean buscar (concesionario p){    
        PreparedStatement ps =null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select *from referencia where id=?";
        
    try{
            ps =con.prepareStatement(sql);
            ps.setInt(1,p.getId());
            rs = ps.executeQuery();
            
            if(rs.next())
          {
            p.setId(Integer.parseInt(rs.getString("id")));
            p.setMatricula(rs.getInt("matricula"));
            p.setReferencia(rs.getString("referencia"));
            p.setPrecio(Integer.parseInt(rs.getString("precio")));          
            return true;
          }
             return false;
        }catch(SQLException e){  
       System.err.print(e); 
        return false;
          
        }              
    }
}
//////// FIN BUSCAR/////////////

