package ru.netology.sqr;

public class SQRService {
    public int calcNumberOfSqrAtDiapason(int bottom, int upper) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i*i >= bottom) && (i*i <= upper)) {
                counter +=1;
            }
        }
        return counter;
    }
}
