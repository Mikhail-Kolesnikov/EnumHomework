import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private UserType type;

    public Person(UserType type, int age, String name) {
        this.type = type;
        this.age = age;
        this.name = name;
    }

//    public static String user(String string, UserType a){
//
//
//
//
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && type == person.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }

    public String getName() {
        return name;
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

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
