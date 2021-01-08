import java.util.Random;

public class VotingMachine{

  private int labour;
  private int conservation;

  // creating random methods
  Random random = new Random();

  public int getLabour(){
    return labour;
  }

  public void setLabour(){
    labour = random.nextInt(5);
    this.labour = labour;
  }

  public int getConservation(){
    return conservation;
  }

  public void setConservation(){
    conservation = random.nextInt(5);
    this.conservation = conservation;
  }

  public void clearMachineState(){
    this.labour = 0;
    this.conservation = 0;
  }

}
