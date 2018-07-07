package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
public static void main(String[] args) {
for(int i=0; i<5;i++) {
Random rand = new Random();
int Bryan=rand.nextInt(10000);
System.out.println(Bryan);
// coach's favorite
}
JOptionPane.showMessageDialog(null, "you won the lottery!");
}
}