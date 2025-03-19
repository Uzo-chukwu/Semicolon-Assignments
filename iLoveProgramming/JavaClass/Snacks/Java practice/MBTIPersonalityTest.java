import java.util.Scanner;

public class MBTIPersonalityTest {

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
            {"1.", " A. expend energy, enjoy groups   ", "B. conserve energy, enjoy one-on-one"},
            {"2.", " A. interpret literally   ", " B. look for meaning and possibilities"},
            {"3.", " A. logical, thinking, questioning  ", " B. empathetic, feeling, accommodating"},
            {"4.", " A. organized, orderly  ", " B. flexible, adaptable"},
            {"5.", " A. more outgoing, thinking out loud   ", " B. more reserved, think to yourself"},
            {"6.", " A. practical, realistic, experiential   ", " B. imaginative, innovative, theoretical"},
            {"7.", " A. candid, straightforward, frank   ", " B. tactful, kind, encouraging"},
            {"8.", " A. plan, schedule   ", " B. unplanned, spontaneous"},
            {"9.", " A. seek many tasks, public activities, interaction with others  ", " B. seek private, solitary activities with quiet to concentrate"},
            {"10."," A. standard, usual, conventional  ", " B. different, novel, unique"},
            {"11.", " A. firm, tend to criticize, hold the line ", " B. gentle, tend to appreciate, conciliate"},
            {"12.", " A. regulated, structured  ", " B. easy-going, live and let live"},
            {"13.", " A. external, communicative, express yourself  ", " B. internal, reticent, keep to yourself"},
            {"14.", " A. focus on here-and-now ", " B. look to the future, global perspective, big picture"},
            {"15.", " A. tough-minded, just  ", " B. tender-hearted, merciful"},
            {"16.", " A. preparation, plan ahead  ", " B. go with the flow, adapt as you go"},
            {"17.", " A. active, initiate  ", " B. reflective, deliberate"},
            {"18.", " A. facts, things, what is  ", " B. ideas, dreams, what could be, philosophical"},
            {"19.", " A. matter of fact, issue-oriented  ", " B. sensitive, people-oriented, compassionate"},
            {"20.", " A. control, govern   ", " B. latitude, freedom"}
        };

        for (int i = 0; i < serveQuestions.length; i++) {
            System.out.println(serveQuestions[i][0]+serveQuestions[i][1] + serveQuestions[i][2]);
            System.out.print("Enter 1 for A or 2 for B");
            int choice = 0;
            while (choice != 1 || choice != 2 ) {
                choice = scan.nextInt();
                if (choice == 1 || choice == 2 )
			break;
                	System.out.print("Invalid input. Please enter 1 for A or 2 for B: ");
            }
            answers[i] = choice;
        }

        int countEI = 0, countSN = 0, countTF = 0, countJP = 0;
        for (int i : questionEI) {
            if (answers[i - 1] == 1) countEI++;
        }
        for (int i : questionSN) {
            if (answers[i - 1] == 1) countSN++;
        }
        for (int i : questionTF) {
            if (answers[i - 1] == 1) countTF++;
        }
        for (int i : questionJP) {
            if (answers[i - 1] == 1) countJP++;
        }

        String ei = countEI > questionEI.length / 2 ? "E" : "I";
        String sn = countSN > questionSN.length / 2 ? "S" : "N";
        String tf = countTF > questionTF.length / 2 ? "T" : "F";
        String jp = countJP > questionJP.length / 2 ? "J" : "P";
        String mbtiType = ei + sn + tf + jp;

        System.out.println("\nThank you, " + name + ". Here are your answers:");
        for (int i = 0; i < answers.length; i++) {

		if (answers[i] == 1){
			System.out.println("Question " + (i + 1) + ": " + serveQuestions[i][1]  );
		}else if(answers[i] == 2){
			System.out.println("Question " + (i + 1) + ": " + serveQuestions[i][2]  );
		}




        }

        System.out.println("\nYour MBTI personality type is: " + mbtiType);

        switch (mbtiType) {
            case "INTJ":
                System.out.println("The Architect: Imaginative and strategic thinkers, with a plan for everything.");
                break;
            case "INTP":
                System.out.println("The Logician: Innovative inventors with an unquenchable thirst for knowledge.");
                break;
            case "ENTJ":
                System.out.println("The Commander: Bold, imaginative, and strong-willed leaders, always finding a way.");
                break;
            case "ENTP":
                System.out.println("The Debater: Smart and curious thinkers who cannot resist an intellectual challenge.");
                break;
            case "INFJ":
                System.out.println("The Advocate: Quiet and mystical, yet very inspiring and tireless idealists.");
                break;
            case "INFP":
                System.out.println("The Mediator: Poetic, kind, and altruistic, always eager to help a good cause.");
                break;
            case "ENFJ":
                System.out.println("The Protagonist: Charismatic and inspiring leaders, able to mesmerize their listeners.");
                break;
            case "ENFP":
                System.out.println("The Campaigner: Enthusiastic, creative, and sociable free spirits, always finding a reason to smile.");
                break;
            case "ISTJ":
                System.out.println("The Logistician: Practical and fact-minded individuals, whose reliability cannot be doubted.");
                break;
            case "ISFJ":
                System.out.println("The Defender: Very dedicated and warm protectors, always ready to defend their loved ones.");
                break;
            case "ESTJ":
                System.out.println("The Executive: Excellent administrators, unsurpassed at managing things—or people.");
                break;
            case "ESFJ":
                System.out.println("The Consul: Extraordinarily caring, social, and popular, always eager to help.");
                break;
            case "ISTP":
                System.out.println("The Virtuoso: Bold and practical experimenters, masters of all kinds of tools.");
                break;
            case "ISFP":
                System.out.println("The Adventurer: Flexible and charming artists, always ready to explore and experience something new.");
                break;
            case "ESTP":
                System.out.println("The Entrepreneur: Smart, energetic, and very perceptive people, who truly enjoy living on the edge.");
                break;
            case "ESFP":
                System.out.println("The Entertainer: Spontaneous, energetic, and enthusiastic people—life is never boring around them.");
                break;
            default:
                System.out.println("Unknown personality type.");
                break;
        }


    }
}