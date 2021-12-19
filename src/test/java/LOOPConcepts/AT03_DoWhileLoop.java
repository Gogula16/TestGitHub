package LOOPConcepts;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void dowhileLearn01(){
     int ticket = 75;
     do{
        System.out.println("Current ticket is : " +ticket);
        ticket++;
        }while(ticket<80);
    }

    @Test
    public void dowhilelearn02(){
    int ticket = 75;
    do{
        System.out.println("Ticket no:" +ticket);
        ticket--;
        }while(ticket>70);

    }

    @Test
    public void dowhilelearnarray03(){
       int[] arr = {70,71,72,73,74,75};
       //i starts with 0 as array index starts with 0
       int ticket01 =0;
       do{
           System.out.println("Print Ticket No: " +arr[ticket01]);
           ticket01++;
       } while(ticket01<6);

    }

}