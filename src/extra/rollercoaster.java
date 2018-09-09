
package extra;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		String c =JOptionPane.showInputDialog("what is your height?");
	int height=Integer.parseInt(c);
		if (height <= 48) {
			JOptionPane.showMessageDialog(null, "you need to grow,would you like to buy extra height for 100 robux?");}
		if (height > 48) {
			JOptionPane.showMessageDialog(null, "good job, you can pass");
		}
	}
}