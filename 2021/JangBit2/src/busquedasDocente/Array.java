package busquedasDocente;



import jangbit2.BuscadorJangbit;
import jangbitDocente.BuscadorDocente;
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

public class Array extends JFrame implements ActionListener{

    private JLabel texto1, texto2, texto3; 
    private JButton regresar;
    private JlabelLink link1, link2, link3;
    
    public Array(){
    
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
                        Logger.getLogger(Array.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Array.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
}

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
        setTitle("Array");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void iniciarComponentes() {
        
            texto1 = new JLabel("Funciones de los arreglos");
            texto1.setBounds(20, 20, 400, 20);
            add (texto1);
            
            link1 = new JlabelLink("https://findanyanswer.com/que-son-y-para-qu-sirven-los-arreglos","https://findanyanswer.com/que-son-y-para-qu-sirven-los-arreglos");
            link1.setForeground(Color.blue);
            link1.setBounds (20, 40,850,20);
            
            add(link1);
            
            texto2 = new JLabel ("Funcionalidad de un arreglo");
            texto2.setBounds(20, 70, 400, 20);
            add(texto2);
            
            link2 = new JlabelLink ("https://sites.google.com/site/programacionyal/home/unidad-5/5-3-utilizacion-de-arreglos","https://sites.google.com/site/programacionyal/home/unidad-5/5-3-utilizacion-de-arreglos");
            link2.setForeground(Color.blue);
            link2.setBounds(20,90,850,20);
            add(link2);
            
            texto3 = new JLabel ("Informacion general arreglos");
            texto3.setBounds(20,120,400,20);
            add(texto3);
            
            link3 = new JlabelLink ("https://www.ecured.cu/Arreglos_(Inform%C3%A1tica)","https://www.ecured.cu/Arreglos_(Inform%C3%A1tica)");
            link3.setForeground(Color.blue);
            link3.setBounds(20,140,850,20);
            add(link3);
            
            regresar = new JButton ("Regresar");
            regresar.setBounds(175,200,150,20);
            add(regresar);
            regresar.addActionListener(this);
            
            
    }
    
    
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(regresar)) {
            dispose();
            BuscadorDocente buscar = new BuscadorDocente();
        }
        
    }
}
