public class Manager extends Worker{

    private int countOfEmployees;

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    @Override
    public int getSalary() {
        return getBaseSalary() + getBaseSalary() / 100 * getCountOfEmployees();
    }
}
