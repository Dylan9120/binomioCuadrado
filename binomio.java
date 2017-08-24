package binomiocuadrado;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.*;
import java.io.*;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Dylan Josel Vaca Méndez
 * @version 1.0
 */
public class binomio extends JFrame implements ActionListener{
    int a=0, b=0, a2=0, ab=0, b2=0, res=0;
    
    JLabel nu1, nu2;
    JTextField n1, n2;
    JButton calc;
    
    public binomio(){
        //Pantalla
        setLayout(null);
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //etiquetas
        nu1 = new JLabel("Numero 1 (a):");
        nu1.setBounds(10, 10, 100, 20);
        add(nu1);
        nu2 = new JLabel("Numero 2 (b):");
        nu2.setBounds(10, 40, 100, 20);
        add(nu2);
        
        //Campos de text
        n1 = new JTextField();
        n1.setBounds(115, 10, 100, 20);
        add(n1);
        n2 = new JTextField();
        n2.setBounds(115, 40, 100, 20);
        add(n2);
        
        //Boton de calcular
        calc = new JButton("Calcular");
        calc.setBounds(57, 70, 100, 20);
        calc.addActionListener(this);
        add(calc);
        
        setVisible(true);
    }
    /**
     * @param e trae el origen de la acción efectuada
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        a = Integer.parseInt(n1.getText());
        b = Integer.parseInt(n2.getText());
        if(e.getSource() == calc){
            if(a == 0 || b == 0){
                JOptionPane.showMessageDialog(rootPane, "Favor de introducir un valor que no sea 0");
            }
            else{
                a2 = (int) Math.pow(a, 2);
                ab = 2*(a*b);
                b2 = (int) Math.pow(b, 2);
                res = a2 + ab + b2;
                JOptionPane.showMessageDialog(rootPane, "El resultado es " + a2 + " + " + ab + " + " + b2 + " = " + res);
            } 
        }
        
    }
}
