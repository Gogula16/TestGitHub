package JavaLearning;

import org.junit.Test;

import java.text.StringCharacterIterator;

public class AT04_GlobalVariables {
    //Global variables ####
    int i= 10;
    int j= 20;
    String y= "Presented by Test Software Institute";
    @Test
    public void Test05(){
    int k= i+j+20;
    //local variables
    int l=50;
    int m=25;
    System.out.println("Value of k : "+(k+l+m));
    }
    @Test
    public void Test04() {
        String Test01 = "Testing Tools";
        String Test02 = "Course";
        System.out.println("Name of the Course : " +Test01+ " " +Test02);
        System.out.println("Name of the Course : " +Test01+ " " +Test02+" "+y);
        String Test03= Test01 + " " + Test02+" "+y;
        System.out.println(Test03);
    }
}