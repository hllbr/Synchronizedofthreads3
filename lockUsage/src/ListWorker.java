
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListWorker {
    Random random = new Random();//Rastgele değerler üretmemizi sağlayan bir yapı (class)
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    //hiçbir thread kullanmadan sadece main thread ile iki arraye 2000 adet değer atamaya çalışıyoruz.
    public void degerEkleListe1(){
        for(int i= 0;i<2000;i++){
            //her değer atamadan sonra 1 milisaniye beklemek istiyoruz
            array1.add(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void degerEkleListe2(){
        for(int i= 0;i<2000;i++){
            //her değer atamadan sonra 1 milisaniye beklemek istiyoruz
            array2.add(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void degerAta(){
        degerEkleListe1();
        degerEkleListe2();
        System.out.println("array1 size = "+array1.size()+" array2 size = "+array2.size());
    }
    
}
