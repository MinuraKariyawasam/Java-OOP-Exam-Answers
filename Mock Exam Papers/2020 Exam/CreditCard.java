public class CreditCard implements Card{

    private int pinNumber;
    private int number;

    public CreditCard(String name, int pinNumber, int number){
        super(name);
        this.pinNumber = pinNumber;
        this.number = number;
    }

    private int getPinNumber(){
        return pinNumber;
    }

    private void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }

    private int getNumber(){
        return number;
    }

    
    private void setNumber(int number){
        this.number = number;
    }

    
}