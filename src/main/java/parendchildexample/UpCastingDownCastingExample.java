package parendchildexample;

/**
 * Parent Class
 */
class Parent {

    protected String TAG = getTag() ;


    protected void println(String str) {
        System.out.println(str);
    }

    public void funInParent1() {
        println("I am funInParent1() in " + TAG + " From Class");
    }

    public void funInParent2() {
        println("I am funInParent2() in " + TAG + " From Class");
    }

    public void funInParent3() {
        println("I am funInParent3() in " + TAG + " From Class");
    }

    protected String getTag(){
        return this.getClass().toString();
    }
}


/**
 * Child class
 */

class Child extends Parent {


    public void funInChild1() {
        println("I am funInChild1() in " + TAG + " From Class");
    }

    public void funInChild2() {
        println("I am funInChild2() in " + TAG + " From Class");
    }

    @Override
    protected String getTag() {
        return this.getClass().toString();
    }
}

/**
 * GrandChild class
 */
class GrandChild extends Child {

    private String TAG = this.getClass().toString();

    public void funInGrandChild1() {
        println("I am funInGrandChild1() in " + TAG + " From Class");
    }

    public void funInGrandChild2() {
        println("I am funInGrandChild2() in " + TAG + " From Class");
    }

    @Override
    protected String getTag() {
        return this.getClass().toString();
    }
}

public class UpCastingDownCastingExample {

    public static void main(String[] args) {

        /*
         * Here object of GrandChild class assigned in Parent class . Although GrandChild class assigned to Parent
         * class & GrandChild class extends Parent Class So GrandChild Object created but this object assigned in
         * Parent class Data type . so we can access only Parent Class method and variable
         *
         * --- This is called Upcasting .
         */
        Parent p = new GrandChild(); // <-- (Upcasting)
        Parent p1 = new Child(); // <-- (Upcasting) same as p object

        /*
         *
         * Here type of p variable is Parent type but object of GrandChild assigned in p variable .
         * We know  GrandChild extends and Child and extends Parent ( GrandChild --> Child --> Parent ) .
         * now we want to  p variable cast to Child Type . So can Access Child Class method and variable .
         *
         * --- This is DownCasting
         */

        Child c = (Child) p; // <-- (DownCasting)
        Child c1 = (Child) p1 ; // <-- (DownCasting)

        c1.funInChild1();
        c.funInChild1();



    }
}
