/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.print;

import com.qlchtl.dao.PrintedHoaDonDAO;
import com.qlchtl.print.model.ParameterReportPayment;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.DOMConfiguration;
import javax.swing.*;
/**
 *
 * @author Dell
 */
public class ReportManager {
    PrintedHoaDonDAO ptDao = new PrintedHoaDonDAO();
    private static ReportManager instance;
    private JasperReport reportPay;
     private JasperDesign reportDs;
    public static ReportManager getInstance() {
        if(instance==null) {
            instance = new ReportManager();
        }
        return instance;
    }
    private ReportManager() {
        
    }
    public void compileReport() throws JRException {
//            PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\log4j.properties");
//        PropertyConfigurator.configure(getClass().getResourceAsStream("/print/log4j.properties"));
//        reportPay=JasperCompileManager.compileReport(getClass().getResourceAsStream("/print/report1.jrxml"));
//           reportDs=JRXmlLoader.load(System.getProperty("user.dir")+"\\src\\com\\qlchtl\\print\\report1.jrxml");
//           reportPay=JasperCompileManager.compileReport(reportDs);
        reportPay=JasperCompileManager.compileReport(getClass().getResourceAsStream("/com/qlchtl/print/report1.jrxml"));
        
    }
    public void printReportPayment(ParameterReportPayment data) throws JRException {
//        System.out.println(data.getCodeInvoice() + " " + data.getTotal()+" " +data.getStoredScore()+" "+ data.getUsedScored());
        Map<String, Object> para = new HashMap<>();
        para.put("codeInvoice", data.getCodeInvoice());
        para.put("total", data.getTotal());
        para.put("usedScore",data.getUsedScored());
        para.put("storedScore", data.getStoredScore());

        
        JRBeanCollectionDataSource dts = new JRBeanCollectionDataSource(ptDao.getInvoiceById(data.getCodeInvoice()));
        JasperPrint print =  JasperFillManager.fillReport(reportPay,para,dts);
        view(print);
    }
    private void view(JasperPrint print) throws JRException {
//        JasperViewer.viewReport(print);
          JasperViewer jasperViewer = new JasperViewer(print, false); // Tham số thứ hai là "false" để không hiển thị cửa sổ đồng ý đóng
          jasperViewer.setVisible(true);
        
    }
}
