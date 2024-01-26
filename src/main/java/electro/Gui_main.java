package electro;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui_main {
	private JComboBox<String> combo_tarif;
	private JLabel labelTarif1 = new JLabel("Введите ваш расход:");
	private JLabel labelTarif2d = new JLabel("Введите расход электроэнергии ДЕНЬ:");
	private JLabel labelTarif2n = new JLabel("Введите расход электроэнергии НОЧЬ:");
	private JLabel TextOutput = new JLabel("");
	private JTextField ElectroData = new JTextField(10);
	private JTextField ElectroData1 = new JTextField(10);
	private JTextField ElectroData2 = new JTextField(10);
	private String[] transfer = {"Однозонный тариф", "Двузонный тариф"};
	private JLabel[] arrayLabel= {labelTarif1,labelTarif2d,labelTarif2n};
	private JTextField[] arrayTextField = {ElectroData,ElectroData1,ElectroData2};
	private JFrame main_GUI;
	private JPanel main_panel;
	public Gui_main(String name, String label) {
	
	main_GUI = new JFrame("Electro");
	main_GUI.setTitle (name);
	main_GUI.setBounds(500,400,400,500);
	main_GUI.setResizable(false); 
	
	main_panel = new JPanel();
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
		
	JLabel laba_info = new JLabel(label);
	laba_info.setBounds(60,0,300,30);
	main_panel.add(laba_info);
	
	
	combo_tarif = new JComboBox<String>(transfer);
	combo_tarif.setBounds(30,40,150,30);
	ActionListener tarif_set = new tarif_set();
	combo_tarif.addActionListener(tarif_set);
	main_panel.add(combo_tarif);
	
	JLabel labelOutput = new JLabel("Всего сумма к оплате:");
	labelOutput.setBounds(30,300,250,30);
	main_panel.add(labelOutput);;
	
	TextOutput = new JLabel("");
	TextOutput.setBounds(30,330,250,30);
	TextOutput.setEnabled(false);
	main_panel.add(TextOutput);
	
	JButton button_create = new JButton("Расчет платы");
	button_create.setBounds(20,400,150,40);
	ActionListener actionCreate = new ListenerCalc();
	button_create.addActionListener(actionCreate);
	main_panel.add(button_create);
	
	JButton button_exit = new JButton("Выход");
	button_exit.setBounds(270,400,100,40);
	ActionListener actionListener = new ListenerButton();
	button_exit.addActionListener(actionListener); 
	main_panel.add(button_exit);
	
	main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public JPanel getPanel() {
		return main_panel;
	}
	
	public JLabel[] getLabel() {
		return arrayLabel;
	}
	public JTextField[] getTextField() {
		return arrayTextField;
	}
	
	public String[] getTransfer() {
		return transfer;
	}
	
	public JLabel getLabelOutput() {
		return TextOutput;
	}
	
	public JComboBox<String> getComboTarif() {
		return combo_tarif;
	}

}
