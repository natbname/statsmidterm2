import java.util.ArrayList;

public class MeanProgram 
{
    public double computeMean(ArrayList<Integer> listOfNumbers)
    {
        int sum = 0;
        for(int singleNum : listOfNumbers) //for each loop
        {
            sum = sum + singleNum;
        }
        return sum /(double) listOfNumbers.size(); //casting double. also .length() is for arrays, .size() is for ArrayList
    }
}
