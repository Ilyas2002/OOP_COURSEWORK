package electro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String exitHat="Выйти??";
		String exitLow="Завершение работы пррограммы";
		new Exit(exitHat, exitLow);

	}

}
