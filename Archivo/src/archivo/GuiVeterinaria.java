package Archivo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GuiVeterinaria extends JFrame implements ActionListener {

    //  Se declaran los componentes gràficos
    private JTextField nombreT, razaT;
    private JButton altaB, consultaB, salirB;
    private JLabel nombreL, razaL, tituloL;
    
    // Se declara el ArrayList de mascotas 
    private ArrayList<Mascota> LMascota = new ArrayList<>();
    
    Archivo objArchivo = new Archivo();

    // Constructor que invoca métodos
    public GuiVeterinaria() {
        LMascota = objArchivo.leer();
        configurarVentana();
        iniciarComponentes();
    }
    // Método para configurar la ventana
    private void configurarVentana() {
        setTitle("   Veterinaria  ");      // Título de la ventana
        setSize(650, 500);                                                // Tamaño de la  ventana (ancho, alto)
        getContentPane().setBackground(Color.pink);    // color del fondo de la ventana
        setLocationRelativeTo(null);                    // Centramos la ventana en la pantalla
        setLayout(null);         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para cerrar  correctamente la ventana
    }

    // Método que configura cada uno de los componentes gráficos: ubicación, tipo de letra, etc.
    
    private void iniciarComponentes() {

        //    Labbels
        tituloL = new JLabel("BIENVENIDOS A  LA VETERINARIA  ");
        tituloL.setBounds(150, 20, 450, 100);
        tituloL.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(tituloL);
        
        nombreL = new JLabel("Nombre de tu mascota");
        nombreL.setFont(new Font("TimesRoman", Font.BOLD, 18));
        nombreL.setBounds(40, 180, 250, 30);   // (x,y, largo, ancho)
        add(nombreL);
        
        razaL = new JLabel("Raza de la mascota : ");
        razaL.setFont(new Font("TimesRoman", Font.BOLD, 18));
        razaL.setBounds(40, 220, 260, 30);
        add(razaL);

        // TextFields
        nombreT = new JTextField();
        nombreT.setBounds(250, 180, 100, 20);
        add(nombreT);
        
        razaT = new JTextField();
        razaT.setBounds(250, 220, 100, 20);
        add(razaT);
        
        // Buttons
        altaB = new JButton("Alta");
        altaB.setFont(new Font("TimesRoman", Font.BOLD, 18));
        altaB.setBounds(100, 350, 120, 20);
        add(altaB);
        altaB.addActionListener(this);

        consultaB = new JButton("Consulta");
        consultaB.setBounds(250, 350, 120, 20);
        consultaB.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(consultaB);
        consultaB.addActionListener(this);

        salirB = new JButton("Salir");
        salirB.setBounds(400, 350, 120, 20);
        salirB.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(salirB);
        salirB.addActionListener(this);
    }
 
// Método implementado de la interfaz ActionListener que ejecuta las instrucciones dependiendo al botón accionado.

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(altaB) ) {
            Mascota objMascota = new Mascota();
            String nombre = nombreT.getText();
            objMascota.setNombre(nombre);
            String raza = razaT.getText();
            objMascota.setRaza(raza);
           int confirmado = JOptionPane.showConfirmDialog(null, "Estas seguro ?", "ALTA ", JOptionPane.YES_NO_OPTION);
           if (JOptionPane.OK_OPTION == confirmado){
              JOptionPane.showMessageDialog(null, "MASCOTA DADO DE ALTA");
               LMascota.add(objMascota);
          }
           else{
            JOptionPane.showMessageDialog(null, "NO SE AGREGO MASCOTA ");
           }
            nombreT.setText(" ");
            razaT.setText("  ");

        }
       
        else if (e.getSource().equals(consultaB) ) {
            boolean encontrado = false;
            String mascotaBuscar = nombreT.getText();
            int tamanoLista = LMascota.size();
            for (int i = 0; i < tamanoLista; i++) {
                String nombreMascota = LMascota.get(i).getNombre().trim();
                String nombreMascotaEntrante = mascotaBuscar.trim();
                boolean sonIguales = nombreMascota.equals(nombreMascotaEntrante);
                if (sonIguales) {
                    nombreT.setText(LMascota.get(i).getNombre());
                    razaT.setText(LMascota.get(i).getRaza());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, " LA MASCOTA NO SE ENCUENTRA");
                nombreT.setText(" ");
                razaT.setText("  ");
            }
        } // del botón Consulta
        else if (e.getSource().equals(salirB) ) {
            objArchivo.serializar(LMascota);
            System.exit(0);
        }  // del botón Salir

    } // del método actionPerformed

} // de la clase
