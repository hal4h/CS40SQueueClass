/* **********************************************************
 * Programmer:    Halah Mhanni
 * Class:        CS40S
 * 
 * Assignment:    A3
1 constructor: sets front/head and back/tail Nodes to null

dequeue() method returns front Node and removes it from the queue as long as the queue is not empty.

enqueue() method takes a Node as an argument and adds it to the tail of the queue

peek() method returns front node but does not return it as long as the queue is not empty.
*************************************************************
 */

 public class Queue{  // begin class

     // ********** instance variable **********
      private Node front;
      private Node back;
   
        // ********** constructors ***********
    /*****************************************************
    * Description: constructors
    *
    * Interface:
    * ***************************************************/ 
    public Queue(){
        this.front = null;
        this.back = null;
    }// end node 

        // ********** getters ***********
    /*****************************************************
    * Description: enqueue() method
    *
    * Interface:
    *
    * @param : n : Node, 
    * ***************************************************/  
  public void enqueue(Node n){
   if(isEmpty()){
            back = n;
            front = n;
        } else {
            back.setNext(n);
            back = n;
        } // end enqueue cases
  }// end enqueue

/*****************************************************
    * Description: dequeue() method
    *
    * Interface:
    *
    * @param : n : Node, 
    * ***************************************************/  
  public Node dequeue(){
    Node temp = null;
    if(!isEmpty()){
        temp = front;
        front = front.getNext();
      // temp = temp.getNext();  
      if(front== null){
        back = null; }
      }// end if
    else{
      temp = front;
        }// end else
    return temp;
    }// end if


/*****************************************************
    * Description: peek() method
    *
    * Interface:  returns front node but does not return it as long as the queue is not empty.
    *
    * @return : empty : bool, 
    * ***************************************************/  
  public Node peek(){
    if(isEmpty()){
    return null;
      }
   else{
     //front = front.getNext();
     return front;
     }
  }//end peek
   /*****************************************************
    * Description: isEmpty() method
    *
    * Interface:
    *
    * @return : empty : bool, 
    * ***************************************************/  
   public boolean isEmpty(){
    boolean empty = false;
    if(front == null && back == null){
      empty = true;
    }// end if
     return empty;
  } // end isEmpty

 }// end queue
