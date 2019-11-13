package pl.sda.javastart.day13;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.BigDecimal.valueOf;

public class CartProduct {
    private Product product;
    private Cart cart;
    private BigDecimal price;
    private Integer quantity;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartProduct that = (CartProduct) o;
        return Objects.equals(product, that.product);

    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    public String viewProduct() {
        return new StringBuilder()
                .append(product.getName())
                .append(" | cena: ")
                .append(this.price)
                .append(" | ilość: ")
                .append(this.quantity)
                .append(" | wartość: ")
                .append(this.price.multiply(valueOf(quantity)))
                .toString();
    }
}
