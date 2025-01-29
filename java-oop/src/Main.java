public class JavaOop {
    int speed;
    int size;
    String color;

    public static void main (String[] args){

    }

    void accelerate(int amount){
        speed = speed + amount;
    }

    void applyBrakes(int amount){
        speed = speed - amount;
    }
}
