public class Main {
    public static void main(String[] args) {
        int sayi = -2;
        int kalan = sayi % 2;
        //System.out.println(kalan);
        boolean asalSayiMi = true;

        if(sayi==1) {
            System.out.println("Sayi asal degildir");
            return;
        }

        if(sayi<1){
            System.out.println("Gecersiz sayi");
            return;
        }

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalSayiMi = false;

            }

        }
        if (asalSayiMi) {
            System.out.println("Sayi asaldir");
        } else {
            System.out.println("Sayi asal degildir");
        }
    }
}