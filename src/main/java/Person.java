import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if(getAge() == null){
            return false;
        }
        return true;
    }
    public boolean hasAddress() {
        if (getAddress() == null){
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String city) {
        this.address = city;
    }

    public void happyBirthday() {
        if (this.hasAge()){
            age += 1;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Фамилия: " + surname + ", Возраст: " + age + ", Адрес: " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder(int age) {
      return new PersonBuilder().setSurname(surname).setAge(age).setAddress(address);
    }
}
