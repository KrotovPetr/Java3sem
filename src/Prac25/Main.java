package Prac25;

import java.io.File;
import java.util.ArrayList;

class Ex1<E>{
    public void convert(E e[]){
        ArrayList<E> list = new ArrayList<>();
        for (E gor: e){
            list.add(gor);
        }
        System.out.println(list);
    }
}

class Ex3<E>{
    E array[];
    Ex3(E e[]){
        array=e;
    }
    public E getElementbyIndex(int i){
        return array[i];
    }
}



public class Main {



    private static ArrayList<String> dE = new ArrayList<>();
    public static void Catalog(File file){
        if(file.isDirectory()){
            for(String e : file.list()){
                dE.add(e);
            }
            for (int i=0;i<5;i++){
                System.out.print(dE.get(i)+" ");
            }
        }else{
            System.out.println("Error!");
        }
    }

    public static void main(String[] args){
        Ex1<String> n1 = new Ex1();
        String[] arr={"one", "two"};
        n1.convert(arr);

        Integer arr2[]={1,2,3};
        Ex2<Integer> n2 = new Ex2<Integer>(arr2);
        System.out.println(n2.toString());

        Integer arr3[]={4,5,6};
        Ex3<Integer> n3 = new Ex3<Integer>(arr3);
        System.out.println(n3.getElementbyIndex(1));

        Catalog(new File("C:\\"));
    }
}