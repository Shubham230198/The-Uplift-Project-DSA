package oui;

import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
	JTabbedPane tabPane;
	
	HomePanel homePanel;
	DataPanel dataPanel;
	IndexPanel indexPanel;
	QueryPanel queryPanel;
	
	public App() {
		tabPane = new JTabbedPane();
		tabPane.setFont(new Font("Comic Sans MS", 1, 30));
		tabPane.setBackground(Color.DARK_GRAY);
		tabPane.setForeground(Color.WHITE);
		
		homePanel = new HomePanel(tabPane);
		dataPanel = new DataPanel(tabPane);
		indexPanel = new IndexPanel(tabPane);
		queryPanel = new QueryPanel(tabPane);
		
		super.add(tabPane);
		
		pack();
		
		super.setTitle("RDBMS Index Implementation");
		super.setExtendedState(MAXIMIZED_BOTH);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setVisible(true);
	}
}
