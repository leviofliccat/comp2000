package src;

public class Pair<T extends MyClass, P> {
    T x; //can be any class - Integer, Character, Point, Rectangle, ArrayList, String etc
    P a;

    public Pair(T inX, P inA){
        x = inX;
        a = inA;
    }

    public String toString(){
        return ("Pair: (" + x + ", " + a + ")");
    }

}
