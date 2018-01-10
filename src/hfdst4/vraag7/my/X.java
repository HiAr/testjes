package hfdst4.vraag7.my;

public class X {
    static {
        try {
            throw new NullPointerException();
        } catch (Exception ex) {}
    }
}

abstract class Y extends X {

}
