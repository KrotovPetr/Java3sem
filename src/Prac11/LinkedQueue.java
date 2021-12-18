package Prac11;

import java.util.ArrayList;

public class LinkedQueue extends abstractQueue1{

    private ArrayList<Integer> queue;
    public LinkedQueue(){
        queue=new ArrayList<Integer>();
        enqueue(2);
        enqueue(5);
        enqueue(7);
        enqueue(6);
        System.out.println(size());
        System.out.println(popfromQueue());
        System.out.println(size());
        System.out.println(isEmpty());
        clear();
        System.out.println(isEmpty());
    }



    @Override
    protected int popfromQueue(){
        if (queue.size()>0){
            int k=queue.get(0);
            queue.remove(0);
            return k;
        }
        else{
            System.out.println("Queue is empty!");
            return 0;
        }
    }

    @Override
    protected void clear() {
        queue.clear();
    }

    @Override
    protected void enqueue(int elem) {
        queue.add(elem);
    }
    @Override
    protected boolean isEmpty(){
        return queue.size()==0;
    }

    @Override
    protected int size() {
        return queue.size();
    }



}
