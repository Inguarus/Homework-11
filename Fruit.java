package com.company;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fruit {


    public static final int TYPE_APPLE = 1;
    public static final int TYPE_LEMON = 2;
    public static final int TYPE_BANANA = 3;

    private int type;
    private Color color;
    private double weight;
    private double pricePerKg;
    private String dateOfManufacture;
    private int shelfLife;


    public void setType(int type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }


    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                ", dateOfManufacture=" + dateOfManufacture +
                ", shelfLife=" + shelfLife +
                '}';
    }

    public double getPrice() {
        return weight * pricePerKg;
    }

    private static boolean isFruitFresh(String dateOfManufacture, int shelfLife) throws Exception {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateFruit = simpleDateFormat.parse(dateOfManufacture);
        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        Calendar calendarFruit = Calendar.getInstance();
        calendarFruit.setTime(dateFruit);
        calendarFruit.add(Calendar.DAY_OF_MONTH, shelfLife);
        if (calendarFruit.before(calendarToday)) {
            return false;
        } else {
            return true;
        }
    }

    public static void printFreshness(Fruit[] fruits) {
        try {
            for (int i = 0; i < fruits.length; i++) {
                if (isFruitFresh(fruits[i].dateOfManufacture, fruits[i].shelfLife)) {
                    System.out.println("Fruit[" + (i + 1) + "] is fresh");
                } else {
                    System.out.println("Fruit[" + (i + 1) + "] is not fresh");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




