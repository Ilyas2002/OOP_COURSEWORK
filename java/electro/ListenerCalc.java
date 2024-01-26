package electro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ListenerCalc implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JComboBox<String> combo = Main.gui.getComboTarif();
		String item = (String)combo.getSelectedItem();
		String[] transfer = Main.gui.getTransfer();
		JTextField[] arrayTextField = Main.gui.getTextField();
		JLabel Output = Main.gui.getLabelOutput();

		
		if (item==transfer[0]) {
			if (!"1234567890.\b".contains(arrayTextField[0].getText())||arrayTextField[0].getText().isEmpty()) {arrayTextField[0].setText("0");}
			One_tarif tarif1 = new One_tarif(Double.parseDouble(arrayTextField[0].getText()));
			Output.setText(tarif1.toString());
			
		}
		
		if (item==transfer[1]) {
			if (!"1234567890.\b".contains(arrayTextField[1].getText())||arrayTextField[1].getText().isEmpty()) {arrayTextField[1].setText("0");}
			if (!"1234567890.\b".contains(arrayTextField[2].getText())||arrayTextField[2].getText().isEmpty()) {arrayTextField[2].setText("0");}
			Two_tarif tarif2 = new Two_tarif(Double.parseDouble(arrayTextField[1].getText()),Double.parseDouble(arrayTextField[2].getText()));
			tarif2.getMultiAll();
			Output.setText(tarif2.toString());
			
			
		}
		
		
		
		
	}

}
