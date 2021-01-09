public class Passport implements Card{

    private String birthLocation;
    private int expirationYear;


    public Passport(String name, int pinNumber, int number, int expirationYear, int expirationYear){
        super(name, pinNumber, number, expirationYear);

        this.expirationYear = expirationYear;
    }

}