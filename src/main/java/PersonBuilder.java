public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Не хватает обязательных данных! Укажите имя!");
        } else if (surname == null) {
            throw new IllegalStateException("Не хватает обязательных данных! Укажите фамилию!");
        } else if (age < 0 || age > 120) {
            throw new IllegalStateException("Некорректный возраст! Возраст не может быть равен " + age);
        }
        Person newPerson = new Person(name, surname, age);
        newPerson.setAddress(address);
        return newPerson;
    }
}
