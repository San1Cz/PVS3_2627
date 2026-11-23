package vlastni.oop.adts;

public class LinkStack implements MyStack{
    @Override
    public void push(String toAdd) {

    }

    @Override
    public String pop() {
        return "";
    }

    @Override
    public String peek() {
        return "";
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
class MyLink{
    String current;
    MyLink next;

    public MyLink(String current){
        this.current = current;
    }

}

