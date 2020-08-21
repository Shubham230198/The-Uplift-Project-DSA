package oui;

import java.awt.*;
import javax.swing.*;

public class HomePanel extends javax.swing.JPanel {
    public HomePanel(JTabbedPane tabPane) {
    	tabPane.addTab("Home", this);
        initComponents();
    }

    private JTextArea jTextArea;

    private void initComponents() {
    	this.setBorder(BorderFactory.createMatteBorder(25, 25, 25, 25, Color.darkGray));
    	this.setBackground(new Color(0, 100, 0));
    	
        jTextArea = new JTextArea();
        jTextArea.setFont(new Font("Monospaced", 0, 35)); // NOI18N
        jTextArea.setForeground(new Color(102, 0, 102));
        jTextArea.setColumns(60);
        jTextArea.setRows(5);
        jTextArea.setText("In this project, we are making a software which will make searching in Relational Database Management system optimized. As well as we will also show better performance of Index seek method over Table scan method.");
        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);
        
        javax.swing.GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
            	layout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(jTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
            	layout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(jTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(0, Short.MAX_VALUE))
        );
    }                       
}
