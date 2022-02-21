package parendchildexample;

/** Parent Class */
class ParentC {

  protected String TAG = getTag();

  protected void println(String str) {
    System.out.println(str);
  }

  public void fun() {
    println("I am in " + TAG + " _Class");
  }

  protected String getTag() {
    return this.getClass().getSimpleName();
  }
}

/** Child class */
class ChildC extends ParentC {

  @Override
  public void fun() {
    println("I am in " + TAG + " _Class");
  }

  @Override
  protected String getTag() {
    return this.getClass().getSimpleName();
  }
}

/**
 * Notice Very well ,
 *
 * <p>'ParentC' class have 'fun()' . Then 'ChildC' class extends 'ParentC' class . And 'ChildC'
 * class Override 'fun()' method . </p>
 *
 * <p>Now, 'p' variable which Type is 'ParentC' . and inside 'p' variable we assigned 'ChildC' class
 * object . now we want call 'fun()' method . and we know 'fun()' method is Over-rided 'ChildC'
 * class [ eg:  ParentC p = new ChildC() ] . Then which 'fun()' method is called [ eg: p.fun() ] ?  </p>
 *
 * <p>Ans: - fun method of ChildC class will called . Though , 'p' variable which Type is 'ParentC' . and inside 'p' variable we assigned
 * 'ChildC' class  object </p>
 */
public class UpAndDownCastingWithOverridingExample {

  public static void main(String[] args) {

    ParentC p = new ChildC();
    p.fun();
  }
}
