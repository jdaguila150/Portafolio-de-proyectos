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


public class EditorUsuario extends JFrame implements ActionListener {

   private JTextField txtPaterno;
   private JTextField txtMaterno;
   private JTextField txtNombres;
   private JTextField txtCorreoElectronico;
   private JPasswordField txtPW;
   private JLabel PaternoT;
   private JLabel MaternoT;
   private JLabel NombresT;
   private JLabel CorreoElectronicoT;
   private JLabel PWT; 
   private JLabel InstruccionT;
   private JButton CancelarR, ConsultarU, Editar;
   

   private ArrayList<DatosUser> LUsuario = new ArrayList<>();
   Archivo objArchivo = new Archivo();
  
   public EditorUsuario (){
   
       LUsuario = objArchivo.leer();
       configurarVentana();
       iniciarComponentes();
       setVisible(true);
   }
   
   public void configurarVentana(){
   
        setLayout(null);
        setSize(850,375);
        setTitle("Editar usuario");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
   public void iniciarComponentes(){
       
       
       //Instrucciones
       InstruccionT = new JLabel("Ingrese el correo institucional");
       InstruccionT.setBounds(300,0,300,50);
       InstruccionT.setFont(new Font("Baskerville Old Face", Font.BOLD,16));
       add(InstruccionT);
       
       
        CorreoElectronicoT = new JLabel("Correo Institucional:");
       CorreoElectronicoT.setBounds(120, 100, 200, 50);
       CorreoElectronicoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(CorreoElectronicoT);
       CorreoElectronicoT.setForeground(Color.blue);
       txtCorreoElectronico = new JTextField();
       txtCorreoElectronico.setBounds(80, 135, 200, 25);
       add(txtCorreoElectronico);
       
       
       //Apellido MAterno
       PaternoT = new JLabel("Apellido Paterno:");
       PaternoT.setBounds(355, 50, 200, 50);
       PaternoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(PaternoT);
       PaternoT.setForeground(Color.blue);
       txtPaterno = new JTextField();
       txtPaterno.setBounds(305, 85, 200, 25);
       add(txtPaterno);
       
       
       MaternoT = new JLabel("Apellido Materno:");
       MaternoT.setBounds(595, 50, 200, 50);
       MaternoT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(MaternoT);
       MaternoT.setForeground(Color.blue);
       txtMaterno = new JTextField();
       txtMaterno.setBounds(530, 85, 200, 25);
       add(txtMaterno);
      

       NombresT = new JLabel("Nombre(s):");
       NombresT.setBounds(370, 130, 200, 50);
       NombresT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(NombresT);
       NombresT.setForeground(Color.red);
       txtNombres = new JTextField();
       txtNombres.setBounds(305, 165, 200, 25);
       add(txtNombres);
       

       PWT = new JLabel("Contraseña:");
       PWT.setBounds(560, 130, 200, 50);
       PWT.setFont(new Font("TimesRoman", Font.BOLD, 12));
       add(PWT);
       PWT.setForeground(Color.red);
       txtPW = new JPasswordField();
       txtPW.setBounds(530, 165, 200, 25);
       add(txtPW);
       
       
       //Boton
       CancelarR = new JButton("Cancelar");
       CancelarR.setBounds(75, 275, 200, 25);
       add(CancelarR);
       CancelarR.setForeground(Color.red);
       CancelarR.addActionListener(this);
       
       ConsultarU = new JButton("Consultar");
       ConsultarU.setBounds(300, 275, 200, 25);
       add(ConsultarU);
       ConsultarU.setForeground(Color.blue);
       ConsultarU.addActionListener(this);
       
       Editar = new JButton ("Editar");      
       Editar.setBounds(535, 275, 200, 25);
       add(Editar);
       Editar.setForeground(Color.blue);
       Editar.addActionListener(this); 
    }
   
    @Override
    public void actionPerformed(ActionEvent evento) {
        String tipo = evento.getActionCommand();

        
   if(evento.getSource().equals(ConsultarU) ) {
        boolean encontrado = false;
        String correoBuscar = txtCorreoElectronico.getText();
        int tamanoLista = LUsuario.size();
        for (int i = 0; i < tamanoLista; i++) {
        String correo = LUsuario.get(i).getCorreoElectronicoD().trim();
        String correoEntrante = correoBuscar.trim();
        boolean sonIguales = correo.equals(correoEntrante);
        if (sonIguales) {

            txtCorreoElectronico.setText(LUsuario.get(i).getCorreoElectronicoD().trim());
            txtPW.setText(LUsuario.get(i).getContrasenaD().trim());
            txtPaterno.setText(LUsuario.get(i).getPaternoD().trim());
            txtMaterno.setText(LUsuario.get(i).getMaternoD().trim());
            txtNombres.setText(LUsuario.get(i).getNombresD().trim());    
        }
    }
}
        
            if (tipo.equalsIgnoreCase("editar")){
                            JOptionPane.showMessageDialog(null, "Usuario editado");
            DatosUser objDatosUser = new DatosUser();
      
            String CorreoElectronicoD = txtCorreoElectronico.getText();
            objDatosUser.setCorreoElectronicoD(CorreoElectronicoD);
            
            String ContrasenaD = txtPW.getText();
            objDatosUser.setContrasenaD(ContrasenaD);
            
            String PaternoD = txtPaterno.getText();
            objDatosUser.setPaternoD(PaternoD);
            
            String MaternoD = txtMaterno.getText();
            objDatosUser.setMaternoD(MaternoD);
            
            String NombresD = txtNombres.getText();
            objDatosUser.setNombresD(NombresD);
    
            LUsuario.add(objDatosUser);
            }
        else
        if(evento.getSource().equals(CancelarR)){
        objArchivo.serializar(LUsuario);
        dispose();
        BuscadorDocente mostrar = new BuscadorDocente();
        }
    }   
}   
        

        


    
    

