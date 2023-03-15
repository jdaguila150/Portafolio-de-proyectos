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


public class Java extends JFrame implements ActionListener{

    private JLabel texto1, texto2, texto3;
    private JlabelLink link1, link2, link3;
    private JButton regresar;
    
    public Java(){
    
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
                        Logger.getLogger(Java.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Java.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            }
            );
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
        
            regresar = new JButton ("Regresar");
            regresar.setBounds(175,200,150,20);
            add(regresar);
            regresar.addActionListener(this);
            
            
            texto1 = new JLabel("¿Como instalar Java?");
            texto1.setBounds(20, 20, 400, 20);
            add (texto1);
            
            link1 = new JlabelLink("https://www.java.com/es/download/help/download_options_es.html","https://www.java.com/es/download/help/download_options_es.html");
            link1.setBounds (20, 40,850,20);
            add(link1);
            link1.setForeground(Color.blue);
          
            
            texto2 = new JLabel ("Manera correcta de compilar");
            texto2.setBounds(20, 70, 400, 20);
            add(texto2);
            
            link2 = new JlabelLink("https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=395:compilar-y-ejecutar-un-programa-java-uso-de-la-consola-dos-o-cmd-de-windows-invocar-javac-cu00612b&catid=68&Itemid=188","https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=395:compilar-y-ejecutar-un-programa-java-uso-de-la-consola-dos-o-cmd-de-windows-invocar-javac-cu00612b&catid=68&Itemid=188");
            link2.setBounds(20,90,850,20);
            add(link2);
            link2.setForeground(Color.blue);
            
            texto3 = new JLabel ("Reglas de sintaxis de Java");
            texto3.setBounds(20,120,400,20);
            add(texto3);
            
            link3 = new JlabelLink ("http://codigoprogramacion.com/cursos/java/67-sintaxis-de-java.html#.YYXUfGDMJhF","http://codigoprogramacion.com/cursos/java/67-sintaxis-de-java.html#.YYXUfGDMJhF");
            link3.setBounds(20,140,850,20);
            add(link3);
            link3.setForeground(Color.blue);
            

            
    }
    
    
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(regresar)) {
            dispose();
            BuscadorJangbit buscar = new BuscadorJangbit();
        }
        
    }
}
