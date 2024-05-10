import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to AccioJob Simple Calculator");
        System.out.println("Enter Your First number");
        int firstNumber=input.nextInt();// 7
        System.out.println("Enter Your Second number");
        int secondNumber=input.nextInt();
        System.out.println("press 1 for Addition");
        System.out.println("press 2 for Division");
        System.out.println("press 3 for Substraction");
        System.out.println("press 4 for Multiplication");
        System.out.println("press 5 for Reminder");

        int userInput=input.nextInt();

        switch(userInput) {
            case 1:
                System.out.println("After Adding your numbers, your answer is: "+(firstNumber+secondNumber));
                break;
            case 2:
                System.out.println("After Dividing your numbers, your answer is: "+(firstNumber/secondNumber));
                break;
            case 3:
                System.out.println("After Substracting  your numbers, your answer is: "+ (firstNumber-secondNumber));
                break;
            case 4:
                System.out.println("After Multiplying your numbers, your answer is: "+(firstNumber*secondNumber));
                break;
            default:
                System.out.println("After Division your numbers, your reminder is: "+(firstNumber%secondNumber));

        }










//        if(userInput==1)
//        {
//            System.out.println("After Adding your numbers, your answer is: "+(firstNumber+secondNumber));
//        }else if(userInput==2)
//        {
//            System.out.println("After Dividing your numbers, your answer is: "+(firstNumber/secondNumber));
//        }else if(userInput==3)
//        {
//            System.out.println("After Substracting  your numbers, your answer is: "+ (firstNumber-secondNumber));
//        }else if(userInput==4)
//        {
//            System.out.println("After Multiplying your numbers, your answer is: "+(firstNumber*secondNumber));
//        }else {
//            System.out.println("After Division your numbers, your reminder is: "+(firstNumber%secondNumber));
//        }




















//        if(Day==1)
//        {
//            System.out.println("Weekend");
//        }else if(Day==7){
//            System.out.println("Weekend");
//        }else{
//            System.out.println("Week Days");
//        }





//        if(Day==1)
//        {
//            System.out.println("Sunday");
//        }else if(Day==2)
//        {
//            System.out.println("Monday");
//        }else if(Day==3)
//        {
//            System.out.println("Tuesday");
//        }else if(Day==4)
//        {
//            System.out.println("Wednesday");
//        }else if(Day==5)
//        {
//            System.out.println("Thursday");
//        }else if(Day==6)
//        {
//            System.out.println("Friday");
//        }
//        else if(Day==7)
//        {
//            System.out.println("Saturday");
//        }




//        int wakeUpTime=input.nextInt();
//        if(wakeUpTime<=8)
//        {
//            System.out.println("Take bath");
//        }
//
//        if(wakeUpTime>8)
//        {
//            System.out.println("Do Not take Bath");
//        }
    }

}
