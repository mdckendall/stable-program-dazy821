//Create the Stable class here.
import java.util.ArrayList;

public class Stable{

  String address;
  char decision;
  ArrayList<Horse> al= new ArrayList<Horse>();

    public Stable(String address, char decision){

      this.address= address;
      this.decision= decision;
    }
  public Stable(){}

  public void show(){
    for(int i =0 ; i < al.size(); i++){

   System.out.println("Horse #" + (i+1) + " Name: " +al.get(i).name+ " Weight: " + al.get(i).weight + " Tame: " +al.get(i).tame);

      
    }
 
    
  }
  
}