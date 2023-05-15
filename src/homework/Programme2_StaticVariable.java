package homework;

public class Programme2_StaticVariable {

        /**
         * 2.1 Declare two static variables
         * 2.2 Declare one static method
         * 2.3 Call both static variables into the static method inside the print statement.
         * 2.4 Declare the Main method.
         * 2.5 Call the static method into the Main method and Run the programme.
         */

        static int a = 25;
        static int b = 30; // 2 static variables

        //following is static method
        public static void s1() {
            System.out.println(a); //calling both static variables into static method
            System.out.println(b);

        }
        public static void main(String[] args){
            // we can call static method by class or direct
            s1();
            //or
            //Programme2_StaticVariable.s1();


        }
        }


