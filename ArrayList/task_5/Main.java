package task_5;

import java.util.*;

class Calc {
    public static List<Integer> calculate(List<Integer> numbers, int num){

        List<Integer> arrNew = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++){
//            arrNew.add(num - numbers.get(i));
//        }

        List<Integer> arrMin = new ArrayList<>();
        List<Integer> arrMax = new ArrayList<>();

//        for (int i = 0; i < numbers.size(); i++){
//            if (numbers.get(i) < num){
//                arrMin.add(numbers.get(i));
//            }
//            else if (numbers.get(i) > num){
//                arrMax.add(numbers.get(i));
//            }
//        }

        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < num){
                arrMin.add(numbers.get(i));
                if (numbers.get(i) == arrMin.get(arrMin.size() - 1)){
                    arrNew.add(numbers.get(i));
                }
            }
            else if (numbers.get(i) > num) {
                arrMax.add(numbers.get(i));
                if (numbers.get(i) == arrMax.get(0)) {
                    arrNew.add(numbers.get(i));
                }
            }
        }

        return arrNew;
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = sc.nextInt();

        List arr = new ArrayList<>();

        String[] numbers = input.split(" ");

        for (int i = 0; i < numbers.length; i++){
            arr.add(Integer.parseInt(numbers[i]));
        }

        arr.sort(Comparator.naturalOrder());
        List<Integer> res = Calc.calculate(arr, num);
        System.out.println(res);
    }
}
