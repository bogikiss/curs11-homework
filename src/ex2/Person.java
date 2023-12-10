package ex2;

public class Person {
    private String name;
    private Integer age;
    private String hairColor;

    public Person(String name, Integer age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Name: %s, age: %s, hair color: %s".formatted(name, age, hairColor);
    }
}
