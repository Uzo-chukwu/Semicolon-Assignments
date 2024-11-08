import java.util.Scanner;

public class MbtiPersonalityTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        int[] answers = new int[20];
        int[] questionEI = {1, 5, 9, 13, 17};
        int[] questionSN = {2, 6, 10, 14, 18};
        int[] questionTF = {3, 7, 11, 15, 19};
        int[] questionJP = {4, 8, 12, 16, 20};

        String[][] serveQuestions = {
            {"1.   A. expend energy, enjoy groups,    B. conserve energy, enjoy one-on-one"},
            {"2.   A. interpret literally,    B. look for meaning and possibilities"},
            {"3.   A. logical, thinking, questioning,    B. empathetic, feeling, accommodating"},
            {"4.   A. organized, orderly,    B. flexible, adaptable"},
            {"5.   A. more outgoing, thinking out loud,    B. more reserved, think to yourself"},
            {"6.   A. practical, realistic, experiential,    B. imaginative, innovative, theoretical"},
            {"7.   A. candid, straightforward, frank,    B. tactful, kind, encouraging"},
            {"8.   A. plan, schedule,    B. unplanned, spontaneous"},
            {"9.   A. seek many tasks, public activities, interaction with others,    B. seek private, solitary activities with quiet to concentrate"},
            {"10.  A. standard, usual, conventional,    B. different, novel, unique"},
            {"11.  A. firm, tend to criticize, hold the line,    B. gentle, tend to appreciate, conciliate"},
            {"12.  A. regulated, structured,    B. easy-going, live and let live"},
            {"13.  A. external, communicative, express yourself,    B. internal, reticent, keep to yourself"},
            {"14.  A. focus on here-and-now,    B. look to the future, global perspective, big picture"},
            {"15.  A. tough-minded, just,    B. tender-hearted, merciful"},
            {"16.  A. preparation, plan ahead,    B. go with the flow, adapt as you go"},
            {"17.  A. active, initiate,    B. reflective, deliberate"},
            {"18.  A. facts, things, what is,    B. ideas, dreams, what could be, philosophical"},
            {"19.  A. matter of fact, issue-oriented,    B. sensitive, people-oriented, compassionate"},
            {"20.  A. control, govern,    B. latitude, freedom"}
        };

        for (int i = 0; i < serveQuestions.length; i++) {
            System.out.println(serveQuestions[i][0]);
            System.out.print("Enter 1 for A or 2 for B: ");
            int choice = scan.nextInt();
            answers[i] = choice;
        }



        System.out.println("Thank you, " + name + ". Here are your answers:");
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + (answers[i] == 1 ? "A" : "B"));
        }
    }
}