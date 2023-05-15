package homework;

public class Programme3_InstanceStaticVariables {

    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */
    int a = 120;
    static int b = 240; //one instance and one static variable.

    public static void s1(){ //static method
        Programme3_InstanceStaticVariables s = new Programme3_InstanceStaticVariables();
        System.out.println(s.a);
        System.out.println(b);

    }
    public void i1(){   //instance method
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) { //main method calling both method
        s1(); //static method - direct calling
        Programme3_InstanceStaticVariables m = new Programme3_InstanceStaticVariables(); //instance method - object
        m.i1();
    }

}
