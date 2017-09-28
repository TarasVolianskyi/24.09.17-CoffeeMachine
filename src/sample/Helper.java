package sample;

public class Helper {
    private final String nameOfDrink1 = "Espresso";
    private final String nameOfDrink2 = "Americano";
    private final String nameOfDrink3 = "Americano with milk";
    private final String nameOfDrink4 = "Late";
    private final String nameOfDrink5 = "Cappuchino";
    private final String nameOfDrink6 = "Mokachino";
    private final String nameOfDrink7 = "Latte macchiato";
    private final String nameOfDrink8 = "Ristretto";
    private final String nameOfDrink9 = "Hot chokolate";
    private final String nameOfDrink10 = "Green tea";
    private final String nameOfDrink11 = "Black tea";
    private final String nameOfDrink12 = "Fruit tea";

    private final int priceOfDrink1 = 12;
    private final int priceOfDrink2 = 15;
    private final int priceOfDrink3 = 18;
    private final int priceOfDrink4 = 20;
    private final int priceOfDrink5 = 20;
    private final int priceOfDrink6 = 25;
    private final int priceOfDrink7 = 22;
    private final int priceOfDrink8 = 19;
    private final int priceOfDrink9 = 25;
    private final int priceOfDrink10 = 15;
    private final int priceOfDrink11 = 15;
    private final int priceOfDrink12 = 15;

    private int cashInside;

    public int getCashInside() {
        return cashInside;
    }

    public Helper() {
        this.cashInside = 0;
    }

    public String getNameOfDrink1() {
        return nameOfDrink1;
    }

    public String getNameOfDrink2() {
        return nameOfDrink2;
    }

    public String getNameOfDrink3() {
        return nameOfDrink3;
    }

    public String getNameOfDrink4() {
        return nameOfDrink4;
    }

    public String getNameOfDrink5() {
        return nameOfDrink5;
    }

    public String getNameOfDrink6() {
        return nameOfDrink6;
    }

    public String getNameOfDrink7() {
        return nameOfDrink7;
    }

    public String getNameOfDrink8() {
        return nameOfDrink8;
    }

    public String getNameOfDrink9() {
        return nameOfDrink9;
    }

    public String getNameOfDrink10() {
        return nameOfDrink10;
    }

    public String getNameOfDrink11() {
        return nameOfDrink11;
    }

    public String getNameOfDrink12() {
        return nameOfDrink12;
    }

    public int getPriceOfDrink1() {
        return priceOfDrink1;
    }

    public int getPriceOfDrink2() {
        return priceOfDrink2;
    }

    public int getPriceOfDrink3() {
        return priceOfDrink3;
    }

    public int getPriceOfDrink4() {
        return priceOfDrink4;
    }

    public int getPriceOfDrink5() {
        return priceOfDrink5;
    }

    public int getPriceOfDrink6() {
        return priceOfDrink6;
    }

    public int getPriceOfDrink7() {
        return priceOfDrink7;
    }

    public int getPriceOfDrink8() {
        return priceOfDrink8;
    }

    public int getPriceOfDrink9() {
        return priceOfDrink9;
    }

    public int getPriceOfDrink10() {
        return priceOfDrink10;
    }

    public int getPriceOfDrink11() {
        return priceOfDrink11;
    }

    public int getPriceOfDrink12() {
        return priceOfDrink12;
    }

    public int putMoney (int value){
        cashInside+= value;
        return cashInside;
    }

    public int makeCoffee(int price){
        cashInside-=price;
        return cashInside;
    }
}
