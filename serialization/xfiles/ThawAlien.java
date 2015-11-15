// serialization/xfiles/ThawAlien.java
// �2016 MindView LLC: see Copyright.txt
// Recover a serialized file
package serialization.xfiles;
import java.io.*;

public class ThawAlien {
  public static void main(String[] args) throws Exception {
    ObjectInputStream in = new ObjectInputStream(
      new FileInputStream(new File("..", "X.file")));
    Object mystery = in.readObject();
    System.out.println(mystery.getClass());
  }
}
/* Output:
class Alien
*/
