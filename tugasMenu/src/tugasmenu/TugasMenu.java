/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmenu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Menu extends JFrame
        implements ActionListener {
    private JLabel judul;
    private JButton btnluas;
    private JButton btnvolumeB;
    private JButton btnvolumeT;
    public Menu(){
        judul = new JLabel("Menu");
        btnluas = new JButton("Luas Balok");
        btnvolumeB = new JButton("Volume Balok");
        btnvolumeT = new JButton("Volume Tabung");
        btnluas.addActionListener(this);
        btnvolumeB.addActionListener(this);
        btnvolumeT.addActionListener(this);
        setLayout(null);
        add(judul);
        add(btnluas);
        add(btnvolumeB);
        add(btnvolumeT);
        setSize(400,200);
        judul.setBounds(190,10,120,20);
        btnluas.setBounds(130,50,150,20);
        btnvolumeB.setBounds(130,90,150,20);
        btnvolumeT.setBounds(130,130,150,20);
        setVisible(true);
        
    }
        
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnluas) {
            new luas();
        }
       if (e.getSource()==btnvolumeB) {
            new balok();
        }
       if (e.getSource()==btnvolumeT) {
            new tabung();
        }
    }
    
}

public class TugasMenu {

    public static void main(String[] args) {
       new Menu();
    }
    
}
