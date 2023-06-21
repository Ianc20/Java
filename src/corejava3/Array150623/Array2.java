package corejava3.Array150623;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //student info[name,id,branch,semester]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter student id:");
        String id = sc.nextLine();
        System.out.println("Enter student branch:");
        String branch = sc.nextLine();
        System.out.println("Enter student semester:");
        String semester = sc.nextLine();
        String[] studentInfo = {name,id,branch,semester};
        //subject_marks[Java,Python,Web,C,CPP,Springboot]
        System.out.println("Enter score of Java:");
        int scoreJava = sc.nextInt();
        System.out.println("Enter score of Python:");
        int scorePython = sc.nextInt();
        System.out.println("Enter score of Web:");
        int scoreWeb = sc.nextInt();
        System.out.println("Enter score of C:");
        int scoreC = sc.nextInt();
        System.out.println("Enter score of C++:");
        int scoreCPP = sc.nextInt();
        System.out.println("Enter score of Springboot:");
        int scoreSpringboot = sc.nextInt();
        int[] subject_marks = {scoreJava,scorePython,scoreWeb,scoreC,scoreCPP,scoreSpringboot};
        int total_marks = scoreJava+scorePython+scoreWeb+scoreC+scoreCPP+scoreSpringboot;
        double avg = total_marks/subject_marks.length;
        int domain = (int)avg/10;
        String grade;
        switch(domain){
            case 10:
            case 9:
                grade = "A++";
                break;
            case 8:
                grade = "A+";
                break;
            case 7:
                grade = "B++";
                break;
            case 6:
                grade = "B+";
                break;
            case 5:
                grade = "C";
                break;
            default:
                grade = "E";
                break;
        }

        System.out.println("==========================================");
        System.out.println("CIT\tREPORT\tCARD");
        System.out.println("------------------------------------------");
        System.out.println(studentInfo[0]+"\t"+studentInfo[1]+"\t"+studentInfo[2]+"\t"+studentInfo[3]);
        System.out.println("------------------------------------------");
        System.out.println("1.Java\t"+subject_marks[0]+"\n"+"2.Python\t"+subject_marks[1]+"\n"+"3.Web\t"+subject_marks[2]
        +"\n"+"4.C\t"+subject_marks[3]+"\n"+"5.C++\t"+subject_marks[4]+"\n"+"6.Springboot\t"+subject_marks[5]);
        System.out.println("------------------------------------------");
        System.out.println("Total:\t"+total_marks+"\tavg\t"+avg+"\tGrade:\t"+grade);
        System.out.println("==========================================");
        sc.close();
    }
}
