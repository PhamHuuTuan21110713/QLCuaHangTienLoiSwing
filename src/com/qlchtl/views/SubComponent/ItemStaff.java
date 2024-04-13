/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.views.DetailStaff;
import com.qlchtl.views.FormMain;
import com.qlchtl.views.MyControls.MyPanel;
import com.qlchtl.views.MyControls.MyPanelBoxShadow;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dell
 */
public class ItemStaff {
    FormMain parentForm;
    public ItemStaff(FormMain parentForm) {
        this.parentForm = parentForm;
    }
    
    public MyPanelBoxShadow createItemStaffComponent(int numcol, int numrow,String code,String name,String gender, Boolean state,String phone){
        MyPanelBoxShadow  pnlItemStaff = new MyPanelBoxShadow();
        pnlItemStaff.setBackground(new java.awt.Color(255, 255, 255));
        pnlItemStaff.setShadowSize(3);
        pnlItemStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffItemClick(evt, name, code,phone,state);
            }
        });
        JLabel avatar = new JLabel();
        avatar.setIcon(new ImageIcon(getClass().getResource("/com/qlchtl/image/nv2.jpg")));
        
        MyPanelBoxShadow pnlAvatarStaff = new MyPanelBoxShadow();
        pnlAvatarStaff.setPreferredSize(new java.awt.Dimension(74, 74));
        pnlAvatarStaff.setTypeShape(java.lang.Boolean.TRUE);
        pnlAvatarStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffItemClick(evt, name, code,phone,state);
            }
        });
        MyPanel pnlStateStaff = new MyPanel();
        if(state == false){
            pnlStateStaff.setBackground(new java.awt.Color(230, 30, 80));
        } else if(state == true){
             pnlStateStaff.setBackground(new java.awt.Color(52, 235, 146));
        }
        
        pnlStateStaff.setPreferredSize(new java.awt.Dimension(15, 15));
        pnlStateStaff.setRoundBottomLeft(15);
        pnlStateStaff.setRoundBottomRight(15);
        pnlStateStaff.setRoundTopLeft(15);
        pnlStateStaff.setRoundTopRight(15);
        
        javax.swing.GroupLayout pnlStateStaffLayout = new javax.swing.GroupLayout(pnlStateStaff);
        pnlStateStaff.setLayout(pnlStateStaffLayout);
        pnlStateStaffLayout.setHorizontalGroup(
            pnlStateStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlStateStaffLayout.setVerticalGroup(
            pnlStateStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlAvatarStaffLayout = new javax.swing.GroupLayout(pnlAvatarStaff);
        pnlAvatarStaff.setLayout(pnlAvatarStaffLayout);
        pnlAvatarStaffLayout.setHorizontalGroup(
            pnlAvatarStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvatarStaffLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
//                .addComponent(avatar)
                .addComponent(pnlStateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlAvatarStaffLayout.setVerticalGroup(
            pnlAvatarStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAvatarStaffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addComponent(avatar)
                .addComponent(pnlStateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JLabel lblNameStaff = new JLabel();
        lblNameStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNameStaff.setForeground(new java.awt.Color(51, 51, 51));
        lblNameStaff.setText(name);
        lblNameStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffItemClick(evt, name, code,phone,state);
            }
        });
        
        JLabel lblCodeStaff = new JLabel();
        lblCodeStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodeStaff.setForeground(new java.awt.Color(51, 51, 51));
        lblCodeStaff.setText(code);
        lblCodeStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffItemClick(evt, name, code,phone,state);
            }
        });
        
        JLabel lblPhoneStaff = new JLabel();
        lblPhoneStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhoneStaff.setForeground(new java.awt.Color(51, 51, 51));
        lblPhoneStaff.setText(phone);
        lblPhoneStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffItemClick(evt, name, code,phone,state);
            }
        });
        
        JLabel lblPhoneStaff1 = new JLabel();
        lblPhoneStaff1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhoneStaff1.setForeground(new java.awt.Color(51, 51, 51));
        lblPhoneStaff1.setText(gender);
        lblPhoneStaff1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffItemClick(evt, name, code,phone,state);
            }
        });
        
        MyPanelBoxShadow pnlDetailStaff = new MyPanelBoxShadow();
        pnlDetailStaff.setBackground(new java.awt.Color(24, 145, 143));
        pnlDetailStaff.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlDetailStaff.setShadowColor(new java.awt.Color(24, 145, 143));
        pnlDetailStaff.setShadowOpacity(0.8F);
        pnlDetailStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailStaffClick(evt,code);
            }
        });

        JLabel lblDetailStaff = new JLabel();
        lblDetailStaff.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDetailStaff.setForeground(new java.awt.Color(255, 255, 255));
        lblDetailStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetailStaff.setText(">");
        lblDetailStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailStaffClick(evt,code);
            }
        });

        javax.swing.GroupLayout pnlDetailStaffLayout = new javax.swing.GroupLayout(pnlDetailStaff);
        pnlDetailStaff.setLayout(pnlDetailStaffLayout);
        pnlDetailStaffLayout.setHorizontalGroup(
            pnlDetailStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailStaffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDetailStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDetailStaffLayout.setVerticalGroup(
            pnlDetailStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDetailStaff)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        MyPanelBoxShadow pnlDeleteStaff = new MyPanelBoxShadow();
        pnlDeleteStaff.setBackground(new java.awt.Color(230, 30, 80));
        pnlDeleteStaff.setPreferredSize(new java.awt.Dimension(40, 40));
        pnlDeleteStaff.setShadowColor(new java.awt.Color(230, 30, 80));
        pnlDeleteStaff.setShadowOpacity(0.8F);
        pnlDeleteStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStaffClick(evt,code);
            }
        });

        JLabel lblDeleteStaff = new JLabel();
        lblDeleteStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeleteStaff.setForeground(new java.awt.Color(255, 255, 255));
        lblDeleteStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeleteStaff.setText("X");
        lblDeleteStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStaffClick(evt, code);
            }
        });

        javax.swing.GroupLayout pnlDeleteStaffLayout = new javax.swing.GroupLayout(pnlDeleteStaff);
        pnlDeleteStaff.setLayout(pnlDeleteStaffLayout);
        pnlDeleteStaffLayout.setHorizontalGroup(
            pnlDeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeleteStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDeleteStaffLayout.setVerticalGroup(
            pnlDeleteStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDeleteStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlItemStaffLayout = new javax.swing.GroupLayout(pnlItemStaff);
        pnlItemStaff.setLayout(pnlItemStaffLayout);
        pnlItemStaffLayout.setHorizontalGroup(
            pnlItemStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemStaffLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pnlAvatarStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNameStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblCodeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblPhoneStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(lblPhoneStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(pnlDeleteStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDetailStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pnlItemStaffLayout.setVerticalGroup(
            pnlItemStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemStaffLayout.createSequentialGroup()
                .addGroup(pnlItemStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItemStaffLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlAvatarStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addGroup(pnlItemStaffLayout.createSequentialGroup()
                        .addGroup(pnlItemStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlItemStaffLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(pnlItemStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNameStaff)
                                    .addComponent(lblCodeStaff)
                                    .addComponent(lblPhoneStaff)
                                    .addComponent(lblPhoneStaff1)))
                            .addGroup(pnlItemStaffLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(pnlItemStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlDeleteStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlDetailStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlItemStaff.setBounds((5+850)*numcol+5,(10+95)*numrow,850,95);
        return pnlItemStaff;
    }
    
    private void StaffItemClick(MouseEvent e,String name ,String code, String phone, Boolean state) {
        parentForm.setIdStaffSelected(code);
        parentForm.setStaffFound(name, state, code, phone);
    }
    
    private void DeleteStaffClick(MouseEvent e, String code) {
       parentForm.setIdStaffSelected(code);
       
    }
    
     private void DetailStaffClick (MouseEvent e, String code) {
        parentForm.setIdStaffSelected(code);
        DetailStaff dtst = new DetailStaff(code);
        dtst.setVisible(true);
        dtst.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
