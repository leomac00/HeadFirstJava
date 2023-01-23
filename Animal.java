public abstract class Animal {
  String name;
  int size;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Animal() {
    System.out.println("Creating Animal...");
    setName("NoName");
    setSize(25);
  }

  public Animal(String name) {
    this();
    setName(name);
  }

  public Animal(String name, int size) {
    this(name);
    setSize(size);
  }
}
