import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ex3COLLECTIONS {
  public static void main(String[] args) {

    List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
    List<Integer> result = alternate(li1, li2);
    System.out.println(result);
  }

  public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
    Iterator<Integer> i1 = list1.iterator();
    Iterator<Integer> i2 = list2.iterator();
    List<Integer> result = new ArrayList<Integer>();

    while (i1.hasNext() || i2.hasNext()) {
      if (i1.hasNext()) {
        result.add(i1.next());
      }
      if (i2.hasNext()) {
        result.add(i2.next());
      }
    }
    return result;
  }

}