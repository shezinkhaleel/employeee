import java.util.Scanner;

public class employee {
        String firstname;
        String secondname;
        int empid;
        float salary;


        public void getInput() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter First NAME: ");
            firstname = in.next();
            System.out.println("Enter second NAME: ");
            secondname = in.next();
            System.out.println("Ente emplid: ");
            empid=in.nextInt();
            System.out.println("enter salary: ");
            salary=in.nextFloat();

        }
        void display() {

            System.out.println("first name is " + firstname);
            System.out.println("Second name is " + secondname);
            System.out.println("empid " + empid);
            System.out.println("Salary " + salary);
        }
        public static void main(String[] args)
        {
            employee e[] = new employee[5];
            for (int i = 0; i < 5; i++) {
                e[i] = new employee();
                e[i].getInput();

            }
            System.out.println("**** Data Entered as below ****");
            for (int i = 0; i < 5; i++) {
                e[i].display();


            }
        }
}
