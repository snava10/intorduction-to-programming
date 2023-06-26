package rw.programming;

public class Exercise1 {

  public static void main(String[] args) throws Exception {
    long time = System.currentTimeMillis();
    // a lot of work
    Thread.sleep(500);
    long elapsed = System.currentTimeMillis() - time;
    System.out.println("Execution time " + elapsed);
  }

}
