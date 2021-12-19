package oopsConcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {

    @Test
    public void envMeth03() {
     AT03_Encapsulation01 obj=new AT03_Encapsulation01();
     obj.envMethod01(10,20);
     int o = obj.envMethod02(20,50);
     System.out.println("Value of o : "+o);

    }
}
