/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class tabung  extends JFrame
        implements ActionListener{
    private JLabel  luasB;
    private JLabel  radiust;
    private JLabel  hasilt;
    private JLabel  tinggit;
    private JTextField  radius;
    private JTextField tinggi;
    private JTextField akhir;
    private JButton hasil;
    private JButton balik;
    
    public tabung() {
        luasB = new JLabel("Volume Tabung");
        tinggit = new JLabel("Tinggi :");
        hasilt = new JLabel("Hasil :");
        radiust = new JLabel("Radius :");
        tinggi = new JTextField();
        radius = new JTextField();
        akhir = new JTextField();
        hasil = new JButton("Terapkan");
        balik = new JButton("Kembali");
        hasil.addActionListener(this);
        balik.addActionListener(this);
        radius.addActionListener(this);
        tinggi.addActionListener(this);
        setSize(400,300);
        setLayout(null);
        add(luasB);
        add(radius);
        add(radiust);
        add(tinggit);
        add(tinggi);
        add(akhir);
        add(hasil);
        add(balik);
        setVisible(true);
        luasB.setBounds(170,10,120,20);
        radiust.setBounds(10,50,120,20);
        radius.setBounds(150,50,120,20);
        tinggit.setBounds(10,90,120,20);
        tinggi.setBounds(150,90,120,20);
        hasil.setBounds(100,170,90,20);
        balik.setBounds(250,170,90,20);
        akhir.setBounds(150,210,120,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==hasil) {
           float phi;
           phi = (float) 3.14;
           float radi = Float.valueOf(radius.getText());
           float ting = Float.valueOf(tinggi.getText());
           float vt = phi*radi*ting;
           akhir.setText((String.valueOf(vt)));
           
        }
          if (e.getSource()==balik) {
           new Menu();
        }
    }
    

    
}
