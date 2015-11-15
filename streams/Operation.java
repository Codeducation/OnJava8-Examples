// streams/Operation.java
// �2016 MindView LLC: see Copyright.txt
import java.util.*;

@FunctionalInterface
public interface Operation {
  void execute();
  static void runOps(List<Operation> ops) {
    ops.forEach(Operation::execute);
  }
  static void show(String msg) {
    System.out.println(msg);
  }
}
