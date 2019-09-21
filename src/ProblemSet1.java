/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {
    
    public static void main(String[] args) {
        
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        
        double length = 25.4 * 8.5;
		double width = 25.4 * 11;
		double area = length*width;
		System.out.println((Math.round(area))+" square millimeters\n");

        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        double len = 2.54 * 8.5;
		double wid = 2.54 * 11;
		double per = 2 * (len + wid);
		System.out.println((Math.round(per))+" centimeters\n");
        
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        double l = 8.5;
		double w = 11;
		double diagonal = Math.sqrt((l * l) + (w * w));
		System.out.println((Math.round(diagonal))+" inches\n");
        

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        double homeworkWorth = 0.15;
		double quizWorth = 0.35;
		double testWorth = 0.50;
        
		double homework1 = 88;
        double homework2 = 91;
        double homework3 = 0;
        double quiz1 = 84;
        double quiz2 = 89;
        double quiz3 = 93;
        double test1 = 74;
        double test2 = 87;
        double test3 = 82;
		
		double homeworkWeight1 = homework1 * homeworkWorth;
        double homeworkWeight2 = homework2 * homeworkWorth;
        double homeworkWeight3 = homework3 * homeworkWorth;
        double quizWeight1 = quiz1 * quizWorth;
        double quizWeight2 = quiz2 * quizWorth;
        double quizWeight3 = quiz3 * quizWorth;
        double testWeight1 = test1 * testWorth;
        double testWeight2 = test2 * testWorth;
        double testWeight3 = test3 * testWorth;
		
		double homeworkAvg = (homeworkWeight1 + homeworkWeight2 + homeworkWeight3)/3;
		double quizAvg = (quizWeight1 + quizWeight2 + quizWeight3)/3;
		double testAvg = (testWeight1 + testWeight2 + testWeight3)/3;
		
		double Percentage = (Math.round(homeworkAvg + quizAvg + testAvg));
		
		System.out.println(Percentage + "%.\n");
		
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
		double monHours = 7.5;
		double tuesHours = 8;
		double wednesHours = 10.5;
		double thursHours = 9.5;
		double friHours = 6;
		double satHours = 11.5;
		double sunHours = 0;
        
        double monPay = monHours * 12.50;
		double tuesPay = tuesHours * 12.50;
		double wednesPay = wednesHours * 12.50;
		double thursPay = thursHours * 12.50;
		double friPay = friHours * 12.50;
		double satPay = satHours * 12.50;
		double sunPay = sunHours * 12.50;
		
		double totalPay = monPay + tuesPay + wednesPay + thursPay + friPay + satPay + sunPay;
		
		System.out.println("$"+ (Math.round(totalPay))"\n");
		
		
		
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
            double yearlyPay = 117000;
    double monthlyPay = yearlyPay / 12;
    double biweeklyPay = monthlyPay / 2;
    double federalTax = 0.24;
    double stateTax = 0.0637;
    double preTax = 0.07;

    double biweeklyFederal = biweeklyPay * federalTax;
    double biFed = biweeklyPay - biweeklyFederal;
    double biweeklyState = biFed * stateTax;
    double biState = biFed - biweeklyState;
    double biweeklyPre = biState * preTax;
    double biweeklyTotal = biState - biweeklyPre;

    System.out.println("\n$"+ (Math.round(biweeklyTotal)));
         
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
      double students = 273;
      double teachers = 28;
      double totalPeople = students + teachers;
      double busCapacity = 54;
      double remainderOfPeople = totalPeople % busCapacity;
      double amountofPeople = totalPeople - remainderOfPeople;
      double numberOfBuses = (amountofPeople / busCapacity) + 1;

      System.out.println("\n" + numberOfBuses + " buses are needed, with " + remainderOfPeople + " passengers on the last bus.");
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */

      double boardLength = 48;
      double boardWidth = 24;
      double boardArea = boardLength * boardWidth;
      double holeDiameter = 6;
      double holeRadius = holeDiameter/2;
      double holeArea = Math.pow(holeRadius, 2) * 3.14;
      double surfaceArea = boardArea - holeArea;

      System.out.println("\n" + (Math.round(surfaceArea)) + " square inches.");
        
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
      boolean isLeapYear;
      double year =
      // divisible by 4
      isLeapYear = (year % 4 == 0);
      // divisible by 4 and not 100
      isLeapYear = isLeapYear && (year % 100 != 0);
      // divisible by 4 and not 100 unless divisible by 400
      isLeapYear = isLeapYear || (year % 400 == 0);

      System.out.println(isLeapYear);
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}