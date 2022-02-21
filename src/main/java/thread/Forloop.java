package thread;

public class Forloop {

    private String TAG = getTagName() ;

    private int limit;

    private String threadName;

    public String getThreadName() {
        return threadName;
    }

    public int getLimit() {
        return limit;
    }



    public void setThreadName(String threadName){
        this.threadName=threadName ;
    }

    public Forloop(int l  ) {
        limit = l;
    }

    public   void execute() {

        synchronized (this) {
            System.out.println(threadName + "thread is  Start . And Current Class is"+TAG ) ;

            for (int i = 0; i < limit; i++) {
                System.out.println(threadName + " running " +"And Current Class is"+TAG + " And value is " + i);
            }

            System.out.println(threadName + "thread is  Finished. And Current is"+TAG) ;
        }
    }


    protected String getTagName(){
      return   this.getClass().toString() ;
    }

}
