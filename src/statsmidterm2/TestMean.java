package statsmidterm2;
import java.util.ArrayList;

//WRITTEN IN CLASS: not my code, using this for github assignment
public class TestMean 
{
    public static void main(String[] args)
    {
        MeanProgram tester = new MeanProgram();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            listOfNumbers.add(i);
        }
        System.out.println(tester.computeMean(listOfNumbers));
    }
}
