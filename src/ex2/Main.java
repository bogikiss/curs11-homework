package ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Mario", 16, "brunette");
        Person person2 = new Person("Isabell", 17, "blonde");
        Person person3 = new Person("Mary", 15, "brunette");
        Person person4 = new Person("Anne", 16, "black");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        System.out.println(persons);

        //2.1
        List<String> names = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            names.add(persons.get(i).getName());
        }
        System.out.println(names);

        //2.2
        Map<String, Integer> nameToAge = new HashMap<>();
        for (Person person : persons) {
            nameToAge.put(person.getName(), person.getAge());
        }
        System.out.println(nameToAge);

        //2.3
        List<Person> olderThanSixteen = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > 16) {
                olderThanSixteen.add(person);
            }
        }
        System.out.println(olderThanSixteen);

        //2.4
        Map<String, List<String>> hairColorToName = new HashMap<>();
        List<String> hairColors = new ArrayList<>();

        for (Person personIteration : persons) {
            if (!hairColors.contains(personIteration.getHairColor())) {
                hairColors.add(personIteration.getHairColor());
            }
        }

        for (String color : hairColors) {
            List<String> hairList = new ArrayList<>();
            for (Person person : persons) {
                if (person.getHairColor().equals(color)) {
                    hairList.add(person.getName());
                }
            }
            hairColorToName.put(color, hairList);
        }
        System.out.println(hairColorToName);

        //2.5
        Map<Integer, List<Person>> ageToPerson = new HashMap<>();
        List<Integer> ageList = new ArrayList<>();

        for (Person personIteration : persons) {
            if (!ageList.contains(personIteration.getAge())) {
                ageList.add(personIteration.getAge());
            }
        }

        for (Integer age : ageList) {
            List<Person> personList = new ArrayList<>();
            for (Person person : persons) {
                if (person.getAge().equals(age)) {
                    personList.add(person);
                }
            }
            ageToPerson.put(age, personList);
        }
        System.out.println(ageToPerson);
    }
}
