package JavaLearning;

public class AT05_CreateAnObjectandUseit01 {

    //main method
    public static void main(String[] args) {

    //creating object
        AT05_CreateAnObjectandUseit01 obj= new AT05_CreateAnObjectandUseit01();
        obj.Test03();
        obj.Test04();
    }

     //sub method 1
        public void Test03() {
        int o = 10;
        int p = 10;
        int q = o + p;
        System.out.println("Value of q : " + q);
    }
    // sub method 2
        public void Test04() {
        String Test01 = "Testing Tools";
        String Test02 = "Course";
        System.out.println("Name of the Course : " + Test01 + " " + Test02);
    }
}