package oop.adts;

public class StringQueue {
        QueueLink first,last;
        void enqueue(String toAdd){
            QueueLink link = new QueueLink();
            link.data = toAdd;
            if (first == null){ //1.fronta je prazdna
                first = link;
                last = link;
            }
            else { //2. ve fronte nekdo je
                last.next = link;
                last = link;
            }
        }
        String dequeue(){
            if(first == null){
                return null;
            }
            String toReturn = first.data;
            first = first.next;
            return toReturn;

        }

}
class QueueLink{
    String data;
    QueueLink next;

}
