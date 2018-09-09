package extra;

import javax.swing.JOptionPane;

public class votingboth extends rollercoaster {
	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("");
		int age = Integer.parseInt(b);
		if (age > 18) {
			JOptionPane.showMessageDialog(null,
					"who do you want the president to be? --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------P.S. do not choose Trump");
		}
		if (age<=18) {
		JOptionPane.showMessageDialog(null,"I Don't care that you broke your elbow, ----------so go away until you are older than 18 or else I will make you play rabloxx with 2 x, not 1");	
		}
		}
	}


// package extra;

// import javax.swing.JOptionPane;

// public class rollercoaster {
// public static void main(String[] args) {
// String c =JOptionPane.showInputDialog("what is your height?");
// int height=Integer.parseInt(c);
// if (height <= 48) {
// JOptionPane.showMessageDialog(null, "you need to grow,would you like to buy
// extra height for 100 robux?");}
// if (height > 48) {
// JOptionPane.showMessageDialog(null, "good job, you can pass");
// }
// }
// }