public class Cat {
    String name;
    String color;
    int age;
    int jump;
    boolean full;

    public Cat(String name, String color, int age,int jump) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.jump = jump;
        this.full = false;
    }

    public  String voice() {

        return name +":miyaw";
    }
    public  String toString(){

        return  "Cat: " + name + "Color: " + color + " age: " + age;
    }

    public void feed(){
        full = true;

    }
    public boolean play() {
        if (full) {
            full=false;
            return true;
        } else {
            System.out.println(voice());
            return false;
        }
    }
    public boolean jumpMax(int height) {
        if(full) {
            full=false;
            if (height <= jump) {
                return true;
            } else {
                System.out.println(voice());
                return false;
            }
        }else {
            System.out.println(voice());
            return false;
        }
    }


}
