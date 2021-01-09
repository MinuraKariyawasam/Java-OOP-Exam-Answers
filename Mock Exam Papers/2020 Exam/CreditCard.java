public class CreditCard implements Card{

    private int pinNumber;
    private int number;

    public CreditCard(String name, int pinNumber, int number){
        super(name);
        this.pinNumber = pinNumber;
        this.number = number;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }

    public int getNumber(){
        return number;
    }

    
    public void setNumber(int number){
        this.number = number;
    }

    
}