public class Increment {
    public static void main (String[] args){
      
        int a = 10;
        int b = 5;

        int x = a++ + ++b;
        int y = --a + b++;
        int z = ++a + a++ + --b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}

public class InnerIncrement {
        public static void main(String[] args) {

        int a = 7;
        int b = 3;
        int c = 5;

        a++;
        ++b;

        int x = a + b++ + ++c;

        c--;
        a = a++ + ++b;

        int y = --a + c++ + b--;

        b++;
        c = ++c + c++;

        int z = a++ + --b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
} 


