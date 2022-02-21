package thread;




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



