public class DriverLicense implements Card{

    private int expirationYear;

    public expirationYear(String name, int pinNumber, int number, int expirationYear){
        super(name, pinNumber, number);

        this.expirationYear = expirationYear;
    }

    public int getExpirationYear(){
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear){
        this.expirationYear = expirationYear;
    }

}