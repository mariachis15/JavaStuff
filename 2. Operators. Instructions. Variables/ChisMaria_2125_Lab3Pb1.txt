import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number or a string: ");
        String month = scanner.nextLine();
        if (month.matches(".*\\d.*")) {
            int monthAsInt = Integer.parseInt(month);
                switch (monthAsInt) {
                    case 1:
                        month = "January";
                        break;
                    case 2:
                        month = "February";
                        break;
                    case 3:
                        month = "March";
                        break;
                    case 4:
                        month = "April";
                        break;
                    case 5:
                        month = "May";
                        break;
                    case 6:
                        month = "June";
                        break;
                    case 7:
                        month = "July";
                        break;
                    case 8:
                        month = "August";
                        break;
                    case 9:
                        month = "September";
                        break;
                    case 10:
                        month = "October";
                        break;
                    case 11:
                        month = "November";
                        break;
                    case 12:
                        month = "December";
                        break;
                    default:
                        month = "Not a month!";
                        break;

            }
        } else {
            switch (month) {
                case "January":
                    month = String.valueOf(1);
                    break;
                case "February":
                    month = String.valueOf(2);
                    break;
                   case "March":
                        month = String.valueOf(3);
                        break;
                    case "April":
                        month = String.valueOf(4);
                        break;
                    case "May":
                        month = String.valueOf(5);
                        break;
                    case "June":
                        month = String.valueOf(6);
                        break;
                    case "July":
                        month = String.valueOf(7);
                        break;
                    case "August":
                        month = String.valueOf(8);
                        break;
                    case "September":
                        month = String.valueOf(9);
                        break;
                    case "October":
                        month = String.valueOf(10);
                        break;
                    case "November":
                        month = String.valueOf(11);
                        break;
                    case "December":
                        month = String.valueOf(12);
                        break;
                    default:
                        month = "Not a month!";
                        break;
            }
        }
        System.out.println(month);


    }
}






