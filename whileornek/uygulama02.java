package whileornek;
/**do-while önce işlemi yapar sonra kontrol eder
 *
 * @author soyka
 */
public class uygulama02 {
    public static void main(String[] args) {
     int sayı = 5;
     int faktoryel = 1 ;
     do {
      faktoryel *= sayı-- ;
     } while (sayı>0);
        System.out.println("Faktoryel = " + faktoryel ) ;
    }
   
}
