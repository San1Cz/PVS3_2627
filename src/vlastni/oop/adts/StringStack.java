package vlastni.oop.adts;

public class StringStack {
    String[]data;
    // nekdy známe jako 'top'
    int freeIndex;
    private static final int BASE_SIZE = 10;

    StringStack(int capacity){

        if (capacity<BASE_SIZE){
            capacity = BASE_SIZE;
        }
        data = new String[capacity];
        freeIndex = 0;
    }
    void push(String toAdd){
        if (freeIndex == data.length){
            expandArray();
        }
        data[freeIndex] = toAdd;
        freeIndex++;
    }
    String pop(){
        if (freeIndex == 0) {
            return null;
        }
        else {
            freeIndex--;
            return data[freeIndex];
        }


    }
    String peek() {

        return data[freeIndex - 1];
    }
    private void expandArray(){
        String[] newPole = new String[(int)(data.length *2)];
        for (int i = 0; i < data.length; i++) {
            newPole[i] = data[i];
        }
        data = newPole;
    }

    public static void main(String[] args) {
        StringStack test = new StringStack(5);
        System.out.println(test.pop());
        StringStack studenti = new StringStack(5);
        studenti.push("Honza A");
        studenti.push("Honza B");
        studenti.push("Honza C");
        studenti.push("Honza D");
    }
}
