package jangbit2;


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




public class IniciarSesion extends JFrame implements ActionListener {
    
    Archivo objArchivo = new Archivo();

   
   private JTextField txtCorreoElectronico;

   private JLabel CorreoElectronicoT;
   private JLabel PWT; //PW = contrasena
   private JLabel InstruccionT;
   private JButton CancelarR, IngresarR;
   private JPasswordField txtPW;
   
   private ArrayList<DatosUser> LUsuario = new ArrayList<>();
   public IniciarSesion (){
   
       LUsuario = objArchivo.leer();
       configurarVentana();
       iniciarComponentes();
       setVisible(true);
   
   }
   
   
   
   public void configurarVentana(){
   
        setLayout(null);
        setSize(850,350);
        setTitle("Ingresar al sistema");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
   }
   
   
   
   public void iniciarComponentes(){
       
       
       //Instrucciones
       InstruccionT = new JLabel("Introduzca los siguientes datos");
       InstruccionT.setBounds(230,0,500,50);
       InstruccionT.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
       add(InstruccionT);
       
       //COrreo
       CorreoElectronicoT = new JLabel("Correo Institucional:");
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
       
       IngresarR = new JButton("Ingresar");
       IngresarR.setBounds(500, 250, 200, 25);
       add(IngresarR);
       IngresarR.setForeground(Color.blue);
       IngresarR.addActionListener(this);
   }
   
   
   
    @Override
    public void actionPerformed(ActionEvent evento) {
        String tipo = evento.getActionCommand();

        if (tipo.equalsIgnoreCase("ingresar")){
         //cambiar if para que despliegue, no se ingreso ningun dato
        String texto1=txtCorreoElectronico.getText();
        String texto2=txtPW.getText();

        
        if(texto1.length()==0||texto2.length()==0){
            JOptionPane.showMessageDialog(null,"No se han llenado todos los datos");     
        }
    }

if (evento.getSource().equals(IngresarR) ) {

    
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
         boolean autentificacionExitosa = contrasena.equals(contrasenaEntrante);
        
        
         if(autentificacionExitosa){
            encontrado = true;
            break;
        }
    }   
}
if (!encontrado) {
        JOptionPane.showMessageDialog(null, "NO SE ENCUENTRA EL USUARIO");
        txtCorreoElectronico.setText("");
        txtPW.setText(""); 
    }
else
    if(encontrado = true){
        dispose();
        BuscadorJangbit mostrar = new BuscadorJangbit();
    }
        }
            else if (evento.getSource().equals(CancelarR)){
           
            dispose();
            GuiSignInUser mostrar = new GuiSignInUser();
        }  
    }       
}


