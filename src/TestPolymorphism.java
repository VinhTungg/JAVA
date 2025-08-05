// Lớp cha
class Animal {
    public void makeSound() {
        System.out.println("Một tiếng động vật nào đó...");
    }
}
// Các lớp con ghi đè phương thức của lớp cha
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Gâu gâu!");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meo meo!");
    }
}
// Cách sử dụng tính đa hình
public class TestPolymorphism {
    public static void main(String[] args) {
        // Một tham chiếu Animal có thể trỏ đến đối tượng Dog
        Animal myAnimal1 = new Dog();
        // Một tham chiếu Animal có thể trỏ đến đối tượng Cat
        Animal myAnimal2 = new Cat();
        // Cùng một lời gọi phương thức makeSound() nhưng cho ra kết quả khác nhau
        // tùy thuộc vào đối tượng thực tế mà tham chiếu đang trỏ tới.
        myAnimal1.makeSound(); // Output: Gâu gâu!
        myAnimal2.makeSound(); // Output: Meo meo!
    }
}


