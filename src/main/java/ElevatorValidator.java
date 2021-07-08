import java.util.regex.Pattern;
import static java.lang.Math.abs;

public class ElevatorValidator {

    public boolean isTheStoryIsCorrect(int a, String b){
        int c = 0;
        for(int i =0; i < b.length(); i++){
            if(b.charAt(i) == 'G'){
                c++;
                if(c>a){
                    System.out.println("Error");
                    return false;
                }
            }
            else if (b.charAt(i)=='D'){
                c--;
                if(c < -a){
                    System.out.println("Error");
                    return false;
                }
            }
        }
        System.out.println("Work Correctly");
        return true;
    }

    public boolean isTheStoryIsCorrect2(int a, String b){
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        for(int i =0; i < b.length(); i++){
            if(b.charAt(i) == 'G'){
                c++;
                e++;
                d = 0;
                if(c>a){
                    System.out.println("Error");
                    return false;
                }
            }
            else if (b.charAt(i)=='D'){
                c = 0;
                d++;
                f++;
                if(d > a){
                    System.out.println("Error");
                    return false;
                }
            }
        }
        if (abs(e-f) > a ){
            System.out.println("Error");
            return  false;
        }
        System.out.println("Work Correctly");
        return true;
    }

    public boolean isTheStoryIsCorrect3(int numberOfFloors, String storyUseElevator){
        Long howManyTimesGoUp = storyUseElevator.chars().filter( c -> c == 'G').count();
        Long howManyTimesGoDown = storyUseElevator.chars().filter( c -> c == 'D').count();
        if (abs(howManyTimesGoUp - howManyTimesGoDown) > numberOfFloors){
            return false;
        }
        else{
            return !isAnySequenceOccursTooManyTimes(numberOfFloors, storyUseElevator);
        }

    }

    private boolean isAnySequenceOccursTooManyTimes(int numberOfFloors, String storyUseElevator){
        numberOfFloors++;
        String regexUp = "G{"+Integer.toString(numberOfFloors)+",}";
        String regexDown = "D{"+Integer.toString(numberOfFloors)+",}";

        Pattern pattern = Pattern.compile(regexUp);
        boolean isTooManyUp = pattern.matcher(storyUseElevator.toUpperCase()).find();
        pattern = Pattern.compile(regexDown);
        boolean isTooManyDown = pattern.matcher(storyUseElevator.toUpperCase()).find();
        return isTooManyUp | isTooManyDown;
    }
}
