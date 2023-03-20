package bt2;

public class TriangleClassifier {
    public static  String test(int a, int b, int c) {
        String category;
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
          return   category= "tam giác đều";

        }else if (a==b||b==c||a==c){
              return   category= "tam giác cân";
            }
          return   category= "tam giác";
        }else {
            category= "Không phải là tam giác";
        }
        return category;
    }
}
