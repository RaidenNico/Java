package s13_1;

import bd.ConnDB;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Juan Carlos Camayo
 */
public class Reporte {
    
    public static void main(String[] args) throws SQLException, JRException {
        
        String jasperFile = "D:\\IDAT\\ReportAutor.jasper";
        //PDF
        JasperPrint jasperPrint = 
                JasperFillManager.fillReport(jasperFile, null, ConnDB.getCnx());
        JRPdfExporter exp = new JRPdfExporter();
        exp.setExporterInput(new SimpleExporterInput(jasperPrint));
        exp.setExporterOutput(new SimpleOutputStreamExporterOutput("ReportAutor.pdf"));
        SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
        exp.setConfiguration(conf);
        exp.exportReport();
        
        //WINDOW
        JasperPrint jasperPrintWindow = JasperFillManager.fillReport(jasperFile,
                null, ConnDB.getCnx());
        JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
        jasperViewer.setVisible(true);
        
    }
    
}
