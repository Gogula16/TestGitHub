package oopsConcepts;

import org.junit.Test;

public class AT03_Encapsulation01 {

    @Test
    public void envMethod01(int i, int j){
        int k = i + j;
        System.out.println("Print Value of k : " +k);

    }

    @Test
    public int envMethod02(int m, int n){
        int y = m + n;
        return y;
    }

}
