public class Core {
    public static void main(String[] args) {
        ElevatorValidator elevatorValidator = new ElevatorValidator();
        elevatorValidator.isTheStoryIsCorrect(5, "DDDDDGGGGGG");
        elevatorValidator.isTheStoryIsCorrect2(5, "DDDDDGGGGGG");
        elevatorValidator.isTheStoryIsCorrect2(5, "GGGGDGGG");
        elevatorValidator.isTheStoryIsCorrect2(5, "GGGGDGG");
        System.out.println( elevatorValidator.isTheStoryIsCorrect3(5, "GGGGDGG") );
        System.out.println( elevatorValidator.isTheStoryIsCorrect3(5, "GDDDDGGGGG") );
        System.out.println( elevatorValidator.isTheStoryIsCorrect3(5, "GDDDDGGGGGG") );
        System.out.println( elevatorValidator.isTheStoryIsCorrect3(5, "GGGGGDDGGGGGDGGGGDDGGGG") );
    }
}
