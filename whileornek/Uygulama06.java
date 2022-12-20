package whileornek;

import javax.swing.JOptionPane;

/**sayı tahmin oyunu 
 *
 * @author soyka
 */
public class Uygulama06 {
    //bilgisayar 1 ile 100araında rastgele bir sayı tutuyor 
    public static void main(String[] args) {
    int rs = (int)(Math.random()*100)+ 1; 
    int tahmin ;
    do{
       String t = JOptionPane.showInputDialog("Tahmin Et");
       tahmin = Integer.parseInt(t);
    }while(tahmin != rs );
    JOptionPane.showMessageDialog(null, " Tebrikler ");
        System.out.println(" rs = " + rs );
    }
 
}
