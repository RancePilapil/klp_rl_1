/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//package
package activity4shit;

//import
import java.util.Scanner;



/**
 *
 * @author klp
 */
public class Activity4SHIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);
        
        //introduction
        println("Hello User! please insert the requirements for your Job!");
        
        
        //design
        String[] descriptionthing = {
            "\n📃 here's the list of Hotel Code 📃"
            + "\nO===========O============O===========O"
            + "\n| Dept Code | Department | Pct Bonus |"
            + "\nO===========O============O===========O"
            + "\n|     1     | Accounting |    85%    |"
            + "\n|     2     |    Sales   |    72%    |"
            + "\n|     3     |  Personnel |    50%    |"
            + "\n|     4     |   Finance  |    90%    |"
            + "\nO===========O============O===========O",
            "\n📃 here. You just need to pick a month from 1 to 12 📃"
            + "\nO===============O"
            + "\n| 1 Jan  7 Jul  |"
            + "\n| 2 Feb  8 Aug  |"
            + "\n| 3 Mar  9 Sep  |"
            + "\n| 4 Apr  10 Oct |"
            + "\n| 5 May  11 Nov |"
            + "\n| 6 Jun  12 Dec |"
            + "\nO===============O",
            "O=====================O"
            + "|                     |"
            + "|                     |"
            + "|                     |"
            + "O=====================O"//unused
        };
        
        
        //Prevention and while
        boolean OnWhile = true;
        
        //get Employee Name
        String EmployeeName = "";
        
        while (OnWhile) {
            print("\n⚠ Your Name must contain 2-20 only... ️⚠️"
                    + "\nPlease Enter your Employee Name : ");
            try {
                String getstring = scanner.nextLine();
                
                if (getstring.length() < 2) {
                    println("\n⚠your Name must Contain more than 2 characters!");
                } else if (getstring.length() > 20) {
                    println("\n⚠your Name must Contain less than 20 characters!");
                } else {
                    OnWhile = false;
                    EmployeeName = getstring;
                }
                
                
            } catch (Exception e) {
                println("\n⚠️Please Enter your Employee Name Properly!!!");
            }
            //scanner.nextLine();
        }
        
        //◙▮■■■▬
        
        OnWhile = true;
        
        //get Department Code
        int DepartmentCode = 0;
        
        while (OnWhile) {
            print(descriptionthing[0]
                    + "\nPlease Enter your Department Code ( must be 1 to 4 only ) : ");
            try {
                int getint = scanner.nextInt();
                
                if (getint < 1 || getint > 4) {
                    println("\n⚠Please Enter your Department Code Properly!!!");
                } else {
                    OnWhile = false;
                    DepartmentCode = getint;
                }
                
                
            } catch (Exception e) {
                println("\n⚠Please Enter your Department Code Properly!!!");
            }
            scanner.nextLine();
        }
        
        
        OnWhile = true;
        
        //get Month Code
        int MonthCode = 0;
        
        while (OnWhile) {
            print(descriptionthing[1]
                    + "\nPlease Enter your Month Code ( must be 1 to 12 only ) : ");
            try {
                int getint = scanner.nextInt();
                
                if (getint < 1 || getint > 12) {
                    println("\n⚠Please Enter your Month Code Properly!!!");
                } else {
                    OnWhile = false;
                    MonthCode = getint;
                }
                
                
            } catch (Exception e) {
                println("\n⚠Please Enter your Month Code Properly!!!");
            }
            scanner.nextLine();
        }
        
        
        OnWhile = true;
        
        //get Monthly Income
        double MonthlyIncome = 0;
        
        while (OnWhile) {
            print("\n\n⚠ your Monthly Income must be 1000.00 to 120000.00 only ⚠️"
                    + "\nPlease Enter your Monthly Income : ");
            try {
                double getint = scanner.nextInt();
                
                if (getint < 1000.00 || getint > 120000.00) {
                    println("\n⚠Please Enter your Monthly Income Properly!!!");
                } else {
                    OnWhile = false;
                    MonthlyIncome = getint;
                }
                
                
            } catch (Exception e) {
                println("\n⚠Please Enter your Monthly Income Properly!!!");
            }
            scanner.nextLine();
        }
        
        
        
        //===============[ getting the result's ]==============================
        
        
        switch (DepartmentCode) {
            case 1:
                break;
        }
        
        
        //===============[ output ]============================================
        /*
        int ie = 1000;
        for (int i = 0; i < 100000; i++ ) {
            if (i == ie) {
                println(GetString("printing... {0}%", i/1000));
                ie += 1000;
            }
        }
        */
        //System.out.close();
        
        
        String[] output = {
            "\nO==============================================O",
            "\n|                                              |",
            "\n|        ‖◤           e e e           ◥‖       |",
            "\n|                                              |",
            "\n|                                              |",
            "\n|      Employee Name    : " + DesignSpace(EmployeeName, 20) + " |",
            "\n|                                              |",
            "\nO==============================================O"
        };
        String resultoutput = "";
        for (String text : output) {
            resultoutput += text;
        }
        clearscreen();
        
        try {
            print("\nPrinting");
            Thread.sleep(800);
            print(".");
            Thread.sleep(800);
            print(".");
            Thread.sleep(800);
            print(".");
            Thread.sleep(800);
            clearscreen();
            for (int i =0;  i < output.length; i++) {
                Thread.sleep(400);
                print(output[i]);
            }
        }
        catch (Exception e) {
            println("\n something went wrong....");
        }
        
        println("\n\nHeres the result enjoy");
        
        
    }
    
    public static void print(Object o) {
        System.out.print(o);
    }
    public static void println(Object o) {
        System.out.println(o);
    }
    
    public static String GetString(String Text, Object... params) {
        String message = Text;
        
        int i = 0;
        for (Object obj : params) {
            String target = "{" + i + "}";
            i++;
            message = message.replace(target, obj.toString());
        }
        return message;
    }
    
    public static String DesignSpace(String Text, int totalspace) {
        String spaceresult = "";
        int spacecount = totalspace - Text.length();
        for (int i = 0; i < spacecount; i++) {
            spaceresult += " ";
        }
        return Text + spaceresult;
    }
    
    public static void clearscreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
}
