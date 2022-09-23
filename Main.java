public class Main {
    public static void main(String[] args) {
        int Sayi1 = 220;
        int Sayi2 = 284;
        int Toplam1 = 0;
        int Toplam2 = 0;

        for (int i=1; i<Sayi1; i++){
            if (Sayi1 % i ==0){
                Toplam1+=i;
            }
        }
        for (int i=1; i<Sayi2; i++){
            if (Sayi2 % i ==0){
                Toplam2+=i;
            }
        }
        if (Sayi1==Toplam2 && Sayi2==Toplam1){
            System.out.println("Arkadas sayilardir");
        }
        else{
            System.out.println("Arkadas sayi degillerdir");
        }
    }
}