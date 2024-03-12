/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//package
package pt3;

//import
import java.util.Scanner;
import java.io.*;
import java.lang.Thread;

/**
 *
 * @author Rance Lander L. Pilapil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        //introduction
        println("Hello User! please !");


        //design on scanner
        String[] descriptionthing = {
            "\n📃 here's the list of the Hotel Code 📃"
            + "\nO=============O===============O"
            + "\n| Hotel Code  |   Hotel Name  |"
            + "\nO=============O===============O"
            + "\n|      1      | InSugar Hotel |"
            + "\n|      2      | Butong  Hotel |"
            + "\n|      3      | Apo New Hotel |"
            + "\nO=============O===============O",
            "\n📃 here's the list of the Guide Code 📃"
            + "\nO============O===============O==========O"
            + "\n| Guide Code |   Guide Name  | Rate/Day |"
            + "\nO============O===============O==========O"
            + "\n|     1      |   Jane Bond   |  1106.00 |"
            + "\n|     2      |  Sylvie Rambo |  930.90  |"
            + "\n|     3      |  Diega Silang |  920.30  |"
            + "\n|     4      |  Sabel Lopez  |  1107.00 |"
            + "\nO============O===============O==========O",
            "O=====================O"
            + "|                     |"
            + "|                     |"
            + "|                     |"
            + "O=====================O"//unused
        };


        //Prevention and while
        boolean OnWhile = true;

        //get Tourist Name
        String TouristName = "";

        while (OnWhile) {
            print("\n⚠ Your Name must contain 2-20 only... ️⚠️"
                    + "\nPlease Enter your Tourist Name : ");
            try {
                String getstring = scanner.nextLine();

                if (getstring.length() < 2) {
                    println("\n⚠your Name must Contain more than 2 characters!");
                } else if (getstring.length() > 20) {
                    println("\n⚠your Name must Contain less than 20 characters!");
                } else {
                    OnWhile = false;
                    TouristName = getstring;
                }


            } catch (Exception e) {
                println("\n⚠️Please Enter your Tourist Name Properly!!!");
            }
            //scanner.nextLine();
        }

        //◙▮■■■▬

        OnWhile = true;

        //get Hotel Code
        int HotelCode = 0;
        clearscreen();

        while (OnWhile) {
            print(descriptionthing[0]
                    + "\nPlease Enter your Hotel Code ( must be 1 to 3 only ) : ");
            try {
                int getint = scanner.nextInt();

                if (getint < 1 || getint > 3) {
                    clearscreen();
                    println("\n⚠Please Enter your Hotel Code Properly!!!");
                } else {
                    OnWhile = false;
                    HotelCode = getint;
                }


            } catch (Exception e) {
                clearscreen();
                println("\n⚠Please Enter your Hotel Code Properly!!!");
            }
            scanner.nextLine();
        }


        OnWhile = true;

        //get Guide Code
        int GuideCode = 0;
        clearscreen();

        while (OnWhile) {
            print(descriptionthing[1]
                    + "\nPlease Enter your Guide Code ( must be 1 to 4 only ) : ");
            try {
                int getint = scanner.nextInt();

                if (getint < 1 || getint > 4) {
                    clearscreen();
                    println("\n⚠Please Enter your Guide Code Properly!!!");
                } else {
                    OnWhile = false;
                    GuideCode = getint;
                }


            } catch (Exception e) {
                clearscreen();
                println("\n⚠Please Enter your Guide Code Properly!!!");
            }
            scanner.nextLine();
        }


        OnWhile = true;

        //get Guide Code
        int TourDays = 0;
        clearscreen();

        while (OnWhile) {
            print(""
                    + "\nPlease Enter your Tour Days ( you can only select between 3 to 9 ) : ");
            try {
                int getint = scanner.nextInt();

                if (getint < 3 || getint > 9) {
                    clearscreen();
                    println("\n⚠Please Enter your Tour Days Properly!!!");
                } else {
                    OnWhile = false;
                    TourDays = getint;
                }


            } catch (Exception e) {
                clearscreen();
                println("\n⚠Please Enter your Tour Days Properly!!!");
            }
            scanner.nextLine();
        }



        //===============[ getting the result's ]==============================

        String GuideName = "";
        double RatePerDay = 0;
        
        String[] HotelName = { "InSugar Hotel", "Butong Hotel", "Apo New Hotel"};

        switch (GuideCode) {
            case 1:
                GuideName = "Jane Bond";
                RatePerDay = 1106.00;
                break;
            case 2:
                GuideName = "Sylvie Rambo";
                RatePerDay = 930.90;
                break;
            case 3:
                GuideName = "Diega Silang";
                RatePerDay = 920.30;
                break;
            case 4:
                GuideName = "Sabel Lopez";
                RatePerDay = 1107.00;
        }

        double TotalFee = RatePerDay * TourDays;
        
        
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
            "\n|              ‖(   Hotel TOUR  )‖              |",
            "\n|                                              |",
            "\n|      Tourist Name     : " + DesignSpace(TouristName, 20) + " |",
            "\n|      Hotel            : " + DesignSpace(HotelName[HotelCode-1], 20) + " |",
            "\n|      Guide Name       : " + DesignSpace(GuideName, 20) + " |",
            "\n|     ------------------------------------     |",
            "\n|                                              |",
            "\n|      Tour Days        : " + DesignSpace(TourDays+" Days", 20) + " |",
            "\n|      Rate per Day     : " + DesignSpace("₱"+Double.toString(RatePerDay), 20) + " |",
            "\n|                                              |",
            "\n|      Total Fee        : " + DesignSpace("₱"+Double.toString(TotalFee), 20) + " |",
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
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}