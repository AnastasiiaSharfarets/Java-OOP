public class Uni {
    //Создайте метод удаления, добавление, изменения элементов из массива.
    public Person[] persons;
    public int size;

    public Uni(int capacity) {
        persons = new Person[capacity];

    }

    public void deletePerson(Person person) {
        for (int i = 0; i < size; i++) {
            if (person.equals(persons[i])) {
                persons[i] = persons[size - 1];
                size--;
            }
        }
    }

    public void addPerson(Person person) {
        persons[size] = person;
        size++;
    }

    public void sortByAge() {
        for (int i = 0; i < size; i++) {
            int minID = i;
            int currentMin = persons[i].getAge();
            for (int j = i + 1; j < size; j++) {
                if (persons[j].getAge() < currentMin) {
                    currentMin = persons[j].getAge();
                    minID = j;
                }
            }
            Person temp = persons[i];
            persons[i] = persons[minID];
            persons[minID] = temp;
        }
    }

    public void printPersons() {
        for (int i = 0; i < size; i++) {
            System.out.println("Person " + (i + 1) + ": " + persons[i].getSecondName() + " " + persons[i].getAge());
        }
    }
}
