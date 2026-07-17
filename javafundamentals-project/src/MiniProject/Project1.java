package MiniProject;

public class Project1 {

    public static void main(String[] args) {

        int empNo[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };

        String empName[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };

        String dept[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };

        char desCode[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };

        int basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };

        int hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };

        int it[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

        if (args.length == 0) {
            System.out.println("Please enter an employee id");
            return;
        }
        int empid = Integer.parseInt(args[0]);
        int i;

        for (i = 0; i < empNo.length; i++) {

            if (empNo[i] == empid) {
                break;
            }
        }
        if (i == empNo.length) {
            System.out.println("There is no employee with empid : " + empid);
            return;
        }
        String designation = "";
        int da = 0;

        switch (desCode[i]) {

            case 'e':
                designation = "Engineer";
                da = 20000;
                break;

            case 'c':
                designation = "Consultant";
                da = 32000;
                break;

            case 'k':
                designation = "Clerk";
                da = 12000;
                break;

            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;

            case 'm':
                designation = "Manager";
                da = 40000;
                break;
        }
        int salary = basic[i] + hra[i] + da - it[i];

        System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");

        System.out.println(empNo[i] + "\t" + empName[i] + "\t" + dept[i] + "\t" + designation + "\t" + salary);

    }

}