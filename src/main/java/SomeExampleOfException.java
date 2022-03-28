public class SomeExampleOfException {

  public static void main(String[] args) {

    try {
      var x = 39 / 0;

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }



  }
}
