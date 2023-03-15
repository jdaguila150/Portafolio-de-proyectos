package jangbit2;

import busquedas.Array;
import busquedas.tiposProgramacion;
import busquedas.estructuras;
import busquedas.Java;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class BuscadorJangbit extends JFrame implements ActionListener{

    private JLabel JangbitT;

    private JTextField txtBuscador;
    private JButton buscarB, regresarB;
    
    public BuscadorJangbit(){
    
    configurarVentana();
    iniciarComponentes();
    setVisible(true);
    
    }
    

    private void configurarVentana() {
        setLayout(null);
        setSize(850,650);
        setTitle("Diccionario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.darkGray);
    }


    private void iniciarComponentes() {
        JangbitT = new JLabel ("Jangbit");
        JangbitT.setForeground(Color.green);
        txtBuscador = new JTextField ();
        buscarB = new JButton();
               
        JangbitT.setBounds(345,50,200,50);
        JangbitT.setFont(new Font("Baskerville Old Face",Font.BOLD,40));
        add(JangbitT);
        
        
        txtBuscador.setBounds(300,100,200,25);
        add(txtBuscador);
        
        buscarB.setBounds(515, 100, 25, 25);
        ImageIcon iconoBtnAlta = new ImageIcon("C:\\Users\\David El Oso\\Desktop\\Escuela Josue\\POO\\Practicas\\JangBit2\\src\\jangbit2\\search_icon.png");
        Image img1 = iconoBtnAlta.getImage();
        Image newImage1 = img1.getScaledInstance(24, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon1 = new ImageIcon(newImage1);
        buscarB.setIcon(newicon1);
        add(buscarB);
        buscarB.addActionListener(this);
        
        regresarB = new JButton ("Regresar");
        regresarB.setBounds(425, 150, 100, 25);
        add(regresarB);
        regresarB.setForeground(Color.red);
        regresarB.addActionListener(this);
    }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String busqueda1 = txtBuscador.getText();
            if (e.getSource().equals(buscarB)){
                
                if (true==busqueda1.equalsIgnoreCase("Array")|| true==busqueda1.equalsIgnoreCase("lista") || true==busqueda1.equalsIgnoreCase("serie")
                        ||true==busqueda1.equalsIgnoreCase("list") || true==busqueda1.equalsIgnoreCase("arraylist") || true==busqueda1.equalsIgnoreCase("Array List")
                        ||true==busqueda1.equalsIgnoreCase("Array_list")||true==busqueda1.equalsIgnoreCase("arreglo")||true==busqueda1.equalsIgnoreCase("arreglo array")
                        ||true==busqueda1.equalsIgnoreCase("arreglo simple") || true==busqueda1.equalsIgnoreCase("arreglos compuesto")||true==busqueda1.equalsIgnoreCase("arreglos unidimensionales")
                        || true==busqueda1.equalsIgnoreCase("Arreglos")||true==busqueda1.equalsIgnoreCase("arreglo bidimensional")|| true==busqueda1.equalsIgnoreCase("Arreglos bidimensionales")
                        ||true==busqueda1.equalsIgnoreCase("Arreglo unidimensional")||true==busqueda1.equalsIgnoreCase("arreglo multidimensional")|| true==busqueda1.equalsIgnoreCase("arreglos multidimensionales")) {
                    dispose();
                    Array pasar = new Array();
                } 
        }        
            else
            if (true == busqueda1.equalsIgnoreCase("Java") ||true == busqueda1.equalsIgnoreCase("que es Java") ||true == busqueda1.equalsIgnoreCase("¿que es Java?") ||true == busqueda1.equalsIgnoreCase("que es Java?")
                    ||true == busqueda1.equalsIgnoreCase("que es?") ||true == busqueda1.equalsIgnoreCase("¿que es?") ||true == busqueda1.equalsIgnoreCase("que es") ||true == busqueda1.equalsIgnoreCase("reglas") ||true == busqueda1.equalsIgnoreCase("reglas de sintaxis")
                    ||true == busqueda1.equalsIgnoreCase("sintaxis") ||true == busqueda1.equalsIgnoreCase("cuales son las reglas de sintaxis?") ||true == busqueda1.equalsIgnoreCase("cuales son las reglas de sintaxis en java?") || true == busqueda1.equalsIgnoreCase("¿Cuales son las reglas de sintaxis") 
                    ||true == busqueda1.equalsIgnoreCase("¿cuanles son las reglas de sintaxis en Java?") ||true == busqueda1.equalsIgnoreCase("instalar") ||true == busqueda1.equalsIgnoreCase("como instalar java") ||true == busqueda1.equalsIgnoreCase("instalar java") ||true == busqueda1.equalsIgnoreCase("como instalar java?") ||true == busqueda1.equalsIgnoreCase("¿Como instalar Java?") 
                    ||true == busqueda1.equalsIgnoreCase("descargar") ||true == busqueda1.equalsIgnoreCase("como descargar Java") ||true == busqueda1.equalsIgnoreCase("como descargar Java?") ||true == busqueda1.equalsIgnoreCase("¿como descargar Java?") ||true == busqueda1.equalsIgnoreCase("descargar e instalar") 
                    ||true == busqueda1.equalsIgnoreCase("como descargar e instalar") ||true == busqueda1.equalsIgnoreCase("como descargar e instalar?") ||true == busqueda1.equalsIgnoreCase("¿como descargar e instalar?") ||true == busqueda1.equalsIgnoreCase("como descargar e instalar Java") 
                    ||true == busqueda1.equalsIgnoreCase("como descargar e instalar java?") ||true == busqueda1.equalsIgnoreCase("¿como descargar e instalar Java?") ||true == busqueda1.equalsIgnoreCase("compilacion") ||true == busqueda1.equalsIgnoreCase("como compilar?") ||true == busqueda1.equalsIgnoreCase("como compilar") ||true == busqueda1.equalsIgnoreCase("¿como compilar en java?") 
                    ||true == busqueda1.equalsIgnoreCase("como compilar en java") ||true == busqueda1.equalsIgnoreCase("como compilar en java?") ||true == busqueda1.equalsIgnoreCase("¿como compilar en java?") ||true == busqueda1.equalsIgnoreCase("que es el compilador") ||true == busqueda1.equalsIgnoreCase("¿que es el compilador?") ||true == busqueda1.equalsIgnoreCase("que es el compilador?") 
                    ||true == busqueda1.equalsIgnoreCase("consola") ||true == busqueda1.equalsIgnoreCase("consola de comandos")||true == busqueda1.equalsIgnoreCase("que es la consola de comandos")||true == busqueda1.equalsIgnoreCase("que es la consola de comandos?")||true == busqueda1.equalsIgnoreCase("¿que es la consola de comandos?")||true == busqueda1.equalsIgnoreCase("cmd")||true == busqueda1.equalsIgnoreCase("que es la cmd?") 
                    ||true == busqueda1.equalsIgnoreCase("que es cmd")||true == busqueda1.equalsIgnoreCase("que es cmd?")||true == busqueda1.equalsIgnoreCase("¿que es cmd?")) {
                dispose();
                Java java = new Java();
            }
                else
                if (true == busqueda1.equalsIgnoreCase("programacion") || true == busqueda1.equalsIgnoreCase("programacion estructurada") ||true == busqueda1.equalsIgnoreCase("programacion Orientada a objetos") || true == busqueda1.equalsIgnoreCase("que es la programacion") ||true == busqueda1.equalsIgnoreCase("que es la programacion?") ||true == busqueda1.equalsIgnoreCase("¿que es la programacion?") ||true == busqueda1.equalsIgnoreCase("Que es la programacion estructurada") 
                    ||true == busqueda1.equalsIgnoreCase("que es la programacion estructurada?") ||true == busqueda1.equalsIgnoreCase("¿que es la programacion estructurada") ||true == busqueda1.equalsIgnoreCase("poo") ) {
                    dispose();
                    tiposProgramacion programacion = new tiposProgramacion();
                }
                else
                if (true == busqueda1.equalsIgnoreCase("estructuras")||true == busqueda1.equalsIgnoreCase("estructuras de repeticion")||true == busqueda1.equalsIgnoreCase("repeticion")||true == busqueda1.equalsIgnoreCase("estructura if")||true == busqueda1.equalsIgnoreCase("estructura if than")||true == busqueda1.equalsIgnoreCase("estructura if than else")||true == busqueda1.equalsIgnoreCase("estructura if than else")
                    ||true == busqueda1.equalsIgnoreCase("estructuraa de repeticion if")||true == busqueda1.equalsIgnoreCase("estructuraa de repeticion if than")||true == busqueda1.equalsIgnoreCase("estructuraa de repeticion if than else")||true == busqueda1.equalsIgnoreCase("estructuraa de repeticion")||true == busqueda1.equalsIgnoreCase("que son las estructuraa de repeticion")
                    ||true == busqueda1.equalsIgnoreCase("que son las estructuras de repeticion?")||true == busqueda1.equalsIgnoreCase("¿que son las estructuraa de repeticion?")||true == busqueda1.equalsIgnoreCase("if")||true == busqueda1.equalsIgnoreCase("than")||true == busqueda1.equalsIgnoreCase("else")||true == busqueda1.equalsIgnoreCase("if then else")||true == busqueda1.equalsIgnoreCase("estructura while")
                    ||true == busqueda1.equalsIgnoreCase("estructura de repeticion while")||true == busqueda1.equalsIgnoreCase("estructura de repeticion while")||true == busqueda1.equalsIgnoreCase("estructura while")||true == busqueda1.equalsIgnoreCase("que es while")||true == busqueda1.equalsIgnoreCase("que es la estructura while?")||true == busqueda1.equalsIgnoreCase("¿que es la estructura while?")||true == busqueda1.equalsIgnoreCase("que es la estructura while")
                    ||true == busqueda1.equalsIgnoreCase("while")||true == busqueda1.equalsIgnoreCase("que es while?")||true == busqueda1.equalsIgnoreCase("¿que es while?")||true == busqueda1.equalsIgnoreCase("while do")||true == busqueda1.equalsIgnoreCase("while-do")||true == busqueda1.equalsIgnoreCase("que es la estructura while do")||true == busqueda1.equalsIgnoreCase("¿que es la estructura while do?")||true == busqueda1.equalsIgnoreCase("que la estructura while do?")
                    ||true == busqueda1.equalsIgnoreCase("do whilw")||true == busqueda1.equalsIgnoreCase("do-while")||true == busqueda1.equalsIgnoreCase("Estrucuta de repeticion For")||true == busqueda1.equalsIgnoreCase("estructura For")||true == busqueda1.equalsIgnoreCase("for")||true == busqueda1.equalsIgnoreCase("¿que es la estructura for?")||true == busqueda1.equalsIgnoreCase("que es la estructura for?")||true == busqueda1.equalsIgnoreCase("que es la estructura for")||true == busqueda1.equalsIgnoreCase("estructura for")) {   
                    dispose();
                    estructuras estructuras = new estructuras();
                }
                
                if (e.getSource().equals(regresarB)) {
                dispose();
                IniciarSesion regresar = new IniciarSesion();
            }
        }
    }
