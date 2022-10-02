/**
 *Java basic: HomeWork8
 *
 @author Muzaffar Eshonqulov
 @todo 28.09.2022
 @date 2.10.2022
 *
*/
class HomeWork8 {
    public static void main (String[] args) {
        Cat cat = new Cat("Moshon", "white", 2,1);
        System.out.println(cat);
        System.out.println(cat.voice());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to jump: " + cat.jumpMax(1));
        cat.feed();
        System.out.println("Try to jump: " + cat.jumpMax(2));
    }
}