public class ConstantInit1 {
  public static final double X_VALUE;
  public static final int[] NUM_LIST;

  // This is called a static initializar, it runs before everything on the class
  // and i´ts a good place to initialize constants
  static {
    X_VALUE = Math.random() * 100;
    int size = (int) Math.round(X_VALUE);
    NUM_LIST = new int[size];
    for (int i = 0; i < size; i++) {
      NUM_LIST[i] = (int) Math.round(Math.random() * 100);
    }
  }
}
