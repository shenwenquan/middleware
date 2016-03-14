package com.springapp.base.spEL;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by apple on 16/3/9.
 */
public class Main2 {
    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
//        int year = (Integer) parser.parseExpression("Birthdate.Year + 1900").getValue(context);

    }
}
