package Source;

public class Climber extends Mechanism implements Loggable{
    
    public Climber(){
        super("Climber");
    }

    @Override
    public void setPosition(double position){
        if(position<=180 && position>=0){
            this.position=position;
        }else{
            System.out.println("You should enter an angle between 0 and 180. ");
        }
        updatePosition(position);
    }
    
    public void extend(){
        this.position=180;
    }

    public void retract(){
        this.position=0;
    }
    
    @Override
    public void printStatus(){
        updatePosition(position);
    }


}
