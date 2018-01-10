package hfdst4.vraag7.my.school;

public class Classroom implements ITest {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;
    public Classroom(int r, String t) {
        roomNumber = r;
        teacherName = t;
    }
    public void test() {
        System.out.print("test");
    }
}
