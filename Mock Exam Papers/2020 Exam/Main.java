import java.util.*;
public class Main{



    public static void main(String args[]){

        // Question 01
        // VotingMachine vote = new VotingMachine();
        // // set random vote for labour party
        // vote.setLabour();
        // System.out.println("Labour vote:" + vote.getLabour());

        // // set random for conservation party
        // vote.setConservation();
        // System.out.println("Labour vote:" + vote.getConservation());


        // // Question 02
        // List<CreditCard> creditCardList = new ArrayList<CreditCard>();

        // // adding credit card object to list 
        // creditCardList.add(new CreditCard("Minura", 1234, 1));
        // creditCardList.add(new CreditCard("Banaka", 1235, 2));
        // creditCardList.add(new CreditCard("John", 1236, 3));
        // creditCardList.add(new CreditCard("Ves", 1237, 4));
        // creditCardList.add(new CreditCard("kevin", 1238, 5));


        // // printing the list
        // for (CreditCard c: creditCardList)
        //     System.out.println(c);


        // Question 06

        Thread1 t1 = new Thread1();

        t1.run();
                
        Thread2 t2 = new Thread2();
        
        t2.run();





    }
}