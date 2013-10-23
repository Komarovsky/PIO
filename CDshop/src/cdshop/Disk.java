package cdshop;

public class Disk {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
     public String toString(){
        String nl = System.getProperty("line.separator");
        return getClass().getSimpleName() + nl + " Title : " + this.title + nl + " Price : " + this.price;
  }
    
}
