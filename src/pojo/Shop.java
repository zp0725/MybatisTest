package pojo;

import java.util.List;

public class Shop {
    private int sno;
    private String sname;
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", products=" + products +
                '}';
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}
