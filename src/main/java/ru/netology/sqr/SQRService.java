package ru.netology.sqr;

public class SQRService {

    public int calculate(int lowerBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= lowerBound && sqr<= upperBound) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}
