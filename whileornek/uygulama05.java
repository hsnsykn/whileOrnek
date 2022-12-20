package whileornek;

/**
 *bileşik faiz hesaplama
 * formül =birikimli tutar =anapara *(1+faiz)^ dönem
 */
public class uygulama05 {
    public static void main(String[] args) {
        int anapara = 100;
        double faiz = 0.05; // % 5 faiz
        int donem = 24 ;
        for (int k=0; k <=donem ;k++ ){
            double birikimlitutar =anapara *Math.pow(1+faiz,k);
            System.out.println(k + " dönem sonu " + birikimlitutar );
        }
    }
    
}
