public class DoubleListTester{
  public static void main(String[] args){

    DoubleList<String> list = new DoubleList<String>();

    System.out.println("test addToFront()");
    // create a list: front-->A<->B<->C<--rear
    list.addToFront("C");
    list.addToFront("B");
    list.addToFront("A");

    System.out.println("test case: appending");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);

    System.out.println("test case: size increment");
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());

    System.out.println("test case: proper pointer handling");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

    System.out.println("test addToRear()");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    list.addToRear("C");

    System.out.println("test case: appending");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);

    System.out.println("test case: size increment");
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());

    System.out.println("test case: proper pointer handling");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());
  }
}