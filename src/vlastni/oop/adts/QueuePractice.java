package vlastni.oop.adts;

import java.util.Random;

public class QueuePractice {
    public static void main(String[] args) {
        StringQueue queue = new StringQueue();
        queue.enqueue("Test");
        queue.enqueue("Dalsi");
        queue.enqueue("Slovo");
        System.out.println(queue.peek());
        StringQueue roulette = new StringQueue();
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Slavomír");
        queue.enqueue("Mečmír");
        queue.enqueue("Vojta");
        queue.enqueue("Denis");
        String onTurn;
        while(roulette.getSize()>1){
            //ten kdo hraje, jde z fronty ven
            onTurn = roulette.dequeue();
            if (Math.random()>0.16) {
                roulette.enqueue(onTurn);
            }
        }




    }
}
