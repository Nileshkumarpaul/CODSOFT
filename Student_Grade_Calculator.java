import java.util.Scanner;
public class Student_Grade_Calculator{
    public static void main(String[]args){
        Scanner S=new Scanner(System.in);
        System.out.println(" ***** Hello Codsoft ***** ");
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("ENTER THE NUMBER OF SUB");
        int nS=S.nextInt();
        int total=0;
        for(int i=0;i<nS;i++){
            System.out.println("Enter marks obtained in Sub "+(i+1)+ ": ");
            int marks=S.nextInt();
            total+=marks;
        }
        double averPer=(double)total/nS;
        char Grade;
        if(averPer>=90){
            Grade='O';
        }
        else if(averPer>=80){
            Grade='E';
        }
        else if(averPer>=70){
            Grade='A';
        }
        else if(averPer>=60){
            Grade='B';
        }
        else if(averPer>=50){
            Grade='C';
        }
            else if(averPer>=40){
            Grade='D';
        }
            else{
            Grade='F';
        }
        System.out.println("Total Marks Scored is "+total);
        System.out.println("Average Percentage Grade is "+averPer+"%");
        System.out.println("Grade: "+Grade);
    }
}