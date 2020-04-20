import java.util.*;
import java.io.*;

abstract class Home {
    String savings[][] = {{"plan1", "15000"}, {"plan2", "22000"}, {"plan3", "5500"}, {"plan4", "18500"}, {"plan5", "11000"}};
    double electricity_bill, telephone_bill, grocery_bill;
    double fund=0, temp=0;

    Scanner ss= new Scanner(System.in);

    class Member{
        double salary, saving_plan, contribution, actual_contribution;
        String name;
        int ID;
    }

    Home.Member m1 = new Home.Member();
    Home.Member m2 = new Home.Member();
    Home.Member m3 = new Home.Member();

    void get_member() {
        Scanner sc = new Scanner(System.in);



        m1.ID=1;
        m2.ID=2;
        m3.ID=3;
        m1.name="Subha";
        m2.name="Shreya";
        m3.name="Muskaan";

        try {
            File myObj = new File("Member_data.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: and data is saving in " + myObj.getName());
            } else {
                System.out.println("data is saving.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred. unable to save Data");
            e.printStackTrace();
        }



        System.out.println("Dear Member plz Enter your unique ID :  ");
        int id=0;
        try {
            id=sc.nextInt();
        }
        catch (InputMismatchException n){
            System.out.println("you Entered a wrong input type...\n Enter only integer type");
        }

        try {
            FileWriter myWriter = new FileWriter("Member_data.txt");
            myWriter.write(id);
            myWriter.close();
            //System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            //e.printStackTrace();
        }

            switch (id) {
                case 1:
                //System.out.println("Enter the name of the Member:   ");
                //m1.name = sc.next();
                System.out.println("Welcome  "+m1.name);
                System.out.println("Enter the salary of the Member:   ");

                    try {
                        m1.salary = sc.nextDouble();
                    }
                    catch (InputMismatchException n){
                        System.out.println("you Entered a wrong input type...\n Enter only integer type");
                    }
                System.out.println("Plan 1 -- 15000\n" +
                        "Plan 2 -- 22000\n" +
                        "Plan 3 -- 5500\n" +
                        "Plan 4 -- 18500\n" +
                        "Plan 5 -- 11000");
                System.out.println("Enter your Savings Plan");
                temp = sc.nextDouble();
                if (temp==15000 || temp==22000 || temp==5500 || temp==18500 || temp==11000 ){
                    m1.saving_plan=temp;

                }
                else
                    System.out.println("Oops... error occured...\nSavings plan sows not match with the list.");

                break;
                case 2:
                //System.out.println("Enter the name of the Member:   ");
                //m2.name = sc.next();
                System.out.println("Welcome  "+m2.name);
                System.out.println("Enter the salary of the Member:   ");
                    try {
                        m2.salary = sc.nextDouble();
                    }
                    catch (InputMismatchException n){
                        System.out.println("you Entered a wrong input type...\n Enter only integer type");
                    }
                System.out.println("Plan 1 -- 15000\n" +
                        "Plan 2 -- 22000\n" +
                        "Plan 3 -- 5500\n" +
                        "Plan 4 -- 18500\n" +
                        "Plan 5 -- 11000");
                System.out.println("Enter your Savings Plan");
                    temp = sc.nextDouble();
                    if (temp==15000 || temp==22000 || temp==5500 || temp==18500 || temp==11000 ){
                        m2.saving_plan=temp;

                    }
                    else
                        System.out.println("Oops... error occured...\nSavings plan sows not match with the list.");
                break;
                case 3:
                //System.out.println("Enter the name of the Member:   ");
                //m3.name = sc.next();
                System.out.println("Welcome  "+m3.name);
                System.out.println("Enter the salary of the Member:   ");
                    try {
                        m3.salary = sc.nextDouble();
                    }
                    catch (InputMismatchException n){
                        System.out.println("you Entered a wrong input type...\n Enter only integer type");
                    }
                System.out.println("Plan 1 -- 15000\n" +
                        "Plan 2 -- 22000\n" +
                        "Plan 3 -- 5500\n" +
                        "Plan 4 -- 18500\n" +
                        "Plan 5 -- 11000");
                System.out.println("Enter your Savings Plan");
                    temp = sc.nextDouble();
                    if (temp==15000 || temp==22000 || temp==5500 || temp==18500 || temp==11000 ){
                        m3.saving_plan=temp;

                    }
                    else
                        System.out.println("Oops... error occured...\nSavings plan sows not match with the list.");
                break;
                default:
                    System.out.println("sorry user id does not esxist");

            }



    }

    void get_fund(){

        if((m1.salary-m1.saving_plan)>=(m1.salary*.4)){
            System.out.println("Congratulations you have successfully paid your monthly contribution.  "+m1.name);
            m1.contribution=m1.salary*.4;
            System.out.println("Your contribution is:   "+m1.contribution);
        }
        else if ((m1.salary-m1.saving_plan)<(m1.salary*.4)){
            System.out.println("you have not paid your monthly contribution.  "+m1.name);
            m1.contribution=(m1.salary-m1.saving_plan);
            System.out.println("Your contribution is:   "+m1.contribution);
            System.out.println("kindly write your reason why you are unable to contribute");
            String str=ss.nextLine();
            try {
                File myObj1 = new File("Member_Justification.txt");
                FileWriter myWriter1 = new FileWriter("Member_Justification.txt");
                myWriter1.write(str);
                myWriter1.close();
                //System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                //e.printStackTrace();
            }
        }
        else
            System.out.println("Invalid Enrtry");

        if((m2.salary-m2.saving_plan)>=(m2.salary*.4)){
            System.out.println("Congratulations you have successfully paid your monthly contribution.  "+m2.name);
            m2.contribution=m2.salary*.4;
            System.out.println("Your contribution is:   "+m2.contribution);
        }
        else if ((m2.salary-m2.saving_plan)<(m2.salary*.4)){
            System.out.println("you have not paid your monthly contribution.  "+m2.name);
            m2.contribution=(m2.salary-m2.saving_plan);
            System.out.println("Your contribution is:   "+m2.contribution);
            System.out.println("kindly write your reason why you are unable to contribute");
            String str=ss.nextLine();
            try {
                File myObj1 = new File("Member_Justification.txt");
                FileWriter myWriter1 = new FileWriter("Member_Justification.txt");
                myWriter1.write(str);
                myWriter1.close();
                //System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                //e.printStackTrace();
            }
        }
        else
            System.out.println("Invalid Enrtry");

        if((m3.salary-m3.saving_plan)>=(m3.salary*.4)){
            System.out.println("Congratulations you have successfully paid your monthly contribution.  "+m3.name);
            m3.contribution=m3.salary*.4;
            System.out.println("Your contribution is:   "+m3.contribution);
        }
        else if ((m3.salary-m3.saving_plan)<(m3.salary*.4)){
            System.out.println("you have not paid your monthly contribution.");
            m3.contribution=(m3.salary-m3.saving_plan);
            System.out.println("Your contribution is:   "+m3.contribution);
            System.out.println("kindly write your reason why you are unable to contribute  "+m3.name);
            String str=ss.nextLine();
            try {
                File myObj1 = new File("Member_Justification.txt");
                FileWriter myWriter1 = new FileWriter("Member_Justification.txt");
                myWriter1.write(str);
                myWriter1.close();
                //System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                //e.printStackTrace();
            }
        }
        else
            System.out.println("Invalid Enrtry");

        fund=m1.contribution+m2.contribution+m3.contribution;

        /*try {
            File myObj1 = new File("Member_Justification.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } */

    }

}

class calculate extends Home{

    double total_bill=0;

    Scanner s1 = new Scanner(System.in);

    void get_bill(){
        System.out.println("Dear Member enter Electricty bill");
        electricity_bill=s1.nextDouble();
        System.out.println("Dear Member enter Telliphone bill");
        telephone_bill=s1.nextDouble();
        System.out.println("Dear Member enter Grocery bill");
        grocery_bill=s1.nextDouble();
        total_bill=electricity_bill+telephone_bill+grocery_bill;

        System.out.println("This month total Home Expences is:  "+total_bill);
        if (total_bill<=fund){
            System.out.println("Home expences is fully adjusted no aditional funding required");
            System.out.println("Extra savings for this month is:  "+(fund-total_bill));
        }
        else{
            System.out.println("total funding is not enough for paying all expenses\n required aditional support");
            System.out.println("More funding requried Rs. "+(total_bill-fund));
        }
        System.out.println("Here is the Name and message of member who could not carry full contributiojn");

        if ((m1.salary-m1.saving_plan)<(m1.salary*.4)){
            System.out.println(m1.name+"\n");
        }
        if ((m2.salary-m2.saving_plan)<(m2.salary*.4)){
            System.out.println(m2.name+"\n");
        }
        if ((m3.salary-m3.saving_plan)<(m3.salary*.4)){
            System.out.println(m3.name+"\n");
        }
        
        try {
            File myObj1 = new File("Member_Justification.txt");
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


    // void calculate_data{
    //}
}

public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO HOME MANAGEMENT SYSTEM");
        calculate C = new calculate();
        for(int i=0;i<3;i++){
        C.get_member();
        }

        C.get_fund();
        C.get_bill();



    }
}