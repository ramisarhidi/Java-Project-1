import java.util.Scanner ;

public class TestBMI
{
    private static double bmi;
    private String name_1;
    private double height_1;
    private double weight_1;

    public TestBMI(){

    } ;

    public static void main( String[] args){
        TestBMI person_1 = new TestBMI() ;
        String name_1 = "John Doe" ;
        int yearofBirth_1 = 1991 ;
        double height_1 = 1.26 ;
        double weight_1 = 123.45 ;

        // mutator method setting private members to a default person
        person_1.setName(name_1);
        person_1.setyearofBirth(yearofBirth_1);
        person_1.setHeight(height_1);
        person_1.setWeight(weight_1);

        String name_2 ;
        int yearofBirth_2 ;
        double height_2 ;
        double weight_2  ;

        Scanner input = new Scanner(System.in) ;

        System.out.printf("%20s" , "Enter Name: " )  ;
        name_2 = input.nextLine() ;

        System.out.printf("%20s" , "Enter Year of Birth: " )  ;
        yearofBirth_2 = input.nextInt() ;

        System.out.printf("%20s" , "Enter Height: " )  ;
        height_2 = input.nextDouble() ;

        System.out.printf("%20s" , "Enter Weight: " )  ;
        weight_2 = input.nextDouble() ;

        PersonInfo person_2 = new PersonInfo(name_2, yearofBirth_2,height_2, weight_2) ;

        System.out.printf("%16s%s%n", "Full Name: ", person_2.getName());

        System.out.printf("%16s%d%n", "Age: ",person_2.calculateAge());

        System.out.printf("%16s%.2f%n", "Height in Meters: ", person_2.getHeight());

        System.out.printf("%16s%.2f%n", "Weight in Kilograms: ", person_2.getWeight());

        System.out.printf("%16s%s%n", "Classification: ", classifyBMI(person_2.calculateBMI()));

        input.close() ;

    }

    private void setWeight(double weight_1) {
        this.weight_1 = weight_1;
    }

    private void setHeight(double height_1) {
        this.height_1 = height_1;
    }

    private void setyearofBirth(int yearofBirth_1) {
    }

    private void setName(String name_1) {
        this.name_1 = name_1;
    }

    public static String classifyBMI(double BMI) {
        bmi = BMI;
        if(bmi < 18.5) {
            return "Underweight";
        } else if(bmi >= 18.5 && bmi < 25.0) {
            return "Normal Weight";
        } else if(bmi >= 25.0 && bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

}