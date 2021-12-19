package LOOPConcepts;

import org.junit.Test;

public class AT02_WhileLoop {
    @Test
    public void WhileloopLearn01(){
        int count= 50;
        while(count<60){
            System.out.println("Value of Count is : " +count);
            count++;
        }

    }

    @Test
    public void usingWhileloopinarray02(){
        int [] arr = {1,2,3,4,5};
        //count starts with 0 as array index starts with 0
        int count1 = 0;
        while(count1<5){
            System.out.println("Value of Count is : " +count1);
            count1++;
        }

    }

}
