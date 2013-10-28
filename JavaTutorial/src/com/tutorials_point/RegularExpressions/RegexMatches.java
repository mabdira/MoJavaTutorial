package com.tutorials_point.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/28/13
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegexMatches {

    /* Example illustrate how to find a digit string from the given
    alphanumeric string:
      */
    private static void findDigit(){
        String line = "This order was places for QT3000! OK?";
        // Create the pattern object
        Pattern digitPattern = Pattern.compile("(.*)(\\d+)(.*)");
        // Create the matcher object
        Matcher digitMatcher = digitPattern.matcher(line);
        System.out.println("Number of groups represented in the expression: " + digitMatcher.groupCount());
        // Study methods: Study methods review the input string and return a boolean indicating whether
        // or not the pattern is found:
        //System.out.println("lookingAt() -> " + digitMatcher.lookingAt());
        //System.out.println("matches() -> " + digitMatcher.matches());
        if(digitMatcher.find()){
            System.out.println("Found value: " + digitMatcher.group(0));
            System.out.println("Found value: " + digitMatcher.group(1));
            System.out.println("Found value: " + digitMatcher.group(2));
            System.out.println("Found value: " + digitMatcher.group(3));
        }
        else{
            System.out.println("No Match");
        }
        // Index methods: Index methods provide useful index values that show precisely where the match was
        // found in the input string:
        System.out.println("Start index of the previous match: " + digitMatcher.start());
        System.out.println("The offset after the last character matched: " + digitMatcher.end());
        System.out.println("Start index of the subsequent captured by the given group: "
                            + digitMatcher.end(1));

    }

    /* Following is the example that counts the number of times the word "cats" appears in the input string
    *  Index methods: Index methods provide useful index values that show precisely where the match was
    *  found in the input string:
    * */
    private static void countNumberCats(){
        final String REGEX = "\\bcat\\b";
        final String INPUT = "cat cat cat cattie cat";
        // Create Pattern object
        Pattern catPattern = Pattern.compile(REGEX);
        // Create the matcher object
        Matcher catMatcher = catPattern.matcher(INPUT);
        // Loop through for the find() study method and display the statistics via the Index methods
        int count = 0;
        while(catMatcher.find()){
            ++count;
            System.out.println("Match number: " + count);
            System.out.println("start(): " + catMatcher.start());
            System.out.println("end(): " + catMatcher.end());
        }

    }

    /* The matches and lookingAt methods both attempt to match an input sequence against a pattern.
    The difference, however, is that matches requires the entire input sequence to be matched,
    while lookingAt does not.

    Study methods: Study methods review the input string and return a boolean indicating whether
    or not the pattern is found:
    */
    private static void testStudyMethods(){
        final String REGEX = "foo";
        final String INPUT = "fooooooooooooooooo";
        // Create the pattern object
        Pattern pattern = Pattern.compile(REGEX);
        // Create the matcher object
        Matcher match = pattern.matcher(INPUT);
        // explain the difference between matches vs lookingAt
        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("find(): " + match.find());
        System.out.println("lookingAt(): " + match.lookingAt());
        System.out.println("matches(): " + match.matches());
    }

    /* The replaceFirst and replaceAll methods replace text that matches a given regular expression.
    As their names indicate, replaceFirst replaces the first occurrence, and replaceAll replaces all occurrences.
     */
    private static void replaceFirstAll(){
        final String REGEX = "dog";
        final String INPUT = "The dog says meow. All dogs say meow.";
        final String REPLACE = "cat";
        // Create the pattern object
        Pattern pattern = Pattern.compile(REGEX);
        // Create the matcher object
        Matcher match = pattern.matcher(INPUT);
        // replaceFirst() method
        //System.out.println("replaceFirst(): " + match.replaceFirst(REPLACE));
        // replaceAll() method
        System.out.println("replaceAll(): " + match.replaceAll(REPLACE));
    }

    /* The Matcher class also provides appendReplacement and appendTail methods for text replacement. */
    private static void appendReplacementTail(){
        final String REGEX = "a*b";
        final String INPUT = "aabfooaabfooabfoob\n" + "abk";
        final String REPLACE = "-";
        // Create the pattern object
        Pattern pattern = Pattern.compile(REGEX);
        Matcher match = pattern.matcher(INPUT);

        // test appendReplacement and appendTail
        StringBuffer sb = new StringBuffer();
        while(match.find()){
            match.appendReplacement(sb, REPLACE);
        }
        /* This method [appendTail(StringBuffer)] reads characters from the input sequence, starting at the append
        position, and appends them to the given string buffer. It is intended to be invoked after one or more
        invocations of the appendReplacement method in order to copy the remainder of the input sequence.
         */
        match.appendTail(sb);
        System.out.println(sb.toString());
    }

    public static void main(String[] args){
        // how to find a digit string from the given alphanumeric string. Just a general REGEX operation.
        System.out.println("******* Find the digit string from the given alphanumeric string *******");
        findDigit();

        // how to count the number of times the word "cats" appears in the input string. This test specifically
        // the found() study method
        System.out.println("\n******* Count the word \"cats\" appears in input String ********");
        countNumberCats();

        // study methods of matches() vs lookingAt() vs find() differences
        System.out.println("\n******* Test the study methods of matches() vs lookingAt() *********");
        testStudyMethods();

        // replacement methods of replaceFirst() vs replaceAll()
        System.out.println("\n******* Test the replacement methods of replaceFirst() vs replaceAll() ********");
        replaceFirstAll();

        // replacement methods of appendReplacement() vs appendTail()
        System.out.println("\n******* Test the replacement methods of appendReplacement() and appendTail() ********");
        appendReplacementTail();
    }



}
