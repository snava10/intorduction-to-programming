public class ProgramArrays {

  public static void main(String[] args) {
    int [] arr = {2, 1, 1, 5};
    int [] arr2 = new int[4]; // [0, 0, 0, 0]
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + ":" + arr[i]);
    }
    String word = "London";
    for (int i = 0; i < word.length(); i++) {
      System.out.print(word.charAt(i) + " ");
    }
  }
}
