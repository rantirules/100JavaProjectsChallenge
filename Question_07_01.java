public class Question_07_01 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int userInput = input.nextInt();
        int[] studentScoresArray = new int[userInput];
        System.out.print("Enter " + studentScoresArray.length + " scores: ");

        for (int i = 0; i < studentScoresArray.length; i++) {
            studentScoresArray[i] = input.nextInt();
       }
        int best = 0;
        for (int i = 0; i < studentScoresArray.length; i++) {
            if (studentScoresArray[i] > best) {
                best = studentScoresArray[i];
            }
        }
        char[] studentGradesArray = new char[studentScoresArray.length];

       for (int i = 0; i < studentGradesArray.length; i++) {
           if (studentScoresArray[i] >= best - 10)
               studentGradesArray[i] = 'A';
           else if (studentScoresArray[i] >= best - 20)
               studentGradesArray[i] = 'B';
           else if (studentScoresArray[i] >= best - 30)
               studentGradesArray[i] = 'C';
           else if (studentScoresArray[i] >= best - 40)
               studentGradesArray[i] = 'D';
          else
              studentGradesArray[i] = 'F';

       }
       for (int i = 0; i < studentGradesArray.length; i++)  {
           System.out.println("Student " + i + " score is " + studentScoresArray[i] + " and grade is " + studentGradesArray[i]);
        }
    }
}
