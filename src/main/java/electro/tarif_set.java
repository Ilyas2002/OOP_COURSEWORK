package electro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tarif_set implements ActionListener {

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> box = (JComboBox<String>)e.getSource();
		String item = (String)box.getSelectedItem();
		JPanel panel = Main.gui.getPanel();
		JLabel[] arrayLabel = Main.gui.getLabel();
		JTextField[] arrayTextField = Main.gui.getTextField();
		String[] transfer = Main.gui.getTransfer();
		JLabel labelTarif1 = arrayLabel[0];
		JLabel labelTarif2d = arrayLabel[1];
		JLabel labelTarif2n = arrayLabel[2];
		JTextField ElectroData = arrayTextField[0];
		JTextField ElectroData1 = arrayTextField[1];
		JTextField ElectroData2 = arrayTextField[2];
		labelTarif1.setBounds(30,70,250,30);
		ElectroData.setBounds(30,110,150,30);
		labelTarif2d.setBounds(30,70,250,30);
		ElectroData1.setBounds(30,110,150,30);
		labelTarif2n.setBounds(30,140,250,30);
		ElectroData2.setBounds(30,170,150,30);
		
		if(item==transfer[0]) {
			panel.remove(labelTarif2d);
			panel.remove(labelTarif2n);
			panel.remove(ElectroData1);
			panel.remove(ElectroData2);

			panel.add(labelTarif1);
			panel.add(ElectroData);
			
			panel.repaint();
			panel.revalidate();
			
		}
		
		if(item==transfer[1]) {
			panel.remove(labelTarif1);
			panel.remove(ElectroData);

			panel.add(labelTarif2d);
			panel.add(ElectroData1);
			panel.add(labelTarif2n);
			panel.add(ElectroData2);
			
			panel.repaint();
			panel.revalidate();
		}
		

	}

}
