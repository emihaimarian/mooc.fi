
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.employees.add(person));
    }

    public void print() {
        this.employees.forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {

        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
