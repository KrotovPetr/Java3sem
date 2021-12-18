package Prac11;
public class ArrayQueueModule {

    private int size;
    private int head;
    private int tail;
    private Object[] elements = new Object[10];

    //pre: element != null
    //post: elements[tail] = element,
    //      tail = (tail + 1) % elements.length,
    //      size = size + 1
    public void enqueue(Object elem) {
        if ((this.size+2 > this.elements.length)&&(elem!=null))
        {
            Object[] newArray = new Object[elements.length * 2];
            int i = 0;
            while (tail!=head)
            {
                newArray[i] = elements[head];
                head = (head + 1) % this.elements.length;
                i++;
            }
            head = 0;
            tail = this.elements.length - 1;
            elements = newArray;

        }
        elements[tail] = elem;
        tail = (tail + 1) % elements.length;
        size++;
    }


    public boolean isEmpty(){
        return (size==0);

    }

    //post: R = size
    public int size(){
        return this.size;
    }
    //post: R = (size == 0)
    public Object element(){
        return elements[head];

    }

    //pre: size > 0
    //post: R = elements[head],
    //      head = (head + 1) % elements.length,
    //      size = size - 1
    public Object dequeue(){
        Object ret = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return ret;
    }
    public void clear(){
        for(int i=0; i< elements.length-1;i++){
            elements[i]=null;
        }
        tail=0;
        head=0;
        size=0;
    }


}









