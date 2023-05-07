package src;

class EkClass{
    int a;
    public int getA(){
        return a;
    }

    EkClass(){
        System.out.println("hehe lol constructor");
    }

    EkClass(int a){
        this.a = a;
    }

    public int returnone(){
        return 1;
    }

}
class Doclass extends EkClass{
    Doclass(int c){
        super(c);
        System.out.println("Mai ek constructor huu");
    }
}


public class this_and_superkeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        System.out.println(e.getA());
        Doclass d = new Doclass(5);


    }
}
