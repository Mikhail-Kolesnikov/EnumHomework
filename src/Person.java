import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private UserType type;
    private String http = "http://web-for-user";

    public Person(UserType type, int age, String name) {
        this.type = type;
        this.age = age;
        this.name = name;
    }


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
//) Создатйте enum "Тип пользователя" с вариантами констант: USER, ADMIN
//1) Необходимо создать класс "Человек", добавить в него поле "Тип пользователя" с енамом, остальные поля придумайте самостоятельно
//2) Создать интерфейс Фильтр. В него добавьте метод, который принимает строку (веб-адрес, к которому подключается человек)
// и тип пользователя (enum). Метод отдает boolean значение, пропускает ли он человека к ресурсу или нет.
//3) Реализуйте интерфейс таким образом:
//3.1) Если это админ, то досту разрещен к любому сайту
//3.2) Если это пользователь, то ему разрешен доступ только к сайтам, которые начинаются на "http://web-for-user"
//4) Самостоятельно создайте пару пользователей и попробуйте проверить, к каким сайтам у них есть доступ
//
//
//5*) Добавьте в enum поле, обозначающее название роли пользователя на русском языке
