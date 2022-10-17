public class ArrayExercise {


    public static void arrayToUpperCase(String[] input){
        for(int i = 0; i < input.length; i++){
            input[i] = input[i].toUpperCase();
        }
    }

    public static void incrementArray(int[] input){
        for(int i = 0; i < input.length; i++){
            input[i] = input[i] + 1;
        }

    }
}
