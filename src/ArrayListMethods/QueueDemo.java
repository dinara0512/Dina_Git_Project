package ArrayListMethods;

import java.util.*;

public class QueueDemo {
    public static void main (String [] args){
        Queue <Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        Queue <Integer> arrayDequeue = new ArrayDeque<>();
        arrayDequeue.addAll(Arrays.asList(10,200,300,40,90));

        Queue <Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDeque = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);
        System.out.println("================");
        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDeque = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        priorityQueue.poll();
        arrayDequeue.poll();
        linkedList.poll();
        System.out.println("========2nd round========");
        System.out.println("priorityQueue = " + priorityQueue);
        System.out.println("arrayDeque = " + arrayDequeue);
        System.out.println("linkedList = " + linkedList);

        System.out.println("================");
        System.out.println( ((LinkedList<Integer>) linkedList).get(2));


    }
}
