package Prac11;

public class ArrayQueue {
    protected static int head, tail ,size;
    protected static Object[] elements = new Object[10];

    //pre: element != null
    //post: elements[tail] = element,
    //      tail = (tail + 1) % elements.length,
    //      size = size + 1
    public static void enqueue(Object elem) {
        if ((size+2 >  elements.length)&&(elem!=null))
        {
            Object[] newArray = new Object[elements.length * 2];
            int i = 0;
            while (tail!= head)
            {
                newArray[i] =  elements[head];
                head = (head + 1) %  elements.length;
                i++;
            }
            head = 0;
            tail = elements.length - 1;
            elements = newArray;

        }
        elements[tail] = elem;
        tail = (tail + 1) %  elements.length;
        size++;
    }

    public static boolean isEmpty() {
        return size==0;
    }

    //post: R = size
    public static int size() {
        return size;
    }

    //post: R = (size == 0)
    public static Object element(){
        return  elements[head];

    }

    //pre: size > 0
    //post: R = elements[head],
    //      head = (head + 1) % elements.length,
    //      size = size - 1
    public static Object dequeue(){
        Object ret = element();
        elements[head] = null;
        head = (head + 1) %  elements.length;
        size--;
        return ret;
    }
    public static void clear(){
        for(int i=0; i< elements.length-1;i++){
            elements[i]=null;
        }
        tail=0;
        head=0;
        size=0;
    }

}
