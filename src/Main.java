public class Main {
    public static void main(String[] args) {

        //OOP intro with an example
        //Hepsiburada Uygulama
        ProductManager productManager=new ProductManager();
        Product product1=new Product(1,"Lenovo V14",15000,"16 GB Ram"); //referans olusturma, instance
        productManager.addToCart(product1);

        Product product2=new Product();
        product2.id=2;
        product2.name="Lenovo V15";
        product2.unitPrice=16000;
        product2.detail="32 Gb Ram";
        productManager.addToCart(product2);

        Product product3=new Product();
        product3.id=3;
        product3.name="Hp 5";
        product3.unitPrice=10000;
        product3.detail="8 Gb Ram";
        productManager.addToCart(product3);

        // olusturdugumuz ürünü diziye ekliyoruz
        Product[] products={
                product1,
                product2,
                product3
        };
        //normally we use getProduct method after =,
        for(Product product:products){
            System.out.println(product.name);
            System.out.println(product.unitPrice);
            System.out.println(product.detail);
        }



        System.out.println(products.length);
        Category category1=new Category();
        category1.id=1;
        category1.name="Computer";

        Category category2=new Category();
        category1.id=2;
        category2.name="Home/Garden";



    }
}
