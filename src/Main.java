public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer c1 = new Computer(32,true,16,4.9, 12);
        Computer c2 = new Computer(4,false,2,2.3, 1);
        System.out.println(c1.isFast());
        System.out.println(c1.numChromeTabs());
        System.out.println(c2.isFast());
        System.out.println(c2.numChromeTabs());
    }
}
