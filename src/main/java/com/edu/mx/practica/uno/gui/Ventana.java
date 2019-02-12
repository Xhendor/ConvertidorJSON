package com.edu.mx.practica.uno.gui;

import com.edu.mx.practica.uno.convetidor.Convertidor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {


    private JTextArea entrada, salida;
    private JButton botonParaConvertir;
    private JComboBox selector;

    public Ventana() {

        //Tamaño de ventana
        this.setSize(new Dimension(500, 500));
        //Evitar que se manipule su medida
        this.setLayout(null);

        init();

        //Agregar funcionar de finlizar programa a boton X
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    private void init() {
        //Elementos que se van a utilizar
        entrada = new JTextArea();
        entrada.setBounds(new Rectangle(10,5,150,300));

        salida = new JTextArea();
        salida.setBounds(new Rectangle(getWidth()-170,5,150,300));

        botonParaConvertir = new JButton("Convertir");
        botonParaConvertir.setBounds(new Rectangle(160,200,100,20));
        //Agregar listener
        botonParaConvertir.addActionListener(this);
        selector = new JComboBox();

        this.add(entrada);
        this.add(botonParaConvertir);
        this.add(salida);
        this.add(selector);
    }

    public static void main(String[] args) {

        Ventana ventana = new Ventana();
        //Para que sea visible
        ventana.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {

        String textoEntrada= entrada.getText();
        //Validar texto vacio
        if(textoEntrada.trim().length()==0){
            JOptionPane.showMessageDialog(
                    this,
                    "No hay texto",
                    "Texto vacio!!!",
                    JOptionPane.WARNING_MESSAGE);
        }else{

        Convertidor convertidor=new Convertidor();

        String textoConvertido=  convertidor.convertirXmlToJson(textoEntrada);

        salida.setText("");
        salida.setText(textoConvertido);

        }


    }
}
