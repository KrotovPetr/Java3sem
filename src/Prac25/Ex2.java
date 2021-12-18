package Prac25;

public class Ex2<E> {
    E array[];
    public Ex2(E e[]){
        array=e;
    }
    public String toString(){
        String result="";
        for(E e : array){
            result+=e.toString()+", ";
        }

        return result;
    }
}