package Source;

public class Climber extends Mechanism{
    private static double maxExtension=90;
    private static double minExtension=0;

    //adding a comment here 
    public Climber() {
        super("Climber");
    }

    @Override    
    public void setPosition(double position){
        if(position<=90 && position>=0){
            this.position=position;
        }else{
            System.out.println("Enter an extension between 0 and 90");
        }
    }
    
    public void extend(){
        setPosition(Climber.maxExtension);
    }
    public void restract(){
        setPosition(Climber.minExtension);
    }


}
