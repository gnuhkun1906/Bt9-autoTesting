package bt3;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }else {
            return "";
        }


    }
    public static  String getSearch(int N){
        String str=Integer.toString(N);
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==3){
                str="Fizz";
            }
            if (str.charAt(i)==5){
                str="Buzz";
            }
        }
        return str;
    }


}
