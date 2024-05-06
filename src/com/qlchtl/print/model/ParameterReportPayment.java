/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.print.model;

import java.util.List;

/**
 *
 * @author Dell
 */
public class ParameterReportPayment {
    String codeInvoice;
    String total;
    String usedScored;
    String storedScore;
    List<FieldReportPayment> fields;

    public ParameterReportPayment(String codeInvoice, String total, String usedScored, String storedScore,List<FieldReportPayment> fields) {
        this.codeInvoice = codeInvoice;
        this.total = total;
        this.usedScored = usedScored;
        this.storedScore = storedScore;
        this.fields = fields; 
    }

    public String getCodeInvoice() {
        return codeInvoice;
    }

    public void setCodeInvoice(String codeInvoice) {
        this.codeInvoice = codeInvoice;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUsedScored() {
        return usedScored;
    }

    public void setUsedScored(String usedScored) {
        this.usedScored = usedScored;
    }

    public String getStoredScore() {
        return storedScore;
    }

    public void setStoredScore(String storedScore) {
        this.storedScore = storedScore;
    }
    
    public void setFields(List<FieldReportPayment> fields) {
        this.fields = fields;
    }
     public List<FieldReportPayment> getFields( ) {
        return this.fields;
    }
}
