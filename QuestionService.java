import java.util.Scanner;

public class QuestionService {
    Question [] questions=new Question[5];
    
    public QuestionService(){
        questions[0]=new Question(1, "What does HTML stand for?", "a) Hyper Text Markup Language", "b) High Text Machine Language", "c) Hyperlink and Text Markup Language", "d) Home Tool Markup Language", "a");
        questions[1]=new Question(2, "Which of the following is used to style web pages?", "a) HTML", "b) CSS", "c) JavaScript", "d) SQL", "b");
        questions[2]=new Question(3, "Which of the following is not a JavaScript framework?", "a) Angular", "b) React", "c) Vue", "d) Django", "d");
        questions[3]=new Question(4, "What is the purpose of the useState hook in React?", "a) To manage routing in the app", "b) To create new HTML elements", "c) To manage state in functional components", "d) To add external CSS to the component", "c");
        questions[4]=new Question(5, "Which data structure uses LIFO (Last In, First Out) principle?", "a) Queue", "b) Stack", "c) Array", "d) Linked List", "b");
    }

    String[] answers=new String[5];

    public void playQuize(){
        Scanner sc=new Scanner(System.in);
        int i=0;
        for(Question q : questions){
            System.out.println("Question No : "+q.quesNo+") "+q.ques);
            System.out.println(q.opt1);
            System.out.println(q.opt2);
            System.out.println(q.opt3);
            System.out.println(q.opt4);
            System.out.print("choose your answer : ");
            answers[i]=sc.next();
            i++;
            System.out.println();
        }
        sc.close();
    }
    public void displayScore(){
        int score=0;
        int i=0;
        for(Question q : questions){
            String choice=q.ans;
            String ans=answers[i];
            if(choice.equals(ans)){
                score++;
            }
            i++;
        }
        System.out.println("your score is : "+score);
    }
}
