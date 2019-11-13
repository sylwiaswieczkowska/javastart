package pl.sda.javastart.day13;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private BigDecimal price;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String view(){
        return id + " " + name + ": " + price;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
