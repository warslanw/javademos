public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca (){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
         // String mesaj=""; bunuda yazabiliriz ama if li yazıyoruz ileriye dönük kodlama mantığı olması gerek.
        if(varMi){
            //mesajVer(mesaj); bu şekilde de yazabiliriz ama ileriye dönük sürdürülebilir bir yazılım olması için bu şekilde yapıyoruz.
            mesajVer("Sayı mevcuttur"+ aranacak);
        }else{
            mesajVer("Sayı mevcuttur değildir"+ aranacak);
        }
    }

    //parametreli metod
    public static void  mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}