
package DAO;

import connect_mysql.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javabeans.Marca;
import javabeans.Modelo;
import javabeans.Moto;
import javabeans.login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arthur, Gustavo e Ulisses
 * 
 */
public class CadastrarCliente {
    private final Connection conecta;
    
    public CadastrarCliente(){
    
        this.conecta = new ConnectionFactory().conecta();
    
    }
    
    public void cadastrarFabricante(Marca obj){
        
        try {
            String cmdsql = "insert into marca (MAR_COD_MARCA, MAR_MARCA)values (?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1, obj.getCodMarca());
            stmt.setString(2, obj.getMarca());
           
      
            
            //executa
            stmt.execute();
            
            //fecha conexao
            stmt.close();
            
            
        } catch (Exception erro) {
            System.out.println("erro");
        }
        
}
    
    public void cadastrarLogin(Modelo obj){
        
        try {
            String cmdsql = "insert into modelo(MOD_MODELO, MOD_ANO_FAB,) values (?, ?,)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getModelo());
            stmt.setInt(2, obj.getAnoFab());
            
            //executa
            stmt.execute();
            
            //fecha conexao
            stmt.close();
            
            
        } catch (Exception erro) {
            System.out.println("erro");
        }
    }
    
    public void moto (Moto obj){
        try {
            String cmdsql = "insert into moto (MOT_COD_MOTO, MOT_COD_MARCA, MOT_COD_MODELO, MOT_KM, MOT_PRECO, MOT_PESO) values (?, ? ,?, ?, ?, ?)";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);          
            stmt.setInt(1, obj.getCodMoto());
            stmt.setInt(2, obj.getCodMarca());
            stmt.setInt(3, obj.getCodModelo());
            stmt.setInt(4, obj.getKmRodado());
            stmt.setInt(5, obj.getPreco());
            stmt.setInt(6, obj.getPeso());
            
            stmt.execute();
            
            stmt.close();   
            
                    
        } catch (Exception erro) {
            System.out.println("erro");
        }
    }
    
public List<Moto> ListarCadastro() throws SQLException{
        
        try{
            
            List<Moto> lista = new ArrayList<Moto>();
            
            String cmdSql = "Select * from marca";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdSql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
             
              Moto c = new Moto();
                c.setCodMoto(rs.getInt("MOT_COD_MOTO"));
                c.setCodMarca(rs.getInt("MOT_COD_MARCA"));
                c.setCodModelo(rs.getInt("MOT_COD_MODELO"));
                c.setKmRodado(rs.getInt("MOT_KM"));
                c.setPreco(rs.getInt("MOT_PRECO"));
                c.setPeso(rs.getInt("MOT_PESO"));
                
                
                lista.add(c);
               
            }
             
        return lista;
        
        }catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    
}
        
}      
 
    
    
    
 