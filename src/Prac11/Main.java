package Prac11;

//инвариант класса
//Инвариант в математике - это выражение которое сохраняет свое значение. В программировании инвариантом также называют предикат который всегда истинный.
//Таким образом, инвариант объекта в ООП - это либо (чаще) условие которое остается истинным после вызова любых методов объекта в любой последовательности, либо (реже) выражение которое сохраняет свое значение после вызова любых методов.
//В коде инварианты чаще всего никак не выражены, но иногда ставятся защитные проверки которые их проверяют.


//инкапсуляция
//Инкапсуляция в Java– это принцип объединения данных (переменных) и кода в единое целое. Это одна из четырех концепций ООП. Другие три – это Наследование, Полиморфизм и Абстракция.

//Интерфейсы

//Контрактное программирование (design by contract (DbC), programming by contract, contract-based programming) —
// это метод проектирования программного обеспечения. Он предполагает, что проектировщик должен определить формальные,
// точные и верифицируемые спецификации интерфейсов для компонентов системы. При этом, кроме обычного определения абстрактных типов данных,
// также используются предусловия, постусловия и инварианты. Данные спецификации называются «контрактами» в соответствии с концептуальной метафорой условий и ответственности в гражданско-правовых договорах.
//✔Интерфейс как синтаксический контракт
//Интерфейс представляет синтаксический контракт, которому должны следовать реализующие этот интерфейс классы.
// То есть, если класс-интерфейс определяет какие-нибудь поля и методы, то класс, реализующий данный интерфейс, должен также определить эти поля и методы.

//✔Интерфейс как семантический контракт

//?????????

//Абстрактные базовые классы и наследование
//✔Устранение дублирования
//✔Вынос изменяемой логики в наследников
//Наследование — это механизм в программировании, в том числе и в Java, который позволяет описать новый класс на основе уже существующего. Класс-наследник при этом получает доступ к полям и методам родительского класса.

public class Main {
    public static void main(String[] args){
        ArrayQueueModule a = new ArrayQueueModule();
        Object[] array = new Object[10];
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        for(int i=0;i<array.length;i++){
            a.enqueue(array[i]);  // 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println(a.element());// 0
        a.enqueue(a.dequeue());//0 - в конец
        System.out.println(a.element());//1
        System.out.println(a.size());//10
        System.out.println(a.isEmpty());//false
        a.clear();
        System.out.println(a.isEmpty());
        System.out.println("\n\n");

        ArrayQueueADT b = new ArrayQueueADT();

        for(int i=0;i<array.length;i++){
            ArrayQueue.enqueue(array[i]);  // 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println(ArrayQueue.element());// 0
        ArrayQueue.enqueue(ArrayQueue.dequeue());//0 - в конец
        System.out.println(ArrayQueue.element());//1
        System.out.println(ArrayQueue.size());//10
        System.out.println(ArrayQueue.isEmpty());//false
        ArrayQueue.clear();
        System.out.println(ArrayQueue.isEmpty());
        System.out.println("\n\n");


        LinkedQueue c = new LinkedQueue();
    }
}