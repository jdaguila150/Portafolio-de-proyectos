package jangbitDocente;


import jangbit2.Archivo;
import jangbit2.DatosUser;
import jangbit2.GuiSignInUser;
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


public class RegistraDocente extends JFrame implements ActionListener {

   private JTextField txtPaterno, txtNombres, txtMaterno, txtCorreoElectronico;
   private JPasswordField txtPW;
   private JPasswordField txtPWTConfirm;
   private JLabel PaternoT, MaternoT, NombresT,CorreoElectronicoT, PWT, PWTConfirm, InstruccionT;
   private JButton CancelarR, RegistraR;
   

   private ArrayList<DatosUser> LUsuario = new ArrayList<>();
   Archivo objArchivo = new Archivo();
  
   public RegistraDocente (){
   
       LUsuario = objArchivo.leer();
       configurarVentana();
       iniciarComponentes();
       setVisible(true);
   
   }
   
   public void configurarVentana(){
   
        setLayout(null);
        setSize(850,375);
        setTitle("Registrar usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
   }
   
   public void iniciarComponentes(){
       
       
       //Instrucciones
       InstruccionT = new JLabel("Ingrese los siguientes datos");
       InstruccionT.setBounds(300,0,300,50);
       InstruccionT.setFont(new Font("Baskerville Old Face", Font.BOLD,16));
       add(InstruccionT);
       
       
       //Apellido paterno
       PaternoT = new JLabel("Apellido Paterno:");
       PaternoT.setBounds(130, 50, 200,50);
       PaternoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(PaternoT);
       PaternoT.setForeground(Color.blue);
       txtPaterno = new JTextField();
       txtPaterno.setBounds(80, 85, 200, 25);
       add(txtPaterno);
       
       
       //Apellido MAterno
       MaternoT = new JLabel("Apellido Materno:");
       MaternoT.setBounds(355, 50, 200, 50);
       MaternoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(MaternoT);
       MaternoT.setForeground(Color.blue);
       txtMaterno = new JTextField();
       txtMaterno.setBounds(305, 85, 200, 25);
       add(txtMaterno);
       
       
       //Nombres
       NombresT = new JLabel("Nombre(s):");
       NombresT.setBounds(595, 50, 200, 50);
       NombresT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(NombresT);
       NombresT.setForeground(Color.blue);
       txtNombres = new JTextField();
       txtNombres.setBounds(530, 85, 200, 25);
       add(txtNombres);
       
       
       
       //COrreo
       CorreoElectronicoT = new JLabel("Correo Institucional:");
       CorreoElectronicoT.setBounds(120, 130, 200, 50);
       CorreoElectronicoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(CorreoElectronicoT);
       CorreoElectronicoT.setForeground(Color.blue);
       txtCorreoElectronico = new JTextField();
       txtCorreoElectronico.setBounds(80, 165, 200, 25);
       add(txtCorreoElectronico);
       
       
       //COntraseña
       PWT = new JLabel("Contraseña:");
       PWT.setBounds(370, 130, 200, 50);
       PWT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(PWT);
       PWT.setForeground(Color.red);
       txtPW = new JPasswordField();
       txtPW.setBounds(305, 165, 200, 25);
       add(txtPW);
       
        //COntraseña confirmar
       PWTConfirm = new JLabel("Confirme su Contraseña:");
       PWTConfirm.setBounds(560, 130, 200, 50);
       PWTConfirm.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(PWTConfirm);
       PWTConfirm.setForeground(Color.red);
       txtPWTConfirm = new JPasswordField();
       txtPWTConfirm.setBounds(530, 165, 200, 25);
       add(txtPWTConfirm);
       
       
       //Boton
       CancelarR = new JButton("Cancelar");
       CancelarR.setBounds(100, 275, 200, 25);
       add(CancelarR);
       CancelarR.setForeground(Color.red);
       CancelarR.addActionListener(this);
       
       RegistraR = new JButton("Registrar");
       RegistraR.setBounds(500, 275, 200, 25);
       add(RegistraR);
       RegistraR.setForeground(Color.blue);
       RegistraR.addActionListener(this);
   }
   
    @Override
    public void actionPerformed(ActionEvent evento) {
        String tipo = evento.getActionCommand();

        if (tipo.equalsIgnoreCase("Registrar")){
        
        String texto=txtNombres.getText();
        String texto1=txtPaterno.getText();
        String texto2=txtMaterno.getText();
        String texto3=txtCorreoElectronico.getText();
        String texto4=txtPW.getText();
        String texto5=txtPWTConfirm.getText();

        
        if(texto.length()==0||texto1.length()==0||texto2.length()==0||texto3.length()==0||texto4.length()==0 || texto5.length()==0){
        JOptionPane.showMessageDialog(null,"No se han llenado todos los datos");}
        else
        if(txtPW.getText().equals(txtPWTConfirm.getText())){
            DatosUser objDatosUser = new DatosUser();
            

            JOptionPane.showMessageDialog(null, "Se ha registrado el usuario");
            
            String CorreoElectronicoD = txtCorreoElectronico.getText();
            objDatosUser.setCorreoElectronicoD(CorreoElectronicoD);
            
            String ConfirmarD = txtPWTConfirm.getText();
            objDatosUser.setConfirmarD(ConfirmarD);
            
            String ContrasenaD = txtPW.getText();
            objDatosUser.setContrasenaD(ContrasenaD);
            
            String PaternoD = txtPaterno.getText();
            objDatosUser.setPaternoD(PaternoD);
            
            String MaternoD = txtMaterno.getText();
            objDatosUser.setMaternoD(MaternoD);
            
            String NombresD = txtNombres.getText();
            objDatosUser.setNombresD(NombresD);
            

            
            LUsuario.add(objDatosUser);
            
            txtCorreoElectronico.setText("");
            txtPW.setText("");
            txtPaterno.setText("");
            txtMaterno.setText("");
            txtNombres.setText("");
            txtPWTConfirm.setText("");
  
        }   
        else
    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
    }
            if (tipo.equalsIgnoreCase("Cancelar")){
            objArchivo.serializar(LUsuario);
            dispose();
            GuiSignInDocente mostrar = new GuiSignInDocente();
        }   
    }
}
