/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Custom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class Card extends javax.swing.JPanel {


    private Color color1,color2;
    Model_Card card;

    public Model_Card getCard() {
        return card;
    }

    public void setCard(Model_Card card) {
        this.card = card;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    public Card() {
        initComponents();
        setOpaque(false);
        color2=new Color(15,167,200);
        color1=new Color(15,67,200);
        this.setPreferredSize(new Dimension(260,90));
    }

    public void setData(Model_Card s){
        txt_PersonID.setText("Person ID: "+String.valueOf(s.getId()));
        txt_PersonName.setText("FullName: "+(s.getPersonName()));
        txt_Grade.setText("Grade: "+s.getGrade());
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_PersonID = new javax.swing.JLabel();
        txt_PersonName = new javax.swing.JLabel();
        txt_Grade = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        txt_PersonID.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txt_PersonID.setForeground(new java.awt.Color(255, 255, 255));
        txt_PersonID.setText("ID");

        txt_PersonName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txt_PersonName.setForeground(new java.awt.Color(255, 255, 255));
        txt_PersonName.setText("Course Name");

        txt_Grade.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txt_Grade.setForeground(new java.awt.Color(255, 255, 255));
        txt_Grade.setText("Department");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PersonID)
                    .addComponent(txt_Grade)
                    .addComponent(txt_PersonName))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_PersonID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_PersonName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Grade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txt_Grade;
    private javax.swing.JLabel txt_PersonID;
    private javax.swing.JLabel txt_PersonName;
    // End of variables declaration//GEN-END:variables
}
