package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
    private JTextField entree = new JTextField( 6 );
   
    private JButton  boutonDeConversion = new JButton( "convertir" );
  
    private JTextField sortie = new JTextField( 6 );

    public IHMFahrenheit(){
        super("IHM Fahrenheit");

        setLayout(new FlowLayout());
        add( entree ); add( boutonDeConversion ); add( sortie );
        sortie.setEditable( false );
        getContentPane().setBackground( Color.pink );
        setLocation(100,100);
        pack();setVisible(true);

        boutonDeConversion.addActionListener( this );
    }

    
    public void actionPerformed( ActionEvent ae ){
        int fahrenheit = 0; 
        double celsius = 0.0; 
        double minVal = -273.1;

        try {
            if(ae.getSource() == boutonDeConversion){
                fahrenheit = Integer.parseInt(entree.getText());
                celsius = question2.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheit);

                if (celsius < minVal)
                    celsius = minVal;

                sortie.setText(Double.toString(celsius));
            }
        } catch (NumberFormatException nfe){
            sortie.setText("error ! ");
        }

    }

    public static void main(String[] args){
        new IHMFahrenheit();
    }
}
