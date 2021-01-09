public class Passport extends Card{

    private String birthLocation;
    private int expirationYear;


    public Passport(String name, int pinNumber, int number, int expirationYear, 
    int expirationYear, String birthLocation){
        super(name, pinNumber, number, expirationYear);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

}