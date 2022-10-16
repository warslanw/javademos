public class Main {
    public static void main(String[] args) {
        //claslar referans tiptir.
        CustomerManager customerManager = new CustomerManager(); //Bir classı kullanabilmek için new lenmiş olması gerekiyor.
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type tır.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);



    }

}

