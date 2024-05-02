package Aplro2.Week7.Praktikum4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

public class GUI implements ActionListener{
    public static void main(String[] args) {
        new GUI();
    }
    public GUI(){
        JFrame form = new JFrame("Deret Fibbonacci");
        form.setSize(400,400);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);

        JLabel input = new JLabel("Masukkan 4 digit nomor");
        input.setBounds(120,30,150,30);
        form.add(input);

        JLabel output = new JLabel("hai");
        output.setBounds(120,120,150,30);
        form.add(output);

        JTextField digit = new JTextField();
        digit.setBounds(120, 60, 140, 30); 
        form.add(digit);

        JButton add = new JButton("Add");
        add.setBounds(120, 90, 70, 30);
        add.addActionListener(this);
        form.add(add);

        form.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        

    }
}
