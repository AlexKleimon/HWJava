package OOP.HomeWork01;

public class Cat {
    private String name;
    private int age;
    private Owner nameOwner;

    public Cat(String name, int age, Owner nameOwner) {
        this.name = name;
        this.age = age;
        this.nameOwner = nameOwner;
    }

    public Cat(String name, Owner nameOwner) {
        this.name = name;
        this.age = 0;
        this.nameOwner = nameOwner;
    }

    public Cat() {
        this.name = "Неизвестно";
        this.age = 0;
        this.nameOwner = new Owner("Неизвестно");
    }

    public Owner getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(Owner nameOwner) {
        this.nameOwner = nameOwner;
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

    public void great() {
        System.out.printf("Мяу! меня зовут %s. Мне %s года (лет). Мой владелец - %s.\n", name, age,
                nameOwner.getName());
    }
}
