public class App implements Shoutable{
    
    public void shout() {
        System.out.println("I shout");
    }

    public static void main(String[] args) throws Exception{
        
        // App a = new App();
        // App b = new App();

        // Pair<Integer,Character> p = new Pair<Integer,Character>(5, 'F');
        
        // p.subscribe(a);
        // p.subscribe(b);

        // System.out.println("First in pair is: " + p.getFirst());

        System.out.println(bar('n'));

    }

    public static int bar(char y) {
        int x = 0;
        try {
            if(y < 'n') {
                System.out.println("hi");
                throw new IndexOutOfBoundsException();
                
            }
            x = -1;
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
            x = 1;
        } finally {
            if(y > 'm') {
                x = -2;
            }
        }
        return x;
    }
    
}
