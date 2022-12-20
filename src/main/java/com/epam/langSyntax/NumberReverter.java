package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int answer = 0;
        while(number > 0) {
            answer = answer * 10 + number % 10;
            number /= 10;
        }
        System.out.println(answer);
    }

}
