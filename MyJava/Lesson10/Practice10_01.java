package Lesson10;

public class Practice10_01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.name = "pochi";
        animal1.type = "dog";

        System.out.println(animal1.name);

        animal1.cryAnimals();

        Animal animal2 = new Animal();

        animal2.name = "tama";
        animal2.type = "cat";

        System.out.println(animal2.name);
        
        animal2.cryAnimals();
    }

}

class Animal {
    String name = "Jhon";
    String type = "nothing";

    /**
     * 動物に合わせて鳴き声を出力するメソッド
     *
     */

    public void cryAnimals() {
        System.out.println(
                switch (type) {
                    case "cat" -> "nya-";
                    case "dog" -> "wan";
                    default -> "特定できませんでした";
                });
    }
    
}