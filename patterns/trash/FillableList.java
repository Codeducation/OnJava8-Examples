// patterns/trash/FillableList.java
// �2016 MindView LLC: see Copyright.txt
// Adapter that makes a List Fillable.
package patterns.trash;
import java.util.*;

public class FillableList<T extends Trash>
implements Fillable<T> {
  private List<T> v;
  public FillableList(List<T> vv) {
    v = vv;
  }
  @Override
  public void addTrash(T t) { v.add(t); }
}
