package Ventana;

import java.awt.Color;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


//eredamos la clase JDialog 

public class VentanaSecundaria extends JDialog{
		private Ventana v;
	public VentanaSecundaria(Ventana v, boolean b){
		
	
		super(v,b);//se va a la clase padre
		this.v= v;
			setSize(600,500);
                        setTitle("Anuncio");//colocamos el titulo de la venta
                         setResizable(false);//establesemos si la ventana puede cambiar de tamaño o no
			setLocationRelativeTo(v);//esta linea es para estableser la ventana en el centro
		
                        setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);// EXIT ON CLOSE ES PARA DEJAR DE EJECUTAr el programa
		
	 IniciarComponente2();
		
	}
        public VentanaSecundaria(){
            
        }
        private void IniciarComponente2(){
      colocarPanel2();
      colocarEtique2();
        
       
    }
    private void colocarPanel2(){
        JPanel panel = new JPanel();//creacion de un panel
        panel.setBackground(Color.YELLOW);//ESTABLESEMOS EL COLOR DEL PANEL(ES COMO UNA HOJA DE PAPEL EL PANEL)
        panel.setLayout(null); //desactivar el diseño De panel
        this.getContentPane().add(panel);//agregamos ventana
    }
         private void colocarEtique2(){
        
        //etiqueta 1 de texto
        JLabel etiqueta= new JLabel();//CREAMOS UNA etiqueta
        etiqueta.setText("EL POLLO SABROSO");//estableser el texto de la etiqueta
        etiqueta.setBounds(0, 0, 750, 55);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//ESTABLESEMOS EL NOMBRE DE LA ETIQUETA EN EL CENTRO
        etiqueta.setForeground(Color.YELLOW);//establesemos el color de la letra
        etiqueta.setOpaque(true);//damos permiso para pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.RED);//DAMOS EL COLOR DE LA ETIQUETA etiqueta.setFont(new Font("Gill Sans Ultra Bold",1,30));//establesemos la fuente de texto de la etiqueta
       
        add(etiqueta);//agregamos la etiqueta al panel
        
         }
	

  
    
    
}