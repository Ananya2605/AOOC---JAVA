class Student {
    int rollNo;

    void getRollNo(int r) {
        rollNo = r;
    }
}
class Test extends Student {
    int sub1, sub2;
    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }
}
class Result extends Test {
    void displayResult() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Total: " + (sub1 + sub2));
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        Result r = new Result();
        r.getRollNo(101);
        r.getMarks(75, 85);
        r.displayResult();
    }
}