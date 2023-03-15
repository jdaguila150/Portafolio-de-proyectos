package walmart;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class GuiWalmart extends JFrame implements ActionListener {

fondo objFondo = new fondo();
private JTextField codigoBarrasT, productoT;
private JButton altaB, consultaB, salirB, eliminarB, modificarB;
private JLabel codigoBarrasL, productoL, tituloL;
Color colornaranja = new Color(238, 120, 22);


private ArrayList<baseDatos> LWalmart = new ArrayList<>();
public GuiWalmart() {
configurarVentana();
iniciarComponentes();

}


private void configurarVentana() {
    
setTitle("Base de Datos ");
setSize(850, 650); 
this.setContentPane(objFondo);
setLocationRelativeTo(null); 
setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void iniciarComponentes() {

tituloL = new JLabel("Base de Datos Grupo Walmart ");
tituloL.setBounds(250, 20, 450, 100);
tituloL.setForeground(colornaranja);
tituloL.setFont(new Font("TimesRoman", Font.BOLD, 18));
add(tituloL);
codigoBarrasL = new JLabel("Codigo de barras del producto");
codigoBarrasL.setFont(new Font("TimesRoman", Font.BOLD, 18));
codigoBarrasL.setForeground(colornaranja);
codigoBarrasL.setBounds(40, 140, 500, 30); 
add(codigoBarrasL);
productoL = new JLabel("Nombre del producto ");
productoL.setFont(new Font("TimesRoman", Font.BOLD, 18));
productoL.setBounds(40, 180, 260, 30);
productoL.setForeground(colornaranja);
add(productoL);

codigoBarrasT = new JTextField();
codigoBarrasT.setBounds(325, 140, 100, 20);
add(codigoBarrasT);
productoT = new JTextField();
productoT.setBounds(250, 180, 100, 20);
add(productoT);
// Buttons
altaB = new JButton("Alta");
        altaB.setFont(new Font("TimesRoman", Font.BOLD, 18));
        altaB.setBounds(50, 400, 120, 20);
        add(altaB);
        ImageIcon iconoBtnAlta = new ImageIcon("C:\\Users\\David El Oso\\Desktop\\Escuela Josue\\POO\\Practicas\\walmart\\src\\walmart\\upload_icon.png");
        Image img1 = iconoBtnAlta.getImage();
        Image newImage1 = img1.getScaledInstance(24, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon1 = new ImageIcon(newImage1);
        altaB.setIcon(newicon1);
        setVisible(true);
altaB.addActionListener(this);



consultaB = new JButton("Consulta");
consultaB.setBounds(200, 400, 170, 20);
consultaB.setFont(new Font("TimesRoman", Font.BOLD, 18));
add(consultaB);
ImageIcon iconobtnconsulta = new ImageIcon("C:\\Users\\David El Oso\\Desktop\\Escuela Josue\\POO\\Practicas\\walmart\\src\\walmart\\search_icon.png");
        Image img2 = iconobtnconsulta.getImage();
        Image newImage2 = img2.getScaledInstance(24, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon2 = new ImageIcon(newImage2);
        consultaB.setIcon(newicon2);
        setVisible(true);
consultaB.addActionListener(this);

eliminarB = new JButton ("Eliminar");
eliminarB.setBounds (400, 400, 190, 20);
eliminarB.setFont(new Font("TimesRoman", Font.BOLD, 18));
add(eliminarB);
ImageIcon iconoBtnEliminar = new ImageIcon("C:\\Users\\David El Oso\\Desktop\\Escuela Josue\\POO\\Practicas\\walmart\\src\\walmart\\trash.png");
        Image img3 = iconoBtnEliminar.getImage();
        Image newImage3 = img3.getScaledInstance(24, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon3 = new ImageIcon(newImage3);
        eliminarB.setIcon(newicon3);
        setVisible(true);
eliminarB.addActionListener (this);


salirB = new JButton("Salir");
salirB.setBounds(620, 400, 150, 20);
salirB.setFont(new Font("TimesRoman", Font.BOLD, 18));
add(salirB);
ImageIcon iconoBtnSalir = new ImageIcon("C:\\Users\\David El Oso\\Desktop\\Escuela Josue\\POO\\Practicas\\walmart\\src\\walmart\\exit.png");
        Image img4 = iconoBtnSalir.getImage();
        Image newImage4 = img4.getScaledInstance(24, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newicon4= new ImageIcon(newImage4);
        salirB.setIcon(newicon4);
        setVisible(true);
salirB.addActionListener (this);


}

@Override



public void actionPerformed(ActionEvent e) {

if (e.getSource().equals(altaB) ) {
baseDatos objDatos = new baseDatos();
String codigoBarras = codigoBarrasT.getText();
objDatos.setCodigoBarras(codigoBarras);
String producto = productoT.getText();
objDatos.setProducto(producto);


int confirmado = JOptionPane.showConfirmDialog(null, "Estas seguro ?", "ALTA ", JOptionPane.YES_NO_OPTION);
if (JOptionPane.OK_OPTION == confirmado){
JOptionPane.showMessageDialog(null, "PRODUCTO INGRESADO");
LWalmart.add(objDatos);
}
else{
JOptionPane.showMessageDialog(null, "NO SE INGTRESO EL PRODUCTO ");
}
codigoBarrasT.setText("");
productoT.setText("");
}


else if(e.getSource().equals(eliminarB)){
    boolean borrar = false;
        String codigoBarrasBuscar = codigoBarrasT.getText();
        int tamanoLista = LWalmart.size();
        for (int i = 0; i < tamanoLista; i++) {
                String nombreMascota = LWalmart.get(i).getCodigoBarras().trim();
                String nombreMascotaEntrante = codigoBarrasBuscar.trim();
                boolean sonIguales = nombreMascota.equals(nombreMascotaEntrante);
                if(sonIguales){
                int confirmado = JOptionPane.showConfirmDialog(null, "estas seguro ?", "Borrar ", JOptionPane.YES_NO_OPTION);  
                if(JOptionPane.OK_OPTION == confirmado){
                LWalmart.remove(i);
                borrar = true;
                JOptionPane.showMessageDialog(null, "SE HA BORRADO El PRODUCTO");
                break;}
                else
                        JOptionPane.showMessageDialog(null, "NO SE BORRO EL PRODUCTO");
                }
        }
    codigoBarrasT.setText("");
    productoT.setText("");
    if (!borrar) {
        JOptionPane.showMessageDialog(null, "EL PRODUCTO NO SE ENCUENTRA");
        codigoBarrasT.setText("");
        productoT.setText("");
    }
}
else if (e.getSource().equals(consultaB) ) {
boolean encontrado = false;





String productoBuscar = codigoBarrasT.getText();
int tamanoLista = LWalmart.size();
for (int i = 0; i < tamanoLista; i++) {
String codigoBarras = LWalmart.get(i).getCodigoBarras().trim();
String codigoBarrasEntrante = productoBuscar.trim();
boolean sonIguales = codigoBarras.equals(codigoBarrasEntrante);
if (sonIguales) {
codigoBarrasT.setText(LWalmart.get(i).getCodigoBarras());
productoT.setText(LWalmart.get(i).getProducto());
encontrado = true;
break;

}
}
if (!encontrado) {
JOptionPane.showMessageDialog(null, "EL PRODUCTO NO SE ENCUENTRA");
codigoBarrasT.setText("");
productoT.setText("");
}
}
else if (e.getSource().equals(salirB) ) {
System.exit(0);
}
}
}