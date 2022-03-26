import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     A3.3
 * 
 *  Description:    Use the Node class created in A3.0 and a new
 *                  Queue class created for this assignment to demonstrate
 *                  the basic functions of a Queue data type
 * 
 *************************************************************/

public class Main {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        BufferedReader fin = null;      // buffered reader
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // **** Project Variables
        
        Node node;                  // Node pointer
        Node temp;               // another Node pointer
        
        Queue q = new Queue();  // create the stack
        boolean isFirst = false;    // used to identify the first node created
        
        int pl = 0;                 // Node payload
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        try{
            fin = new BufferedReader(new FileReader("A3NodeData.txt"));
        }// end try
        catch(FileNotFoundException d){
            System.out.println("file not found");
        }// end catch
        
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Programmer" + nl;
        banner += "Class:       CS40S" + nl;
        banner += "Assignment:  A3.3" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        node = q.dequeue();
        System.out.println("no nodes have been created. " + node);       // should print null
        System.out.println("Queue is empty: " + q.isEmpty());   // true
        
        q.enqueue(new Node(123));
        System.out.println("Queue is empty: " + q.isEmpty());   // false
        System.out.println("Who's next?: " + q.peek());   // false
        
        node = null;
        node = q.dequeue();
        System.out.println(node.getPayLoad());      // prints 123
        System.out.println("Queue is empty: " + q.isEmpty());   // true
        
        System.out.println("------------------------------------" + nl);
    
        strin = fin.readLine();
        
        while(strin != null){
            //System.out.println(strin);
            
            q.enqueue(new Node(Integer.parseInt(strin)));
            
            strin = fin.readLine();
        }// end eof

    // ***** Main Processing *****
    
        System.out.println(q.peek().getPayLoad());  // print 4
        
        // can you predict what the output of the following loop will be?
        while(!q.isEmpty()){
            node = q.dequeue();
            System.out.println(node.getPayLoad());
        }// end while
        
        System.out.println("now the stack is empty " + q.peek());
        
        
   
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
