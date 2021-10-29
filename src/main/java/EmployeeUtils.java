
import java.util.Objects;

public class EmployeeUtils {

    static int getSum(Worker[] employeeArray) {
        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].getSalary();

        }
        return result;
    }


    static Worker findByName(String name, Worker[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (Objects.equals(name, employeeArray[i].name)) {
                return employeeArray[i];
            }
        }
        return null;
    }
}
