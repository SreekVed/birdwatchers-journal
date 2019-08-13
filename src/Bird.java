
public class Bird {

    private String name, latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name=name;
        this.latinName=latinName;
    }
    
    public void observe() {
        this.observations++;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    
    public String toString() {
        return this.name+ " (" + this.latinName +  ") : " + this.observations + " observations";
    }
    
}
