package oui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import oui.DataManager.SearchResult;

public class QueryPanel extends JPanel implements ActionListener {
	private JLabel lblselQuery;
	private JComboBox comboBoxQuery;
	private JLabel lbleql;
	private JTextField txtQuery;
	private JButton btnSearch;
	private JLabel lblStats;
	private JLabel lblUser;

	public QueryPanel(JTabbedPane tabPane) {
		tabPane.addTab("Query", this);
		initComponents();
	}

	private void initComponents() {
		this.setBorder(BorderFactory.createMatteBorder(25, 25, 25, 25, Color.darkGray));
		this.setBackground(new Color(0, 100, 0));

		lblselQuery = new JLabel();
		lblselQuery.setFont(new Font("Monospaced", 0, 45));
		lblselQuery.setForeground(new Color(255, 255, 255));
		lblselQuery.setText("Select * from Table WHERE ");

		String[] option = { "Name", "UserName", "Password" };
		comboBoxQuery = new JComboBox<>(option);
		comboBoxQuery.setFont(new Font("Monospaced", 0, 20));
		comboBoxQuery.setPreferredSize(new Dimension(150, 50));

		lbleql = new JLabel();
		lbleql.setFont(new Font("Monospaced", 0, 45));
		lbleql.setForeground(new Color(255, 255, 255));
		lbleql.setText("=");

		txtQuery = new JTextField("");
		txtQuery.setColumns(10);
		txtQuery.setFont(new Font("Monospaced", 0, 36));

		btnSearch = new JButton();
		btnSearch.setFont(new Font("Monospaced", 0, 50));
		btnSearch.setText("Search");
		btnSearch.addActionListener(this);

		lblStats = new JLabel();
		lblStats.setFont(new Font("Monospaced", 0, 25));
		lblStats.setForeground(new Color(255, 255, 255));
		lblStats.setText("Search Method: ##SM##, Time taken: ##TT##, Pages Read: ##PR##");
		
		lblUser = new JLabel();
		lblUser.setFont(new Font("Monospaced", 0, 25));
		lblUser.setForeground(new Color(255, 255, 255));
		lblUser.setText("Id: ##ID##, Name: ##NAME##, User Name: ##UN##, Password: ##PWD##");

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblselQuery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(comboBoxQuery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(lbleql, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(txtQuery,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

		.addGroup(layout.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnSearch,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

		.addGroup(layout.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lblStats,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		
		.addGroup(layout.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lblUser,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(lblselQuery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxQuery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbleql, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQuery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(50, 50, 50)
				.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(50, 50, 50)
				.addComponent(lblStats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(50, 50, 50)
				.addComponent(lblUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DataManager.Search(comboBoxQuery.getSelectedItem().toString(), txtQuery.getText(), this);
	}
	
	public void updateResults(SearchResult result)
	{
		if(result.DataRow != null){
			lblUser.setText
			(
					"Roll Number: ##RNO##, Name: ##NAME##, User Name: ##UN##, Password: ##PWD##"
					.replace("##RNO##", result.DataRow.RollNum + "\n")
					.replace("##NAME##", result.DataRow.Name + "\n")
					.replace("##UN##", result.DataRow.UserName + "\n")
					.replace("##PWD##", result.DataRow.Password + "\n")
			);
		}
		
		lblStats.setText
		(
				"Search Method: ##SM##, Time taken: ##TT##, Pages Read: ##PR##"
				.replace("##SM##", result.IndexesUsed? "Index Seek\n": "Table Scan\n")
				.replace("##TT##", result.TimeTaken + " ms\n")
				.replace("##PR##", result.PagesLoaded + "\n")
		);
	}
}
