public class ProductManager {
    public void Add(Product product){
        System.out.println("Ürün Eklendi=> "+ product.getDescription());
        System.out.println("Güncel Stok=> "+product.getStockAmount());
        System.out.println("Ürün Kodu=> "+product.getKod());
    }

}
