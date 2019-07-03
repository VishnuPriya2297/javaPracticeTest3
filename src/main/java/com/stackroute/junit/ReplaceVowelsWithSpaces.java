package main.java.com.stackroute.junit;
/*
programe to remove all he vowels in the string
 */
import java.util.regex.Pattern;
public class ReplaceVowelsWithSpaces {
    public String[] removeVowels(String inputString[])
    {
        for (int i = 0; i < inputString.length; i++)
            inputString[i] = inputString[i].replaceAll("[aeiouAEIOU]", "");//replacing all the vowels using replaceAll() method
        return inputString;
    }
}
