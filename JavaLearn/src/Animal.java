public class Animal {
    public String picture;
    public String name;
    public int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(this.name + " just sound");
    }
}
