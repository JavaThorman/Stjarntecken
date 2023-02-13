import java.util.Scanner;

public class Stjarntecken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayBorn;
        int monthBorn;

        System.out.println("Ange födelsedag");
        dayBorn = input.nextInt();

        System.out.println("Ange födelsemånad (endast siffror)");
        monthBorn = input.nextInt();


        if (monthBorn == 12 && dayBorn >= 22 || monthBorn == 1 && dayBorn <=20) {
            System.out.println("Ditt stjärntecken är Stenbocken!");
        }
        if (monthBorn == 1 && dayBorn >= 21 || monthBorn == 2 && dayBorn <=19) {
            System.out.println("Ditt stjärntecken är Vattumannen!");
        }
        if (monthBorn == 2 && dayBorn >= 20 || monthBorn == 3 && dayBorn <=20) {
            System.out.println("Ditt stjärntecken är Fiskarna!");
        }
            if (monthBorn == 3 && dayBorn >= 21 || monthBorn == 4 && dayBorn <=20) {
                System.out.println("Ditt stjärntecken är Väderuren!");
            }
            if (monthBorn == 4 && dayBorn >= 21 || monthBorn == 5 && dayBorn <=21) {
                System.out.println("Ditt stjärntecken är Oxen!");
            }
            if (monthBorn == 5 && dayBorn >= 22 || monthBorn == 6 && dayBorn <=21) {
                System.out.println("Ditt stjärntecken är Tvillingarna!");
            }
            if (monthBorn == 6 && dayBorn >= 22 || monthBorn == 7 && dayBorn <=22) {
                System.out.println("Ditt stjärntecken är Kräftan!");
            }
            if (monthBorn == 7 && dayBorn >= 23 || monthBorn == 8 && dayBorn <=22) {
                System.out.println("Ditt stjärntecken är Lejonet!");
            }
            if (monthBorn == 8 && dayBorn >= 23 || monthBorn == 9 && dayBorn <=22) {
                System.out.println("Ditt stjärntecken är Jungfrun!");
            }
            if (monthBorn == 9 && dayBorn >= 23 || monthBorn == 10 && dayBorn <=22) {
                System.out.println("Ditt stjärntecken är Vågen!");
            }
                if (monthBorn == 10 && dayBorn >= 23 || monthBorn == 11 && dayBorn <=22) {
                    System.out.println("Ditt stjärntecken är Skorpionen!");
                }
                    if (monthBorn == 11 && dayBorn >= 22 || monthBorn == 12 && dayBorn <=21) {
                        System.out.println("Ditt stjärntecken är Skytten!");
                    }
                }
            }


