import java.util.ArrayList;
import java.util.List;

public class Pair <T, P> implements ShoutPublisher {
    T x;
    P a;
    List<Shoutable> subs = new ArrayList<>();

    public Pair(T inX, P inA) {
        x = inX;
        a = inA;
    }

    public T getFirst() {
        for (Shoutable s : subs) {
            s.shout();
        }
        return x;
    }

    public P getSecond() {
        return a;
    }

    public void subscribe(Shoutable s) {
        subs.add(s);
    }

    public String toString() {
        return "(" + x + ", " + a + ")";
    }
}
