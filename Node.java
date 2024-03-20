public class Node<T> {
    public T letter;
    public T freq;
    public Node<T> next;

    public Node(T letterge , T frequencyge){
        this.letter=letterge;
        this.freq=frequencyge;
        this.next=null;
    }
    public String toString(){
        return (String.valueOf(letter)+" "+ String.valueOf(freq));
        
    }
}
