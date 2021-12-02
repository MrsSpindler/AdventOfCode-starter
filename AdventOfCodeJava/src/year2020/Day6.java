package year2020;

/**
 * @author Mrs. Spindler
 * 
 *         The following is a sample problem from the 2020 contest. It
 *         demonstrates how to use Java to parse a multi-lined String containing
 *         information in groups, separated by blank lines. 
 *         Visit https://adventofcode.com/2020/day/6 to see the full
 *         problem description
 *
 */

public class Day6 {

    // You will need to replace this with the input you are given 
    // (inputs are unique to every player)
    // But try it first with the samples in the problem!
    final static String input = "abc\r\n"
            + "\r\n"
            + "a\r\n"
            + "b\r\n"
            + "c\r\n"
            + "\r\n"
            + "ab\r\n"
            + "ac\r\n"
            + "\r\n"
            + "a\r\n"
            + "a\r\n"
            + "a\r\n"
            + "a\r\n"
            + "\r\n"
            + "b";
    
    public static void main (String [] args) {

        String[] lines;
        int anyoneYes = 0;

        lines = input.split("\r\n\r\n"); //look for groups separated by double newlines

        //each element represents a group of people with "yes" answers
        for (String group : lines) {

            //keep all questions in a String - add as needed
            String uniqueQuestions = new String();

            //Part 1 - get each person's yes list
            String [] people = group.split("\r\n");

            for (String person : people) {
                //split up into individual characters
                char [] questions = person.toCharArray();

                //cycle through each character 
                for (char question : questions) {

                    //only add a question if it's not been seen before 
                    if (uniqueQuestions.indexOf(question) == -1) {
                        uniqueQuestions += question;
                    }
                }
            }
            
            //length of String will give the number of questions for this group
            anyoneYes += uniqueQuestions.length();

        }

        // Output the result to enter into the website!
        System.out.println("Anyone said yes: " + anyoneYes);
    }


}
