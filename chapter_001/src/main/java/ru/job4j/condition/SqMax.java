package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;

        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            } else if (third > forth) {
                result = third;
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = second;
        }

//        if (first > second && first > third && first > forth) {
//            result = first;
//
//        } else if (second > third && second > first && second > forth) {
//            result = second;
//
//        } else if (third > first && third > second && third > forth) {
//            result = third;
//        }
        return result;
    }
}
