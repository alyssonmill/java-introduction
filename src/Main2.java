import java.time.LocalDate;
public class Main2 {

    public static void main(String[] args) {

        String userName = "Alysson";
        int userAge = 21;
        float userHeight = 1.75f; //it must have "f" at the very end"
        int userWeigth = 60;
        LocalDate currentDate = LocalDate.now();

        int userYear;
        float userBmi;

        int currentYear = currentDate.getYear();
        userYear = currentYear - userAge;
        userBmi = userWeigth / (userHeight * userHeight);



        System.out.println("This is the user name: " + userName);
        System.out.println("This is the user age: " + userAge);
        System.out.println("This is the user Height: " + userHeight);
        System.out.println("This is the user Weigth: " + userWeigth + "KG");
        System.out.println("This is the user year of boarn: " + userYear);
    }
}



