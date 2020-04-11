/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123180022_kuis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Layout extends JFrame{
    JButton btnconvert;//deklarasi basic swing component
    JLabel nama, nim, mk1, mk2, nilai1,nilai2;
    JTextField txnama, txnim, txmk1, txmk2, txnilai1, txnilai2;
    double Rerata;
    
    public void tesLayout(){
        setTitle("Hitung Nilai"); //judul jendela GUI
        btnconvert = new JButton("convert"); //nama swing component yang akan muncul dijendela
        nama = new JLabel ("nama");
        nim = new JLabel ("nim");
        mk1= new JLabel("mata kuliah 1");
        mk2= new JLabel("mata kuliah 2");
        nilai1= new JLabel("nilai 1");
        nilai2 = new JLabel("nilai 2");
        txnama =new JTextField();
        txnim= new JTextField();
        txmk1 =new JTextField();
        txmk2 = new JTextField();
        txnilai1= new JTextField();
        txnilai2= new JTextField();
        
        
        setLayout(null); //mengatur tata letak kontrol tampilan menjadi nol(kosong)
        add(btnconvert); //menambahkan kontrol untuk ditampilkan
        add(nama);
        add(nim);
        add(mk1);
        add(mk2);
        add(nilai1);
        add(nilai2);
        add(txnama);
        add(txnim);
        add(txmk1);
        add(txmk2);
        add(txnilai1);
        add(txnilai2);
        
        
        nim.setBounds(10,20,100,20); //mengatur lokasi kontrol
        nama.setBounds(10,50,100,20);
        mk1.setBounds(10,80,100,20);
        nilai1.setBounds(10,110,100,20);
        mk2.setBounds(10,140,100,20);
        nilai2.setBounds(10,170,100,20);
        txnim.setBounds(120,20,120,20);
        txnama.setBounds(120,50,120,20);
        txmk1.setBounds(120,80,120,20);
        txnilai1.setBounds(120,110,120,20);
        txmk2.setBounds(120,140,120,20);
        txnilai2.setBounds(120,170,120,20);
        btnconvert.setBounds(90,200,80,30);
       
        
        setSize(260, 280); //mengatur luas tata letak jendela GUI
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        btnconvert.addActionListener((ActionEvent e) -> {//aksi tombol convert
             try {//apabilai nilai data yang diinput tidak sesuai atau kosong
                 int nimy =  Integer.parseInt(txnim.getText());
                 String namay = txnama.getText();
                 String  mk1y= txmk1.getText();
                 String mk2y = txmk2.getText();
                 double Nilai1y = Double.parseDouble(String.valueOf(txnilai1.getText()));
                 double Nilai2y = Double.parseDouble(String.valueOf(txnilai2.getText()));
                 
                 
                new OperasiNilai(nimy,namay,mk1y,mk2y,Nilai1y,Nilai2y);
             } catch (NumberFormatException ex) {//maka akan muncul aksi peringatan data tidak sesuai
                 JOptionPane.showMessageDialog(rootPane," TIPE DATA TIDAK SESUAI !");
             } 
        });
        
}
}

