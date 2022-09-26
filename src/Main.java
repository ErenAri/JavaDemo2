public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Ekran Kartı","RTX 4090",25000,27,"");
//        product.setId(1);
//        product.setName("Ekran Kartı");
//        product.setDescription("RTX 4090");
//        product.setPrice(25000);
//        product.setStockAmount(27);
//        product.getKod();

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}