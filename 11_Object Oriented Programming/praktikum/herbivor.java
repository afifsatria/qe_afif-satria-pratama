package section11;

public class herbivor extends hewan{
    String type;

    @Override
    void tampil(){
        System.out.println("\nHi I'm " + this.type + ", My name is " + this.name + ", My Food is " + this.typeFoods + ", I have " + this.teeth + " Teeth" );
    }
}
