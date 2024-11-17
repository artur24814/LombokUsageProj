public class Car {
    static int quantity;

    private String model;
    private String mark;
    private String year;
    private double price;
    private String color;


    public Car(String model, String mark, String year, double price, String color, int length) {
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String marka) {
        this.mark = marka;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

