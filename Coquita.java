import javax.swing.JOptionPane;

public class Coquita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Bien venido a la maquinita de coquita");
		Integer[] options = { 10, 25 };
		int valor = 0;
		while (valor < 45) {
			int moeda = JOptionPane.showOptionDialog(null, "São aceitas apenas moedas de R$0,10 e R$0,25 ", "Moeditas",
					JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

			if (moeda == 0) {
				valor += 10;
			} else if  (moeda == 1){
				valor += 25;
			}
			
		}

		JOptionPane.showMessageDialog(null, "Pegue la coquita embaixo aí");

	}
}
