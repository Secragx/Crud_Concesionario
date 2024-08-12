package Modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConsultaReferencia extends conexion {
        //////////////METODO RESGISTRAR/////
    public boolean registrar(concesionario p){
        PreparedStatement ps =null;
        Connection con = getConexion();
        String sql ="insert into producto (codigo,nombre,precio)values(?,?,?)";
    try{
            ps =con.prepareStatement(sql);
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
        String sql ="update producto set codigo=?,nombre=?,precio=? where id=?";
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
        String sql ="delete from producto where id=?";
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

///////FIN ELIMINAR/////
//////// METODO BUSCAR/////////////
public boolean buscar (concesionario p){    
        PreparedStatement ps =null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select *from producto where id=?";
    try{
            ps =con.prepareStatement(sql);
            ps.setInt(1,p.getId());
            rs = ps.executeQuery();
            if(rs.next())
          {
            p.setId(Integer.parseInt(rs.getString("id")));
            p.setMatricula(rs.getInt("codigo"));
            p.setReferencia(rs.getString("nombre"));
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

