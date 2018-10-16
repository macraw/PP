
package Uczeń;

import javax.swing.JOptionPane;


public class NewClass {

    public static void main(String[] args){
    Uczeń u = new Uczeń(JOptionPane.showInputDialog("wpisz nawisko"), Integer.parseInt(JOptionPane.showInputDialog("wpisz ocenę 1")) ,4);
        System.out.println(u);
    
    }
}
