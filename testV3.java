import java.util.Scanner;




public class testV3 {

  

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        Students[] students = new Students[100];

        Boolean check = true;
        while (check) {
            System.out.println("Radha Radha Radha Radha Radha Radha");
            System.out.println("1: Create\n2: Update\n3: Show\n\n0: Exit");
            int num = sc.nextInt();

            switch (num) {
                case 1: {

                    System.out.println("Enter The Number Of Students: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        students[i] = new Students();
                        students[i].addData();
                    }

                }
                    break;

                case 2: {

                    System.out.println("Enter The Students RollNo: ");
                    int roll = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        
                       int  mRollNo=students[i].rollNo;

                        if (roll == mRollNo) {

                            students[i].updateData();

                        } else {

                        }

                    }

                }
                    break;

                case 3: {
                    if (n == 0) {
                        System.out.println("No Data Found!!");
                    } else {

                        for (int i = 0; i < n; i++) {

                            students[i].showData();
        

                        }
                    }

                    break;

                }

                case 0: {

                    check = false;
                }
                    break;

                default:
                    break;
            }

        }

    }

   

}








 class Students {

    String nameList[] = new String[5];
    String name;
    int rollNo;
    int age;
   

    void addData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        rollNo = sc.nextInt();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
     

    }

    void showData() {
      

        System.out.println("------------------------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("------------------------------------------------------------------");
        

    }

    
    void updateData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        
        System.out.println("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.println("Enter Age: ");
        age = sc.nextInt();
         
    
    }

}