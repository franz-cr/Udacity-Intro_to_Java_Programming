// Implement getTeacherComment
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GradeBook
{
    private String[] studentNames;
    private int numStudents = 22;
    private String[] topicNames;
    private int numTopics = 5;
    private double[][] grades;
    private String fileName = "grades.txt";
    
    public GradeBook() 
    {
        studentNames = new String[numStudents];
        topicNames = new String[numTopics];
        grades = new double[numStudents][numTopics];
        readScoresFromFile(fileName);
    }
    
    /**
     * Adds up all the scores for one student and returns the result.
     * Only works for a valid student index.
     * @param studentIndex the row for the student whose total you want.
     * @return the sum of that student's scores, or -1 if the index is bad.
     */
    public double totalForStudent(int studentIndex)
    {
        if (studentIndex < 0 || studentIndex >= numStudents)
        {
            return -1;
        }
        double sum = 0;
        for (int j=0; j < numTopics; j++)
        {
            sum = sum + grades[studentIndex][j];
        }
        return sum;
    }
    
    /**
     * Calculates the totals for all the students and returns the results
     * in a completely filled array. The order of the totals matches the 
     * order of the names in studentNames.
     * @return a filled array of the total for each student. 
     */
    public double[] totalsForAllStudents()
    {
        double[] totals = new double[numStudents];
        for (int student = 0; student < numStudents; student++)
        {
            totals[student] = totalForStudent(student);
        }
        return totals;
    }
    
    /**
     * Calculates the column totals (the sum of of all students'
     * scores for one topic) for all topics in a completely filled array.
     * The order of the topcs matches the order of the topic names in 
     * topicNames. 
     * @return a filled array of the total for each topic.
     */
    public double[] totalsForAllTopics()
    {
        double[] topicTotals = new double[numTopics];
        for (int topic = 0; topic < numTopics; topic++)
        {
            double topicTotal = 0;
            for (int student = 0; student < numStudents; student++)
            {
                topicTotal = topicTotal + grades[student][topic];
            }
            topicTotals[topic] = topicTotal;
        }
        return topicTotals;
    }
    
    /**
     * YOUR COMMENT HERE
     * What do you think this method should do? 
     */
    public String getTeacherComment(int student)
    {
        // YOUR CODE HERE
        // What would a personalized comment look like for the student at studentIndex? 
        // You can use the students instance variable to get the student names, for example: 
        // String studentName = students.get(studentIndex);
        // You can use the topics variable to get the topic names, for example
        // String firstTopic = topics.get(0);
        
        // There are many right answers here so I won't try to grade you on this question. 
        // Check out GradeBookDemo.java (It is visible in the bluej project and visible in 
        // another tab in the Udacity IDE) to find out how the teacherCommentForStudent method
        // is called. 
        
        // When you test run this program, the GradeBookDemo will run and will print out student
        // comments for three students. What do you think of the comments your program generated?
        
        // You can look at grades.txt to check that a comment makes sense for a student. The 
        // students names are listed first, then the topic names then the grades. Each row has 
        // one student's grades for each topic. The first row holds the first student's grades 
        // (in this case, the First student should be Tom).  
        // String studentComment0 = book.teacherCommentForStudent(0);
        String comment = studentNames[student] + ", ";
        for (int topic = 0; topic < topicNames.length; topic++) {
            comment += topicNames[topic] + ": " + grades[student][topic] + ", ";
        }
        return comment.substring(0, comment.length() - 2);
    }
    
    /**
     * Gets the student names. 
     * @return the student names. 
     */
    public String getStudents()
    {
        return Arrays.asList(studentNames).toString();
    }
    
    /**
     * Gets the topic names.
     * @return the names of the topics. 
     */
    public String getTopics()
    {
        return Arrays.asList(topicNames).toString();
    }
    
    public String getScores() {
        String prettyScores = "";
        for (int i = 0; i < 22; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                prettyScores += "\t" + grades[i][j];
            }
            prettyScores += "\n";
        }
        return prettyScores;
    }
    
    private void readScoresFromFile(String fileName)
    {
        try
        {
            Scanner in = new Scanner(new FileReader(fileName));
            String value = in.next();
            for (int i = 0; i < 5; i++)
            {
                topicNames[i] = in.next();
            }
            int i = 0;
            int j = 0;
            while (in.hasNext())
            {
                String name = in.next();
                studentNames[i] = name;
                while (in.hasNextDouble())
                {
                    grades[i][j] = in.nextDouble();
                    j++;
                }
                i++;
                j = 0;
            }
            System.out.println(i);
            
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("Did you delete the file with the grades?");
        }
    }
}
