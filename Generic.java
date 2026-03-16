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
