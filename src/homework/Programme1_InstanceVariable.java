package homework;

public class Programme1_InstanceVariable {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */

    int a = 5;
    int b = 10; // 2 instance variables


        //following is instance method
    public void m1() {
        System.out.println(a); //1.3
        System.out.println(b);

    }
    public static void main(String[] args){ //1.4
        Programme1_InstanceVariable obj = new Programme1_InstanceVariable(); //1.5
        obj.m1();

    }
}
