

package jasper;


import java.util.List;
import javabeans.cadastrojogo;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * Classe criada para
 * @author CamilaSilva e Luan
 * @since Classe criada em 
 */
public class RelatorioCadastroJogo {
    
   
    public cadastrojogo cadastrojogo;
    public String fabricanteJogo;
    public String tituloJogo;
    public String genero;
    public String plataforma;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void adicionarCadastroJogo(cadastrojogo cadastrojogo){
        
        this.cadastrojogo = cadastrojogo;
    }

    public cadastrojogo getCadastrojogo() {
        return cadastrojogo;
    }

    public void setCadastrojogo(cadastrojogo cadastrojogo) {
        this.cadastrojogo = cadastrojogo;
    }

    public String getFabricanteJogo() {
        return fabricanteJogo;
    }

    public void setFabricanteJogo(String fabricanteJogo) {
        this.fabricanteJogo = fabricanteJogo;
    }

    public String getTituloJogo() {
        return tituloJogo;
    }

    public void setTituloJogo(String tituloJogo) {
        this.tituloJogo = tituloJogo;
    }
    
    public void getRelatorio(List<RelatorioCadastroJogo> lista) {
            JasperPrint print = null;
            JRDataSource dataSource = new JRBeanCollectionDataSource(lista);
                try {
                    print = JasperFillManager.fillReport("C:\\Users\\Camila\\JaspersoftWorkspace\\MyReports\\Cadastro_Login.jasper", null, dataSource);
                    JasperPrintManager.printReport(print, true);
                } catch (Exception erro) {
                    erro.printStackTrace();
                }

            }
    
}
