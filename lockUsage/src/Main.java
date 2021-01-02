
public class Main {
    public static void main(String[] args) {
        /*
        
        bu alanda synchroinzed anahtar kelimesinin sorunları ve buna karşı locklar ile nasıl çözüm üretebileceğimi göstermeye çalışıyor olacağım ...
        
        */
        
        ListWorker l1 = new ListWorker();
        long baslangıc = System.currentTimeMillis();
        l1.degerAta();
        long bitis = System.currentTimeMillis();
        System.out.println("İşlemlerin gerçekleşme zamanı = "+(bitis-baslangıc)+" ms");
        //standart dışı sonuçlarla karşılaşıyoruz
    }
}
