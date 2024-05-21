package control_flow.exercises;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class MirrorString
{
    public static void mirrorPrintString1(String s)
    {
        String[] words = s.split(" ");
        for (int a = 0; a < words.length ; a++)
        {
            System.out.print(words[words.length - (a + 1)] + " ") ;
        }
        System.out.println();
    }

    public static void mirrorPrintString2(String s)
    {
        List<String> wordList = Arrays.asList(s.split(" "));
        Collections.reverse(wordList);
        wordList.forEach((n) -> System.out.print(n + " "));
    }

    public static void mirrorPrintString3(String s)
    {
        Arrays.stream(s.split(" "))
                .collect(
                        Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining((str) -> System.out.print(str  + " "));
        System.out.println();
    }



    public static void main(String[] args)
    {
        String dog = "Big Dog";
//        mirrorPrintString1(dog);
//        mirrorPrintString2(dog);
        mirrorPrintString3(dog);

    }
}
