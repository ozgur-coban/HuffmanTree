import java.io.File;

import java.util.Scanner;

public class main<T extends Comparable> {
















    public static void main(String[] args) throws Exception {
        LinkedList List1=new LinkedList<>();
        Huffman Tree1=new Huffman<>();
        








        File file=new File("letter.txt");
        Scanner sc=new Scanner(file);
        
        String str ="";
        while(sc.hasNext()){
            


            str = sc.next();
            

        }
        












        
        int[] freq = new int[str.length()];  
        int i, j;  
        
        
        char string[] = str.toCharArray();  
        
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                    
                    
                    string[j] = '0';  
                }  
            }  
        }  
        
        
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0'){  
                
                List1.sortedInsert(string[i], freq[i]);
                
                
                
                
                



            
            }
        
        
        
        }
        

        

        List1.display();
        Tree1.createHuffmanTree(List1);

        System.out.println(Tree1.encode("CBBA"));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
    















    }
}


