public class TNode <T extends Comparable>{
    public int frequency;
    public T ch;
    public TNode<T> left ;
    public TNode<T> right ;
    public TNode<T> next ;


    public TNode(T chge , int frequencyge){  
        this.frequency=frequencyge;
        this.ch=chge;
        this.left=null;
        this.right=null;
        this.next=null;
    }


    public String toString(){
        return (String.valueOf(ch)+" "+String.valueOf(frequency));
    }

}
