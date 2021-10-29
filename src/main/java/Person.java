public class Person {

     String name;
     int age;
     String sex;



    public String getName() {
        if (sex == "Male") {
            return "Mr " + name;
        } else if (sex == "Female") {
            return "Mrs " + name;
        } else {
            return "What???";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
