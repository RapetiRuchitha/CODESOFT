import java.util.Scanner;
public class StudentGrade {
    public static void main(String []args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        n= s.nextInt();
        int marks[] = new int[n];
        int i;
        float total=0,avg,avgPer;
       

        for(i=0;i<n;i++){

            System.out.println("Enter marks of subject "+(i+1)+" :");
            marks[i] = s.nextInt();
            total+=marks[i];
        }
        s.close();
        //calculate the average of marks
        avg=total/n;
        System.out.println("************************");
        System.out.println("Total marks obtained : "+total);
        System.out.println();

        //calcutate the average percentage of marks
        avgPer =(total/(n*100))*100;
        System.out.println("************************");

        System.out.println("Average percentage : "+avgPer);
        System.out.println();

        System.out.println("************************");

        System.out.println("The grade of the student : ");
        

        if(avg>=90){
            System.out.println("A+");
        }
        else if(avg>=80 && avg<90){
            System.out.println("A");
        }
        else if(avg>=60 && avg<80){
            System.out.println("B");
        }
        else if(avg>=50 && avg<60){
            System.out.println("C");
        }
        else if(avg>=40 && avg<50){
            System.out.println("D");
        }
        else{
            System.out.println("FAIL");
        }
        System.out.println();
        System.out.println("************************");


    }

    
}
