
package TestandoConexao;

import connect_mysql.ConnectionFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;



/**
 *
 * @author Camila e Luan
 */
public class connection {
    
    
    public static void main(String[] args){
        
        //testando conexao
        try {
            
            JOptionPane.showMessageDialog(null, "testando conexao");
            Connection con = new ConnectionFactory().conecta();
            JOptionPane.showMessageDialog(null,"esta conectado");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Erro" + e);
            
        }
        
        
        
    }
}
