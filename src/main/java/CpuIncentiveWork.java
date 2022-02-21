import java.util.LinkedList;

class CpuIncentive {


    Callback callback;

    int maxNum;

    LinkedList<Integer> arr;

    int[][] arr2;

    /**
     * constructor
     * @param c Callback InterFace
     * @param maxLimit
     */
    CpuIncentive(Callback c, int maxLimit) {
        callback = c;

        maxNum = maxLimit;

        arr = new LinkedList<Integer>();
    }

    CpuIncentive(int[][] arr2) {
        this.arr2 = arr2;
    }

    private LinkedList<Integer> createArray() {

        int num = 0;

        for (int i = 0; i <= maxNum; i++) {
            num = num + i;
            arr.add(num);
        }

        return arr;
    }

    public void giveResult() {

        var newArr = createArray();

        int sum = 0;

        for (int i : newArr) {

            sum += i;
        }

        callback.result(sum);
    }

    public interface Callback {
        void result(int sum);
    }
}

public class CpuIncentiveWork {

    public static void main(String[] args) {



        var cpuIncentiveWork =
                new CpuIncentive(
                        (sum) -> {
                            System.out.println(sum);
                        },
                        10000000);

        cpuIncentiveWork.giveResult();
    }
}
