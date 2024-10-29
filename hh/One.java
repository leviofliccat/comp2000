public class One{
    
    // public void shout() {
    //     System.out.println("I shout");
    // }
    int field = 0;
    One(int f){
        field = f;

    }
    void change(in g){
        field = g;
    }
    void printme(){
        System.out.println(field);
    }

    public static void main(String[] args) throws Exception{
        
        // App a = new App();
        // App b = new App();

        // Pair<Integer,Character> p = new Pair<Integer,Character>(5, 'F');
        
        // p.subscribe(a);
        // p.subscribe(b);

        // System.out.println("First in pair is: " + p.getFirst());
        int bar = 9;
        int bar2 = bar;
        bar2 = -3;
        System.out.println(bar);

    }

    // public static int bar(char y) {
    //     int x = 0;
    //     try {
    //         if(y < 'n') {
    //             System.out.println("hi");
    //             throw new IndexOutOfBoundsException();
                
    //         }
    //         x = -1;
    //     } catch(IndexOutOfBoundsException e) {
    //         e.printStackTrace();
    //         x = 1;
    //     } finally {
    //         if(y > 'm') {
    //             x = -2;
    //         }
    //     }
    //     return x;
    // }
    
}
