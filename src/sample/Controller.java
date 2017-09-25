package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {

    public Label lbRes;
    Helper myHelper = new Helper();
    String nameOfDrink;
    private int priceOfDrink;
    private int summOfPuttingCash;
    private int change = getSummOfPuttingCash() - getPriceOfDrink();

    public int getChange() {
        return change;
    }

    public String getNameOfDrink() {
        return nameOfDrink;
    }

    public void setNameOfDrink(String nameOfDrink) {
        this.nameOfDrink = nameOfDrink;
    }

    public int getPriceOfDrink() {
        return priceOfDrink;
    }

    public void setPriceOfDrink(int priceOfDrink) {
        this.priceOfDrink = priceOfDrink;
    }

    public int getSummOfPuttingCash() {
        return summOfPuttingCash;
    }

    public void setSummOfPuttingCash(int summOfPuttingCash) {
        this.summOfPuttingCash = summOfPuttingCash;
    }

    public void getStart(ActionEvent actionEvent) {
        System.out.println(getChange());
        if (summOfPuttingCash < priceOfDrink) {
            lbRes.setText("Your choice is - " + nameOfDrink + ", price is - " + priceOfDrink + " UAH  \n" + "Please, put more");
        } else {
            lbRes.setText("Your choice is - " + nameOfDrink + ", price is - " + priceOfDrink + " UAH  \n" + "Enjoy your drink\nYour cahnge is:" + change + " UAH.");
        }
    }


    public void addDrink1(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink1();
        String nameOfChoice = myHelper.getNameOfDrink1();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink2(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink2();
        String nameOfChoice = myHelper.getNameOfDrink2();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink3(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink3();
        String nameOfChoice = myHelper.getNameOfDrink3();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink4(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink4();
        String nameOfChoice = myHelper.getNameOfDrink4();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink5(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink5();
        String nameOfChoice = myHelper.getNameOfDrink5();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink6(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink6();
        String nameOfChoice = myHelper.getNameOfDrink6();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink7(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink7();
        String nameOfChoice = myHelper.getNameOfDrink7();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink8(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink8();
        String nameOfChoice = myHelper.getNameOfDrink8();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink9(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink9();
        String nameOfChoice = myHelper.getNameOfDrink9();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink10(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink10();
        String nameOfChoice = myHelper.getNameOfDrink10();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink11(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink11();
        String nameOfChoice = myHelper.getNameOfDrink11();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void addDrink12(ActionEvent actionEvent) {
        int priceOfChoice = myHelper.getPriceOfDrink12();
        String nameOfChoice = myHelper.getNameOfDrink12();
        setPriceOfDrink(priceOfChoice);
        setNameOfDrink(nameOfChoice);
    }

    public void puttCash1(ActionEvent actionEvent) {
        setSummOfPuttingCash(1);
    }

    public void puttCash2(ActionEvent actionEvent) {
        setSummOfPuttingCash(2);
    }

    public void puttCash5(ActionEvent actionEvent) {
        setSummOfPuttingCash(5);
    }

    public void puttCash10(ActionEvent actionEvent) {
        setSummOfPuttingCash(10);
    }

    public void puttCash20(ActionEvent actionEvent) {
        setSummOfPuttingCash(20);
    }

    public void puttCash50(ActionEvent actionEvent) {
        setSummOfPuttingCash(50);
    }

}
