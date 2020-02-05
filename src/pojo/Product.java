package pojo;

public class Product {
    private int pno;
    private String pname;
    private int sno;

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", sno=" + sno +
                '}';
    }
}
