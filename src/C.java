class A {
    void test() {
        System.out.println("in A");
    }
}

class B extends A {

}

public class C extends B {
    void test() {
        super.test();
        System.out.println("in C");
    }

    public static void main(String[] args) {
    C c  = new C();
    c.test();
    }

}









