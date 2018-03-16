package com.company;


public class Main {

    public static void main(String[] args) {
        testFruits();
    }

    private static void testFruits() {
        Fruit[] fruits = new Fruit[4];

        Fruit lemon = new Fruit();

        lemon.setType(Fruit.TYPE_LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setPricePerKg(36.99);
        lemon.setWeight(0.096);
        lemon.setDateOfManufacture("14/03/2018");
        lemon.setShelfLife(10);

        fruits[0] = lemon;

        Fruit banana = new Fruit();
        banana.setType(Fruit.TYPE_BANANA);
        banana.setColor(Color.YELLOW);
        banana.setPricePerKg(37.99);
        banana.setWeight(0.206);
        banana.setDateOfManufacture("7/03/2018");
        banana.setShelfLife(8);

        fruits[1] = banana;

        Fruit redApple = new Fruit();
        redApple.setType(Fruit.TYPE_APPLE);
        redApple.setColor(Color.RED);
        redApple.setPricePerKg(28.99);
        redApple.setWeight(0.206);
        redApple.setDateOfManufacture("9/03/2018");
        redApple.setShelfLife(12);

        fruits[2] = redApple;

        Fruit greenApple = new Fruit();
        greenApple.setType(Fruit.TYPE_APPLE);
        greenApple.setColor(Color.GREEN);
        greenApple.setPricePerKg(20.99);
        greenApple.setWeight(0.184);
        greenApple.setDateOfManufacture("4/03/2018");
        greenApple.setShelfLife(11);

        fruits[3] = greenApple;


        double sum = getSum(fruits);
        String sumFormat = String.format("%.2f", sum);
        System.out.println("Sum: " + sumFormat + " grn.");
        System.out.println();

        Fruit.printFreshness(fruits);

    }

    private static double getSum(Fruit[] fruits) {
        double result = 0;

        for (int i = 0; i < fruits.length; i++) {
            result += fruits[i].getPrice();
            String resultFormat = String.format("%.2f", result);
            System.out.println("Fruit[" + (i + 1) + "], price: " + resultFormat + " grn.");

        }

        return result;
    }

}





