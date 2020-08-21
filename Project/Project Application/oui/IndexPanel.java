package oui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class IndexPanel extends JPanel implements ActionListener {
	private JLabel lblRows;
	private JComboBox comboIndices;
	private JButton btnCreate;
	private JProgressBar progressBar;

	public IndexPanel(JTabbedPane tabPane) {
		tabPane.addTab("Indices", this);
		initComponents();
	}

	private void initComponents() {
		this.setBorder(BorderFactory.createMatteBorder(25, 25, 25, 25, Color.darkGray));
		this.setBackground(new Color(0, 100, 0));

		lblRows = new JLabel();
		lblRows.setFont(new Font("Monospaced", 0, 50)); // NOI18N
		lblRows.setForeground(new Color(255, 255, 255));
		lblRows.setText("Column:");

		comboIndices = new JComboBox(new String[] {"--Select One--", "Name", "UserName", "Password"});
		comboIndices.setFont(new Font("Monospaced", 0, 35)); // NOI18N

		btnCreate = new JButton();
		btnCreate.setFont(new Font("Monospaced", 0, 50)); // NOI18N
		btnCreate.setText("Create Index");
		btnCreate.addActionListener(this);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setFont(new Font("Monospaced", 0, 50));

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(
					layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblRows, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(comboIndices, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGroup(
					layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGroup(layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					  .addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					  .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(
			layout.createSequentialGroup()
			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(
					layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(comboIndices, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblRows, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			.addGap(50, 50, 50)
			.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
			.addGap(50, 50, 50)
			.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		IndexPanel obj = this;
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					if(comboIndices.getSelectedIndex() == 0){
						JOptionPane.showMessageDialog(obj, "Please select a column");
						return;
					}
					DataManager.CreateIndex(comboIndices.getSelectedItem().toString(), obj);
					JOptionPane.showMessageDialog(obj, "Index created successfully");
					progressBar.setValue(0);
				} catch (Exception ex) {
				}
			}
		});
		t.start();
	}
	
	public void updateStatus(int percent){
		progressBar.setValue(percent);
	}
}
