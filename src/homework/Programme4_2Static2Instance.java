package homework;

public class Programme4_2Static2Instance {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */
    int a = 10; //4.1
    int b = 20;
    static int c = 30; //4.1
    static int d = 40;

    public void i2() { //4.2
        System.out.println(a); //4.4
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    public static void s2() { //4.3
        Programme4_2Static2Instance s = new Programme4_2Static2Instance(); //4.4
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) { //4.5 and 4.6
        s2();
        Programme4_2Static2Instance obj = new Programme4_2Static2Instance();
        obj.i2();

    }

    }
