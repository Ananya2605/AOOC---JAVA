public class staticDemo {
    static int count;

    static {
         count=10;
        System.out.println(" Here the count is executed ");
    }
    static void showcount(){
        System.out.println(" The count is : " + count);

    }

    public static void main(String[] args) {
        //staticDemo s = new staticDemo();
        showcount();
    }
}
