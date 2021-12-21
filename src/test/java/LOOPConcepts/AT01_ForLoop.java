package LOOPConcepts;

import org.junit.Test;

########

public class AT01_ForLoop {

    @Test
    public void ForLoopLearn01 (){
        // here the output values should be less than 20
        for(int i=1; i<20; i++){
            System.out.println("Value of i is : " +i);

        }
    }

    @Test
    public void ForLoopLearn01A (){
        //here as we mentioned "=" so here the output includes 20
        for(int i=1; i<=20; i++){
            System.out.println("Value of i is : " +i);

        }
    }

        @Test
    public void ForLoopLearn02 (){
        for(int i=20 ;i>=0; i--) {
            System.out.println("Value of i is : "+i);
        }
    }


    @Test
    public void ForLoopArray01() {
        //array
        int [] age={10,20,30,40,50};
        //we are printing a value stored in index of array
        //i starts with 0 as array index starts with 0
        System.out.println(age[3]);
    }

    @Test
    public void ForLoopArray02() {
        //array
        int[] age = {10, 20, 30, 40, 50};
        //length of array index
        int i= age.length;
        System.out.println("Length Of Array : " + i);
        //array using "for" loop
        //i starts with 0 as array index starts with 0
        for(int j=0;j<i;j++){
            System.out.println("Index Of Age Array : "+j+"  Its Value : " +" " +age[j]);

        }
    }


    @Test
    public void ForLoopArray03() {
        //integers array
        //square brackets usually have to be next to integers (taught by Jagan)
        //square brackets next to arr also works
        int[] arr = {10, 15, 20, 25, 30,35,40,45,50};
        //array using "for" loop
        //i starts with 0 as array index starts with 0 too
        for(int j=0;j<arr.length;j++){
            System.out.println("Index Of Array : "+j+"  Its Value : " +" " +arr[j]);
        }

    }


    @Test
    public void ForLoopArrayEnhancedIntegers04() {
        //enhanced for loop
        //array expressed in a more enhanced way
        //square brackets usually have to be next to integers (taught by Jagan)
        //square brackets next to arr also works
        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int num : arr) {
            System.out.println(num);

            }
    }


    @Test
    public void ForLoopArrayEnhancedString01(){
        //string array
        String[] arr  = {"Hi", "Hello", "How are you?", "Bye"};
        //for loop array using string
        for(String str : arr){
            System.out.println(str);

        }

    }

    ///------------------------------------------------------------------
    @Test
    public void ForLoopLearn01B() {
        //use of break in a for loop
        for (int i = 100; i >= 10; i--) {
            System.out.println("Value of i is : " + i);
            if (i == 99) {
                break;
            }

        }
        System.out.println("Out of for-loop");
    }
}