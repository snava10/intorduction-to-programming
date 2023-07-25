import java.util.ArrayList;
import java.util.List;

public class ProgramLists {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("England");
    list.add("Scotland");
    list.add("Wales");
    list.add("Northern Ireland");

    System.out.println("The " + list.size() + " nations of the United Kingdom are:");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
