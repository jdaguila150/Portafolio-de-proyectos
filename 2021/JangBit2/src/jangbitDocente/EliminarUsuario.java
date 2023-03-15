package jangbitDocente;


import jangbit2.Archivo;
import jangbit2.DatosUser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class EliminarUsuario extends JFrame implements ActionListener {
    
    
    
    Archivo objArchivo = new Archivo();

   
   private JTextField txtCorreoElectronico;

   private JLabel CorreoElectronicoT;
   private JLabel PWT; //PW = contrasena
   private JLabel InstruccionT;
   private JButton CancelarR, BorrarU;
   private JPasswordField txtPW;
   
   private ArrayList<DatosUser> LUsuario = new ArrayList<>();
   public EliminarUsuario (){
   
       LUsuario = objArchivo.leer();
       configurarVentana();
       iniciarComponentes();
       setVisible(true);
   
   }
   
   
   
   public void configurarVentana(){
   
        setLayout(null);
        setSize(850,350);
        setTitle("Eliminar Usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
   }
   
   
   
   public void iniciarComponentes(){
       
       
       //Instrucciones
       InstruccionT = new JLabel("Eliminar Usuario");
       InstruccionT.setBounds(230,0,500,50);
       InstruccionT.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
       add(InstruccionT);
       
       //COrreo
       CorreoElectronicoT = new JLabel("Correo Institucional");
       CorreoElectronicoT.setBounds(340, 40, 200,50);
       CorreoElectronicoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(CorreoElectronicoT);
       txtCorreoElectronico = new JTextField();
       CorreoElectronicoT.setForeground(Color.blue);
       txtCorreoElectronico.setBounds(300, 80, 200, 25);
       add(txtCorreoElectronico);
       
       
       //COntraseña
       PWT = new JLabel("Contraseña:");
       PWT.setBounds(360, 140, 200, 50);
       PWT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(PWT);
       PWT.setForeground(Color.red);
       txtPW = new JPasswordField();
       txtPW.setBounds(300, 180, 200, 25);
       add(txtPW);
       
       
       //Boton
       CancelarR = new JButton("Regresar");
       CancelarR.setBounds(100, 250, 200, 25);
       add(CancelarR); 
       CancelarR.setForeground(Color.red);
       CancelarR.addActionListener(this);
       
       BorrarU = new JButton("Eliminar");
       BorrarU.setBounds(500, 250, 200, 25);
       add(BorrarU);
       BorrarU.setForeground(Color.blue);
       BorrarU.addActionListener(this);
   }
   
   
   
    @Override
    public void actionPerformed(ActionEvent evento) {
        String tipo = evento.getActionCommand();

if (evento.getSource().equals(BorrarU) ) {

    
        boolean encontrado = false;
        String correoBuscar = txtCorreoElectronico.getText();
        int tamanoLista = LUsuario.size();
        for (int i = 0; i < tamanoLista; i++) {
        String correo = LUsuario.get(i).getCorreoElectronicoD().trim();
        String correoEntrante = correoBuscar.trim();
        boolean sonIguales = correo.equals(correoEntrante);
        if (sonIguales) {
        
         String contrasenaBuscar = txtPW.getText();
         String contrasena = LUsuario.get(i).getContrasenaD().trim();
         String contrasenaEntrante =  contrasenaBuscar.trim();
                  LUsuario.remove(i);
         boolean autentificacionExitosa = contrasena.equals(contrasenaEntrante);

        
        
         if(autentificacionExitosa){
            encontrado = true;
 
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            break;
           
        }
    }   
}
       
if (!encontrado) {
        JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EL USUARIO");
        txtCorreoElectronico.setText("");
        txtPW.setText(""); 
    }

        }
            else if (evento.getSource().equals(CancelarR)){
            objArchivo.serializar(LUsuario);
            dispose();
            BuscadorDocente regresar = new BuscadorDocente();
        }  
    }       
}


