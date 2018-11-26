package dayofadate;

import java.util.Scanner;

public class DayOfADate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Which century do you want to check? (Accepted only 18th - 25th century): ");
        int k = s.nextInt();
        if(k == 20 & k == 24){
        System.out.println("Enter the Date: ");
        int d = s.nextInt();
        System.out.println("Enter the month(1 = Jan, 2 = Feb, ...., 12 = Dec)(Only Numbers Accepted): ");
        int m = s.nextInt();
        System.out.print("Enter the Last two digits in the year: 19");
        int y = s.nextInt();
        int l = y/4;
        if(m == 1){
            int b = y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 2){
            int b = y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 3){
            int b = y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 4){
            int b = y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 5){
            int b = y+l+2+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 6){
            int b = y+l+5+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 7){
            int b = y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 8){
            int b = y+l+3+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 9){
            int b = y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 10){
            int b = y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 11){
            int b = y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 12){
            int b = y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
    }
        if(k == 18 && k == 22){
        System.out.println("Enter the Date: ");
        int d = s.nextInt();
        System.out.println("Enter the month(1 = Jan, 2 = Feb, ...., 12 = Dec)(Only Numbers Accepted): ");
        int m = s.nextInt();
        System.out.print("Enter the Last two digits in the year: 19");
        int y = s.nextInt();
        int l = y/4;
        if(m == 1){
            int b = 4+y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 2){
            int b = 4+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 3){
            int b = 4+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 4){
            int b = 4+y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 5){
            int b = 4+y+l+2+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 6){
            int b = 4+y+l+5+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 7){
            int b = 4+y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 8){
            int b = 4+y+l+3+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 9){
            int b = 4+y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 10){
            int b = 4+y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 11){
            int b = 4+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 12){
            int b = 4+y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
    }
    if(k == 19 && k == 23){
        System.out.println("Enter the Date: ");
        int d = s.nextInt();
        System.out.println("Enter the month(1 = Jan, 2 = Feb, ...., 12 = Dec)(Only Numbers Accepted): ");
        int m = s.nextInt();
        System.out.print("Enter the Last two digits in the year: 19");
        int y = s.nextInt();
        int l = y/4;
        if(m == 1){
            int b = 2+y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 2){
            int b = 2+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 3){
            int b = 2+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 4){
            int b = 2+y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 5){
            int b = 2+y+l+2+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 6){
            int b = 2+y+l+5+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 7){
            int b = 2+y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 8){
            int b = 2+y+l+3+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 9){
            int b = 2+y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 10){
            int b = 2+y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 11){
            int b = 2+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 12){
            int b = 2+y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
    }
    if(k == 21 && k == 25){
        System.out.println("Enter the Date: ");
        int d = s.nextInt();
        System.out.println("Enter the month(1 = Jan, 2 = Feb, ...., 12 = Dec)(Only Numbers Accepted): ");
        int m = s.nextInt();
        System.out.print("Enter the Last two digits in the year: 19");
        int y = s.nextInt();
        int l = y/4;
        if(m == 1){
            int b = 6+y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 2){
            int b = 6+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 3){
            int b = 6+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 4){
            int b = 6+y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 5){
            int b = 6+y+l+2+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 6){
            int b = 6+y+l+5+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 7){
            int b = 6+y+l+0+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 8){
            int b = 6+y+l+3+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 9){
            int b = 6+y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 10){
            int b = 6+y+l+1+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 11){
            int b = 6+y+l+4+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
        if(m == 12){
            int b = 6+y+l+6+d;
            int n = b % 7;
            if(n == 1){
                System.out.println("Sunday");
            }
            else if(n == 2){
                System.out.println("Monday");
            }
            else if(n == 3){
                System.out.println("Tuesday");
            }
            else if(n == 4){
                System.out.println("Wednesday");
            }
            else if(n == 5){
                System.out.println("Thusday");
            }
            else if(n == 6){
                System.out.println("Friday");
            }
            else if(n == 7){
                System.out.println("Saturday");
            }
        }
    }
    }
    
}
