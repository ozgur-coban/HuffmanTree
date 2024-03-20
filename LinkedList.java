public class LinkedList<T extends Comparable> {
    private TNode<T> head;
    






    public TNode<T> createTNode(T let , int freq){
        return new TNode<T>(let, freq);
    }





    public void sortedInsert(T let , int freq){
        TNode<T> newNode=createTNode(let,freq);
        if(head==null)
            head=newNode;
        else if (newNode.frequency<=head.frequency){
            newNode.next=head;
            head=newNode;
        }else{
            TNode<T> iterator=head;
            while(iterator.next!=null && iterator.next.frequency<freq){
                iterator=iterator.next;
            }
            newNode.next=iterator.next;
            iterator.next=newNode;
            
        }
    }

        public void sortedInsert(TNode<T> Node){
        TNode<T> newNode=Node;
        if(head==null)
            head=newNode;
        else if (newNode.frequency<=head.frequency){
            newNode.next=head;
            head=newNode;
        }else{
            TNode<T> iterator=head;
            while(iterator.next!=null && iterator.next.frequency<Node.frequency){
                iterator=iterator.next;
            }
            newNode.next=iterator.next;
            iterator.next=newNode;
            
        }
    }

    public TNode<T> delete(){//removes the first element (lowest freq) and returns it
        TNode<T> oldHead=head;
        if(head.next==null){
            head=null;
            return oldHead;
        }
        
        head=head.next;
        return oldHead;
    }



    public int count(){// count the number of elements in the linkedlist
        int count = 0;
        TNode<T> iterator = head;
        while (iterator!=null){
            count++;
            iterator=iterator.next;
        }
        return count;
    
        }













    public void display(){
        
        TNode<T> iterator=head;
        while(iterator!=null){
            System.out.println(iterator);
            iterator=iterator.next;
            
        }
        

        

    }








}
