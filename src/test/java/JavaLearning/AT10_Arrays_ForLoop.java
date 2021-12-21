package JavaLearning;

import org.junit.Test;

public class AT10_Arrays_ForLoop {
    @Test
    public void Test13(){
        //array
       int[] age= {10,20,30,40,50};
       //we have to specify the size of array
       int i=age.length;
       System.out.println("Array of Length: "+i);
       //For loop
       for(int j=0;j<i;j++){
       System.out.println("Array Index : "+j+" Its Value :"+ " " + age[j]);
        }
    }
	//#

    @Test
    public void Test14(){
        int[] Height={150,160,170,180};
        int k= Height.length;
        System.out.println("Array of Height: "+k);
        for(int l=0;l<k;l++){
        System.out.println("Array Index :"+l+" Its Value: "+ " " + Height[l]);
        }
//successfully declared arrays in loops
    }

}
