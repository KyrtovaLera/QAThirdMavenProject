public class Main {

    public static void main(String[] args) {
        System.out.println(HomeWork8.abbrMethod("testtesttest"));

//            Person person = new Person("Olya", 28, "Female");
//
        Manager manager = new Manager();
        manager.setCountOfEmployees(1);
        manager.setSalary(200000);
//        System.out.println(manager.getSalary());

        Worker worker = new Worker();
        worker.setName("Ira");
        worker.setSalary(1000);

        Director director = new Director();
        director.setCountOfEmployees(2);
        director.setSalary(200000);

        Worker[] workerArray = {worker, manager, director}; //обьект наследника - тут manager может использоваться с типом родителя, тут - worker

        int sum = Salary.getSum(workerArray);

        System.out.println(sum);

//        System.out.println(EmployeeUtils.findByName("Lera", workerArray));

    }
}
