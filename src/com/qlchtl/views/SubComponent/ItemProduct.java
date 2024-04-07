/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.views.DetailProduct;
import com.qlchtl.views.FormMain;
import com.qlchtl.views.MyControls.MyButton;
import com.qlchtl.views.MyControls.MyPanelBoxShadow;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dell
 */
public class ItemProduct {
    
    private FormMain parentFrame;
    public ItemProduct(FormMain parentFrame) {
        this.parentFrame = parentFrame;
    }
    public MyPanelBoxShadow createItemProdComponent(Integer i,int numcol, int numrow,String code,String name,String srcImg, String price,String quantity){
        //Dung de khai bao cac items
        MyPanelBoxShadow pnlItemProd_t = new MyPanelBoxShadow();
        pnlItemProd_t.setBackground(new java.awt.Color(255, 255, 255));
        pnlItemProd_t.setPreferredSize(new java.awt.Dimension(284, 200));
        pnlItemProd_t.setShadowOpacity(0.2F);
        
        JLabel imgItemProd_t = new JLabel();
        imgItemProd_t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/hp.png"))); // NOI18N

        JLabel lblItemNameProd_t = new JLabel();
        lblItemNameProd_t.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblItemNameProd_t.setText(name+i.toString());
        lblItemNameProd_t.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLabel dollaricon = new JLabel();
        dollaricon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dollaricon.setForeground(new java.awt.Color(10, 200, 186));
        dollaricon.setText("$");

        JLabel lblItemPriceProd_t = new JLabel();
        lblItemPriceProd_t.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemPriceProd_t.setForeground(new java.awt.Color(10, 200, 186));
        lblItemPriceProd_t.setText(price);

        JLabel lblItemQuantityProd_t = new JLabel();
        lblItemQuantityProd_t.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemQuantityProd_t.setForeground(new java.awt.Color(102, 102, 102));
        lblItemQuantityProd_t.setText(quantity);

        MyButton btnDetail = new MyButton();
        btnDetail.setForeground(new java.awt.Color(255, 255, 255));
        btnDetail.setText("Detail");
        btnDetail.setBorderColor(new java.awt.Color(24, 145, 143));
        btnDetail.setColor(new java.awt.Color(24, 145, 143));
        btnDetail.setColorClick(new java.awt.Color(19, 120, 118));
        btnDetail.setColorOver(new java.awt.Color(47, 173, 171));
        btnDetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDetail.setRadius(20);

        //Bat su kien click cho items
        pnlItemProd_t.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ProductClick(e,code);
            }
        });
        imgItemProd_t.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ProductClick(e,code);
            }
        });
        lblItemNameProd_t.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               ProductClick(e,code);
            }
        });
        
        lblItemPriceProd_t.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                 ProductClick(e,code);
            }
        });
        lblItemQuantityProd_t.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ProductClick(e,code);
            }
        });
        btnDetail.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               DetailProductClick(e,code);
            }
        });
        
        //Dat vi tri  cho items
        javax.swing.GroupLayout pnlItemProdLayout = new javax.swing.GroupLayout(pnlItemProd_t);
        pnlItemProd_t.setLayout(pnlItemProdLayout);
        pnlItemProdLayout.setHorizontalGroup(
            pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItemProdLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItemProdLayout.createSequentialGroup()
                            .addComponent(imgItemProd_t, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItemProdLayout.createSequentialGroup()
                            .addComponent(lblItemNameProd_t, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)))
                    .addGroup(pnlItemProdLayout.createSequentialGroup()
                        .addGroup(pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblItemQuantityProd_t, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlItemProdLayout.createSequentialGroup()
                                .addComponent(dollaricon, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblItemPriceProd_t, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        pnlItemProdLayout.setVerticalGroup(
            pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItemProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgItemProd_t, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblItemNameProd_t)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItemProdLayout.createSequentialGroup()
                        .addGroup(pnlItemProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dollaricon)
                            .addComponent(lblItemPriceProd_t))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemQuantityProd_t))
                    .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    
       pnlItemProd_t.setBounds((10+284)*numcol+5,(10+300)*numrow +10,284,300);
       return pnlItemProd_t;
    
    }
    private void ProductClick(MouseEvent evt, String code) {
        parentFrame.setIdProductSelected(code);
        parentFrame.setProductSelected("Current Name","Current Price", "Current Quantity");
    }
    
    private void DetailProductClick(MouseEvent evt, String code) {
        DetailProduct dtpd = new DetailProduct(code);
        dtpd.setVisible(true);
        dtpd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
