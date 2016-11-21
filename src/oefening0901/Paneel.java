/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefening0901;

import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.*;

public class Paneel extends JPanel {
    private JButton knop7, knop8, knop9, knopplus, 
            knop4, knop5, knop6, knopmin,        
            knop3, knop2, knop1, knopkeer,
            knop0, knopslash, knopC, knopis;
    private JTextField vak1;

    
public Paneel(){
    setLayout (new GridLayout (1,1));
    vak1 = new JTextField();
    add(vak1);
    setLayout(new GridLayout (4,4));
    knop7 = new JButton("7");
    knop8 = new JButton("8");
    knop9 = new JButton("9");
    knopplus = new JButton("+");
    knop4 = new JButton("4");
    knop5 = new JButton("5");
    knop6 = new JButton("6");
    knopmin = new JButton("-");
    knop3 = new JButton("3");
    knop2= new JButton("2");
    knop1 = new JButton("1");
    knopkeer = new JButton("*");
    knop0 = new JButton("0");
    knopslash = new JButton("/");
    knopC = new JButton("C");
    knopis = new JButton("=");
        
    add(knop7);
    add(knop8);
    add(knop9);
    add(knopplus);
    add(knop4);
    add(knop5);
    add(knop6);
    add(knopmin);
    add(knop3);
    add(knop2);
    add(knop1);
    add(knopkeer);
    add(knop0);
    add(knopslash);
    add(knopC);
    add(knopis);
    
    
}
}
