package vlastni.oop.adts;

public class StringStack {
    String[]data;
    // nekdy známe jako 'top'
    int freeIndex;
    StringStack(){
        data = new String[5];
        freeIndex = 0;
    }
    void push(String toAdd){
        data[freeIndex] = toAdd;
        freeIndex++;
    }
    String pop(){
        freeIndex--;
        return data[freeIndex];

    }
    String peek(){
        return data[freeIndex-1];
    }

    public static void main(String[] args) {
        StringStack test = new StringStack();
        test.push("Test");
        test.push("world");
    }
}
