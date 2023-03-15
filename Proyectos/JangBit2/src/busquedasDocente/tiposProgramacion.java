
package busquedasDocente;

import jangbit2.BuscadorJangbit;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class tiposProgramacion extends JFrame implements ActionListener{

    private JLabel texto1, texto2, texto3; 
    private JButton regresar;
    private JlabelLink link1, link2, link3;
    
    public tiposProgramacion(){
    
    configurarVentana();
    iniciarComponentes();
    setVisible(true);
    
    
    }
    
    public class JlabelLink extends JLabel{
    
        String url;
        String texto;

        public JlabelLink(String url, String texto) {
            this.url = url;
            this.texto = texto;
            setText(texto);
            makeLink();
        }

        private void makeLink() {
            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        Desktop.getDesktop().browse(new URI(url));
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(tiposProgramacion.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(tiposProgramacion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {
}

                @Override
                public void mouseEntered(MouseEvent e) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            })
                    ;
        }
    
        
    }
    
    private void configurarVentana() {
        setLayout(null);
        setSize(900,300);
        setTitle("Java");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void iniciarComponentes() {
        
            texto1 = new JLabel("Estructura de control Java");
            texto1.setBounds(20, 20, 400, 20);
            add (texto1);
            
            link1 = new JlabelLink("https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=79&punto=&inicio=","https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=79&punto=&inicio=");
            link1.setBounds (20, 40,850,20);
            add(link1);
            link1.setForeground(Color.blue);
            
            texto2 = new JLabel ("Que es la programacion orientada a objetos");
            texto2.setBounds(20, 70, 400, 20);
            add(texto2);
            
            link2 = new JlabelLink ("https://desarrolloweb.com/articulos/499.php","https://desarrolloweb.com/articulos/499.php");
            link2.setBounds(20,90,850,20);
            add(link2);
            link2.setForeground(Color.blue);
            
            texto3 = new JLabel ("Programación estructurada");
            texto3.setBounds(20,120,400,20);
            add(texto3);
            
            link3 = new JlabelLink ("http://joseltoro.blogspot.com/2018/10/que-es-una-estructura-de-secuencia-en.html","http://joseltoro.blogspot.com/2018/10/que-es-una-estructura-de-secuencia-en.html");
            link3.setBounds(20,140,850,20);
            add(link3);
            link3.setForeground(Color.blue);
            
            regresar = new JButton ("Regresar");
            regresar.setBounds(175,200,150,20);
            add(regresar);
            regresar.addActionListener(this);    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(regresar)) {
            dispose();
            BuscadorJangbit buscar = new BuscadorJangbit();
        }
        
    }
}
