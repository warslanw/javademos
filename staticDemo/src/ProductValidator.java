public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı  blok çalıştı");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return  false;
        }

    }
    public void bisey(){

    }
    //inner class (genellikle gruplandırma için kullanılır. yani 1 temel clasımız var bunlarda bölümlendirmek için yapılan classlar)
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}
