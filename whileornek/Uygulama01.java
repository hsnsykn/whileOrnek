package whileornek;

/**
 *
 * @author soyka
 */
public class Uygulama01 {
    public static void main(String[] args) {
     int sayı = 5;
     long faktoryel = 1 ;
     while (sayı > 0){
     faktoryel *= sayı-- ;// işlem biter ve azaltır
     System.out.println("Faktöryel = " + faktoryel);
     }
    }
   
}
