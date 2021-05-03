public class Main {
    public static void main(String[] args) {

        //OOP intro with an example
        //Hepsiburada Uygulama

        Product product1=new Product(); //referans olusturma, instance
        product1.id=1;
        product1.name="Lenovo V14";
        product1.unitPrice=15000;
        product1.detail="16 Gb Ram";

        Product product2=new Product();
        product2.id=2;
        product2.name="Lenovo V15";
        product2.unitPrice=16000;
        product2.detail="32 Gb Ram";

        Product product3=new Product();
        product3.id=3;
        product3.name="Hp 5";
        product3.unitPrice=10000;
        product3.detail="8 Gb Ram";

        // olusturdugumuz ürünü diziye ekliyoruz
        Product[] products={
                product1,
                product2,
                product3
        };

        for(Product product:products){
            System.out.println(product.name);
            System.out.println(product.unitPrice);
            System.out.println(product.detail);
        }

        //normally we use getProduct method after =,

        System.out.println(products.length);



    }
}
