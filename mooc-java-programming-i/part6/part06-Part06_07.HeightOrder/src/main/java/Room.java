
import java.util.ArrayList;
import java.util.List;

public class Room {

    private ArrayList<Person> personList;

    public Room() {
        personList = new ArrayList<>();
    }

    //add the person passed as a paramter to the list.
    public void add(Person person) {
        this.personList.add(person);
    }

    public boolean isEmpty() {

        //returns a boolean-type value true or false, that tells whether the room is empty or not.
        if (!this.personList.isEmpty()) {
            return false;
        }

        return true;
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {

        if (this.personList.isEmpty()) {
            return null;
        }

        Person firstPersonElementFromList = this.personList.get(0);

        for (Person person : personList) {

            if (firstPersonElementFromList.getHeight() > person.getHeight()) {

                firstPersonElementFromList = person;
            }
        }

        return firstPersonElementFromList;
    }

    public Person take() {

        if (this.personList.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        
        this.personList.remove(shortestPerson);
        
        return shortestPerson;
        
    }
}
