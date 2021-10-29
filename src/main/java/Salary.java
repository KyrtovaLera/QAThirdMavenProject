public class Salary {

    public static int getSum(Worker[] workerArray) {
        int sum = 0;
        for (int i = 0; i < workerArray.length; i++) {
            sum+= workerArray[i].getSalary();
        }
        return sum;
    }
}
