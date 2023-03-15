package jangbit2;

import jangbitDocente.GuiSignInDocente;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PantallaPrincipal extends JFrame implements ActionListener {
    

    private JButton alunno, docente;
    private JLabel TextPg;
    
    public PantallaPrincipal(){
    
        configurarVentana();
        iniciarComponentes();
        setVisible(true);
    
    }
    
    public void configurarVentana(){
        setLayout(null);
        setSize(850,650);
        setTitle("Jangbit");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    }

    public void iniciarComponentes(){
        docente = new JButton("Docente");
        docente.setBounds(100,450,150,30);
        add(docente);
        docente.setForeground(Color.blue);
        docente.addActionListener(this);
        
        alunno = new JButton("Alumno");
        alunno.setBounds(600,450,100,30);
        add(alunno);
        alunno.setForeground(Color.blue);
        alunno.addActionListener(this);
        
        TextPg = new JLabel("BIENVENIDO A LA BIBLIOTECA DIGITAL");
        TextPg.setBounds(50, 20, 700, 300);
        TextPg.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
        add(TextPg);
        

    }
    
        @Override
    public void actionPerformed(ActionEvent evento) {
        String registrar = evento.getActionCommand();
        String ingresar = evento.getActionCommand();
        
        if (evento.getSource().equals(docente) ){
            dispose();
            GuiSignInDocente ingresara = new GuiSignInDocente();
            }
        
        if(registrar.equalsIgnoreCase("Alumno")){
            dispose();
            GuiSignInUser sumar = new GuiSignInUser();
        }
    }
}
