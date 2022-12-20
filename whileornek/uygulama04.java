package whileornek;

/**
 *faiz hesaplama 
 * @author soyka
 */
public class uygulama04 {
    public static void main(String[] args) {
     int anapara = 100;
     double faiz = 0.05;// %5 faiz oranı yıllık 
     int dönem = 24 ; // 24 aylık 
     int k = 0;
     while (k < dönem){
         // dönemlik görmek istiyoruz 
         double dsTutar = anapara *(1 + (faiz*k));
         System.out.print(k + "dönem sonu tutarı"+ dsTutar );
         k++;
     }
    }
   
}
