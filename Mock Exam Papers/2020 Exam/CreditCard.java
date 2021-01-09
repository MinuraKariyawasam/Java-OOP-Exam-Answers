public class CreditCard extends Card{

    private int pinNumber;
    private int number;

    public CreditCard(String n, int pinNumber, int number){
        super(n);
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

    public boolean isExpired(){
        return true;
    }

    public String toString(){
        return "name: " + getName() + " pin number: " + getPinNumber() + " number: " + getNumber(); 
    }

    
}