package main.java;

public class Pen {
    private String brand;
    private String color;
    private int quantity;


    public Pen(String brand, int quantity, String color) {
        this.brand = brand;
        this.quantity = quantity;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Brand: ").append(brand).append("; ")
                .append("Quantity: ").append(quantity).append("; ").append("Color: ").append(color);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (quantity != pen.quantity) return false;
        if ((brand == null && pen.brand != null) || (brand != null && !brand.equals(pen.brand))) {
            return false;
        }
        if (color != null) {
            return color.equals(pen.color);
        } else {
            return pen.color == null;
        }
    }


    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + quantity;
        return result;
    }
}
