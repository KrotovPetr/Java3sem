package Prac10;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Magic, boo!");
    }

    @Override
    public void sit() {
        doMagic();
    }
}
