package jangbitDocente;

import jangbit2.IniciarSesion;
import jangbit2.PantallaPrincipal;
import jangbit2.Registra;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GuiSignInDocente extends JFrame implements ActionListener {
    

    private JButton IniciaS, RegistraU, Regresar;
    private JLabel TextPg;
    
    public GuiSignInDocente(){
    
        configurarVentana();
        iniciarComponentes();
        setVisible(true);
    
    }
    
    public void configurarVentana(){
        setLayout(null);
        setSize(800,600);
        setTitle("Jangbit");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    }

    public void iniciarComponentes(){
        IniciaS = new JButton("Inicar_Sesion");
        IniciaS.setBounds(100,375,150,30);
        add(IniciaS);
        IniciaS.setForeground(Color.blue);
        IniciaS.addActionListener(this);
        
        RegistraU = new JButton("Registrar");
        RegistraU.setBounds(550,375,100,30);
        add(RegistraU);
        RegistraU.setForeground(Color.blue);
        RegistraU.addActionListener(this);
        
        Regresar = new JButton ("Regresar");
        Regresar.setBounds(350,375,100,30);
        add(Regresar);
        Regresar.setForeground(Color.blue);
        Regresar.addActionListener(this);
        
        TextPg = new JLabel("BIENVENIDO A LA BIBLIOTECA DIGITAL DEL DOCENTE");
        TextPg.setBounds(50, 20, 700, 300);
        TextPg.setFont(new Font("Baskerville Old Face", Font.BOLD, 22));
        add(TextPg);
        

    }
    
        @Override
    public void actionPerformed(ActionEvent evento) {
        String registrar = evento.getActionCommand();
        String ingresar = evento.getActionCommand();
        
        if (evento.getSource().equals(IniciaS) ){
            dispose();
            IniciarSesionDocente ingresara = new IniciarSesionDocente();
        }
        if(registrar.equalsIgnoreCase("Registrar")){
            dispose();
            Registra sumar = new Registra();
        }
        if (evento.getSource().equals(Regresar) ){
        dispose();
        PantallaPrincipal regresar = new PantallaPrincipal();
        }
    }
}
