
package oefening0901;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Oefening0901 extends JFrame {

   
    public static void main(String[] args) {
        JFrame frame = new Oefening0901();
        frame.setSize(450,340);
        frame.setLocation(700,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Kleine rekenmachine");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
    
}
