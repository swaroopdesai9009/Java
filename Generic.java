 //        Generic <Integer> gc = new Generic<Integer>(10,20);
 //        System.out.println(gc.getName());

 //        Generic < String >gc1 = new Generic<String>("swaroop","Dada");
 //        System.out.println(gc1.getName());

public class Generic <T>{
    T name;
    T salary;

    public Generic(T name, T salary){
        this.name = name;
        this.salary = salary;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSalary() {
        return salary;
    }

    public void setSalary(T salary) {
        this.salary = salary;
    }
}
