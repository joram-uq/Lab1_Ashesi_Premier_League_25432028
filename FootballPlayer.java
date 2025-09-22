import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        final double pound = 0.45359237;
        final int meter = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Player Name: ");
        name = input.nextLine()  ;
        System.out.print("Player Age: " ) ;
        age = input.nextInt();
        System.out.println("Player Height in cm: ");
         height = input.nextDouble();
        System.out.println("Player Weight in lbs: ");
         weight = input.nextDouble();
        System.out.println("Jersey Number: ");
        jersey_number = input.nextInt();
        System.out.println("Player Name - " + name);
        System.out.println("Player Age - " + age);
        System.out.println("Player Height - " + height);
        System.out.println("Player Weight - " + weight);
        System.out.println("Jersey Number - " + jersey_number);
        //Task 2
        double   weight_kilogram = (int) weight * pound;
        int height_centimeter = (int) (meter * height) ;

        double roundedkilogram = (int) (weight_kilogram);
        System.out.println("Player Name:  " + name);
        System.out.println("Player Age: " + age);
        System.out.println("Player Height:  " + height_centimeter + "cm");
        System.out.println("Player Weight:  " + roundedkilogram + "kg");
        System.out.println("Jersey Number:  " + jersey_number);
        System.out.println();

        // Task 3
        age++;
        jersey_number--;
        System.out.println("Player New Age:  " + age);
        System.out.println("Player New Jersey Number:  " + jersey_number);

        //Task 4
        boolean IsEligible = (age >= 18 && age <= 35 &&  roundedkilogram < 90);
        if (!IsEligible) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }

        //b
        if (age < 18 || roundedkilogram >= 90) {
            System.out.println("Player has a problem (either too young or too heavy).");
        }

        //Task 5
        if (age < 20) {
            System.out.println("Rising Star");
        }
        else if (age <=30) {
            System.out.println("Prime Player");
        }
        else  {
            System.out.println("Veteran");
        }

        //Task 6  using switch case
        switch(jersey_number) {
            case 1: System.out.println("Goalkeeper"); break;
            case 2: System.out.println("defender"); break;
            case 5: System.out.println("defender"); break;
            case 6: System.out.println("midfielder"); break;
            case 8: System.out.println("midfielder"); break;
            case 7: System.out.println("Winger"); break;
            case 11: System.out.println("Winger"); break;
            case 9: System.out.println("Striker"); break;
            case 10: System.out.println("Playmaker"); break;
            default: System.out.println("Player position not known");
        }




        //Task 7a (Unwanted fall-through)
        switch(jersey_number) {
            case 1: System.out.println("Goalkeeper"); break;
            case 2: System.out.println("defender");
            case 5: System.out.println("defender"); break;
            case 6: System.out.println("midfielder");
            case 8: System.out.println("midfielder"); break;
            case 7: System.out.println("Winger");
            case 11: System.out.println("Winger"); break;
            case 9: System.out.println("Striker"); break;
            case 10: System.out.println("Playmaker"); break;
            default: System.out.println("Player position not known");

        }


        //7b
        switch(jersey_number) {
            case 1: System.out.println("Goalkeeper"); break;
            case 2:
            case 5:
                System.out.println("defender"); break;
            case 6:
            case 8:
                System.out.println("midfielder"); break;
            case 7:
            case 11:
                System.out.println("Winger"); break;
            case 9: System.out.println("Striker"); break;
            case 10: System.out.println("Playmaker"); break;
            default: System.out.println("Player position not known");
        }

        //Task 8
        if (age <= 30) {
            if (roundedkilogram < 80) {
                System.out.println("Player is in the starting lineup");
            }
            else {
                System.out.println("Player in on the bench");
            }
        }

        //Tsk 9
        String final_decision = IsEligible ? "Play" : "Rest";
        System.out.println("Final Decision: " + final_decision);

        // Attackers jersey number
        boolean Attacker_jersey = ( jersey_number == 7 || jersey_number == 9 || jersey_number == 10 || jersey_number == 11);

        // category
        String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }

        //position
        String position = switch (jersey_number) {
            case 1 -> "Goalkeeper";
            case 2, 5 -> "Defender";
            case 6, 8 -> "Midfielder";
            case 7, 11 -> "Winger";
            case 9 -> "Striker";
            case 10 -> "Playmaker";
            default -> "Player position not known";
        };

        // Line_up_decision
        String line_up_decision;
        if (age <= 30) {
            if (roundedkilogram < 80) {
                line_up_decision = "Starting Lineup";
            } else {
                line_up_decision = "On the Bench";
            }
        } else {
            line_up_decision = "Not Considered";
        }
        System.out.println(line_up_decision);



        //Task 10 - for the unwanted fall-through it is question 7a
        System.out.println("Player Report");
        System.out.println("Player: " + name);
        System.out.println(" Age: " + age + "(" + category + ")");
        System.out.println(" Height: " + height + " cm ");
        System.out.println("Weight: " + roundedkilogram + " kg");
        System.out.println("Jersey: " +  jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + (Attacker_jersey ? "Yes" : "No"));
        System.out.println("Eligibility: " + (IsEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + line_up_decision );
        System.out.println("Final Decision: " + final_decision);

    }
}