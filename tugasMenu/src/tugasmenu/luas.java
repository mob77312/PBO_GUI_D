/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmenu;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author ACER
 */
public class luas extends JFrame
        implements ActionListener{
    private JLabel  luasB;
    private JLabel  panjangt;
    private JLabel  lebart;
    private JLabel  tinggit;
    private JLabel  hasilt;
    private JTextField panjang;
    private JTextField lebar;
    private JTextField tinggi;
    private JTextField akhir;
    private JButton hasil;
    private JButton balik;
    public luas() {
        luasB = new JLabel("Luas Balok");
        panjangt = new JLabel("Panjang :");
        lebart = new JLabel("Lebar :");
        tinggit = new JLabel("Tinggi :");
        hasilt = new JLabel("Hasil :");
        panjang = new JTextField();
        lebar = new JTextField();
        tinggi = new JTextField();
        akhir = new JTextField();
        hasil = new JButton("Terapkan");
        balik = new JButton("Kembali");
        hasil.addActionListener(this);
        balik.addActionListener(this);
        panjang.addActionListener(this);
        tinggi.addActionListener(this);
        lebar.addActionListener(this);
        setSize(400,300);
        setLayout(null);
        add(luasB);
        add(panjangt);
        add(tinggit);
        add(lebart);
        add(panjang);
        add(lebar);
        add(tinggi);
        add(akhir);
        add(hasil);
        add(balik);
        setVisible(true);
        luasB.setBounds(170,10,120,20);
        panjangt.setBounds(10,50,120,20);
        panjang.setBounds(150,50,120,20);
        tinggit.setBounds(10,90,120,20);
        tinggi.setBounds(150,90,120,20);
        lebart.setBounds(10,130,120,20);
        lebar.setBounds(150,130,120,20);
        hasil.setBounds(100,170,90,20);
        balik.setBounds(250,170,90,20);
        akhir.setBounds(150,210,120,20);
        setVisible(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==hasil) {
           float x;
           float panja = Float.valueOf(panjang.getText());
           float leba = Float.valueOf(panjang.getText());
           float ting = Float.valueOf(tinggi.getText());
           float vb = 2*(panja*leba+panja*ting+leba*ting);
           akhir.setText((String.valueOf(vb)));
            
        }
          if (e.getSource()==balik) {
           new Menu();
        }
    }

    
    
}
