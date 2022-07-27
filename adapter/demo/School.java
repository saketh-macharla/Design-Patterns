package adapter.demo;

public class School {

    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I'm a bit tired to write an assignment");
    }
}
