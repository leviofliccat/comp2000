public class App {
    public static void main(String[] args){
        m1();
        System.out.println("made it");
    }
    public static int m1() {
        try {
            System.out.println("other things");
            int x = 9;
            int y = 0;
            return (x/y);
        }
        catch (Exception e) {
            System.out.println("error happened");
        }
        finally {
            System.out.println("finally happens first");
        }
        return 0;
    }
    public static void m2(){
        int x = 9;
        int y = 0;
        int z = x/y;
        System.out.println(z);
    }
}
