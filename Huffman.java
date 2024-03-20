public class Huffman <T extends Comparable>{
    
    private TNode<T> root;
    
    public TNode<T> createNode(T let , int freq ){
        return new TNode<T>(let, freq);
    }




    public void createHuffmanTree(LinkedList List){
        
        while(List.count()>1){
            TNode<T> Node1=List.delete();
            TNode<T> Node2=List.delete();
            TNode<T> newNode=createNode(null, (Node1.frequency+Node2.frequency));
            newNode.left=Node1;
            newNode.right=Node2;
            root=newNode;
            
        
            List.sortedInsert(newNode);
        }
        
        

    }
















    // public void printCode(){
    //     printCode(root, "");
    // }

    // private  String printCode(TNode<T> root, String Code) 
    // { 

        
    //     if (root.left == null && root.right == null) 
    //         { 

            
    //         System.out.println(root.ch + " " + Code); 

    //         return Code ; 
    //     } 

        
    //     printCode(root.left, Code + "0"); 
    //     printCode(root.right, Code + "1"); 
        
    //     return "";
    // } 


    public void test(){

        TNode<T> iterator = root;
        TNode<T> iterator2 = root;
        while (iterator!=null){
            System.out.println(iterator);
            iterator=iterator.left;
        }
        while(iterator2!=null){
            System.out.println(iterator2);
            iterator2=iterator2.right;
        }
    
    }




    public void testforcode(){
        //System.out.println(printCode2(root, "",""));
        System.out.println(printCode2());
    }



    public String printCode2() {
        System.out.println("--------");
        String encoded = printCode2(root, "", "");
        System.out.println("--------");
        return encoded;
    }

    public String printCode2(TNode<T> root, String s, String encoded) {
        ////////////////// base case; if the left and right are null 
        /////////////// then its a leaf node and we print 
        /////////////////// the code s generated by traversing the tree.
        if (root.left == null && root.right == null) { 
            ////////////// c is the character in the node 
            System.out.println(root.ch + ":" + s); 
            return s; 
        } 

        /////////////////// if we go to left then add "0" to the code. 
        ////////////////// if we go to the right add"1" to the code. 

        ///////////////////// recursive calls for left and 
        //////////////////// right sub-tree of the generated tree.
        if(root.left.ch!=null)
        encoded=encoded+ printCode2(root.left, s + "0", "").repeat(root.left.frequency);
        else
        encoded=encoded+ printCode2(root.left, s + "0", "");
        if(root.right.ch!=null) 
        encoded=encoded+ printCode2(root.right, s + "1", "").repeat(root.right.frequency);
        else
        encoded=encoded+ printCode2(root.right, s + "1", "");
        //System.out.println(encoded);
        return encoded;
    }








    public  String decode(String encodedText) {
        String sb = "";
        TNode<T> node = root;
        for (int i = 0; i < encodedText.length(); i++) {
            char c = encodedText.charAt(i);
            if (c == '0') {
                node = node.left;
            } else {
                node = node.right;
            }
            if (node.left == null && node.right == null) {
                sb += node.ch;
                node = root;
            }
        }
        return sb;
    }

    public void preOrder(){
        preOrder(root);
    }
    public String preOrder(TNode<T> root ){ // bu rootlar currentroot tabiki
        String s="";
        if(root!=null){
            //System.out.println(root);
            preOrder(root.left);
            s=s+"0";
            
            preOrder(root.right);
            s=s+"1";
            
        }
        return s;
        
    }

    public String encode(String text ){
        String sb="";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            while(root!=null){
                sb=preOrder(root);
            }





        }
        return sb;
        
        
        

    }

    // public  String encode(String text, TNode<T> root) {
    //     String sb = "";
    //     for (int i = 0; i < text.length(); i++) {
    //         char c = text.charAt(i);
    //         TNode<T> node = root;
    //         while (node.left != null && node.right != null) {
    //             if (node.ch.charAt(0) == c) {
    //                 sb += "0";
    //                 break;
    //             } else if (node.left.value.charAt(0) == c) {
    //                 sb += "0";
    //                 node = node.left;
    //             } else {
    //                 sb += "1";
    //                 node = node.right;
    //             }
    //         }
    //     }
    //     return sb;
    // }



    // public void inOrder(){
    //     inOrder(root);
    // }
    // public void inOrder(TNode<T> root){ // bu rootlar currentroot tabiki
    //     if(root!=null){
    //         inOrder(root.left);
    //         System.out.println(root);
    //         inOrder(root.right);
    //     }
    // }


    //     public boolean testforb(int number){
    //         int s = 0;
    //         TNode<T> Iterator=root;
    //         while(Iterator!=null && Iterator.isLeaf()!=true){
    //         if(s==0){
    //             Iterator=Iterator.left;
    //         }
    //         if(s==1){
    //             Iterator=Iterator.right;
    //         }
    //     }
    //     if(Iterator.isLeaf()==true){
    //         Iterator=root;
    //     }
    //     else{
    //         return false;
    //     }
    // }




}


