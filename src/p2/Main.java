package p2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Collection
        //AbstractCollection
        //Queue
        //Deque
        //Lis
        //Set
        //Map

        //ArrayList
       // LinkedList
        //ArrayDeque
        //PriorityQueue
        //HashSet
        //TreeSet
       //HashMap
       //TreeMap
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Masha");
        list.add(1,"Igor");

        for (String item: list){
        System.out.println(item);
        }
        System.out.println("--------------");



        System.out.println(list.get(1));
        System.out.println(list.size());//количуство элементов

        Object[]masList = list.toArray();//массив
        for(Object item:masList){
            System.out.print(item + " ");
        }
        System.out.println();// просто перевод строки

        list.remove("Ivan");//удалить ивана
        if (list.contains("Ivan")){//содержит ли что либо
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(list.size());
        list.remove(0);//удал элем
        System.out.println(list.size());





        ArrayList<String> list1 = new ArrayList<>(list);

        ArrayList<String> test = new ArrayList<>(100);// колич элем(это капестия)
        test.ensureCapacity(150);// метод капэстия


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ivan");
        linkedList.addFirst("Alex");// в начало списка
        linkedList.addLast("Masha");
        linkedList.add(1, "Nick");// добавление по индексу


        for(String item: linkedList){
            System.out.println(item);
        }

    }

}
