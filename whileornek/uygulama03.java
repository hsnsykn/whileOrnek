package whileornek;

import javax.swing.JOptionPane;

/**login işlemi 
 *
 * @author soyka
 */
public class uygulama03 {
    public static void main(String[] args) {
     String sifre = "";
     do{
      sifre = JOptionPane.showInputDialog("Lütfen şifre giriniz");
     } while (!sifre.equals("123"));// şifre eşit değilse
     JOptionPane.showInputDialog(null,"Hoşgeldiniz");
        System.out.println("Hoşgeldiniz");
    }
   
}
