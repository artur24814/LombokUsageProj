package utils;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CarWithLombok {
    private String model;
    private String mark;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public void sell() {
        this.quantity = this.quantity - 1;
    }

    public void delivery() {
        this.quantity = this.quantity + 1;
    }
}
