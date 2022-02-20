package thread;

class Forloop {
    private int limit;

    private String threadName;

    public void setThreadName(String threadName){
        this.threadName=threadName ;
    }

    public Forloop(int l  ) {
        limit = l;
    }

    public   void execute() {

        synchronized (this) {
            for (int i = 0; i < limit; i++) {
                System.out.println(threadName + "thread is running And value is " + i);
            }
        }
    }
}




class ExampleThread extends Thread {

    Forloop loop;


    ExampleThread( Forloop loop,String threadName) {
        this.loop=loop ;
        this.loop.setThreadName(threadName);

    }

    @Override
    public void run() {
        loop.execute();
    }
}

/*  synchronized in Single Object
 *
 */





public class JavaThreadExample {
    public static void main(String[] args) {

        var loopCount = 10000;

        var loopObj=new Forloop(loopCount) ;


        var exampleThread1 = new ExampleThread( loopObj ,"Background_1_");
        var exampleThread2 = new ExampleThread( loopObj,"Background_2_");

        exampleThread1.start();
//      exampleThread2.start();

        loopObj.execute();




    }
}



