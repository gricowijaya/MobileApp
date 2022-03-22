package id.gricowijaya.latihan3.model;

public class CountModel {
    private int number = 0;

    public void addition() {
        this.number++;
    }

    public void subtraction() {
        this.number--;

        if (this.number < 0) {
            setNumber(0);
        }
    }

    public void reset() {
        setNumber(0);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}