package JavaLearning;

import org.junit.Test;

public class AT03_StringInt {
 // in this method, we are declaring integers

 @Test
 public void Test03A() {
  //local variables
  int i = 20;
  int j = 30;
  int k = i + j;
  System.out.println("Value of k = " + k);

  int l = 80;
  int m = 20;
  int n = l - m;
  System.out.println("Value of n = " + n);
 }

 @Test
 public void Test03B() {
  int o = 10;
  int p = 10;
  int q = o - p;
  System.out.println("Value of q : " + q);
 }

 @Test
 public void Test04() {
  String Test01 = "Testing Tools";
  String Test02 = "Course";
  System.out.println("Name of the Course : " + Test01 + " " + Test02);
  String Test03= Test01 + " " + Test02;
  System.out.println(Test03);
 }
///successfully declared integers in above methods.
}
