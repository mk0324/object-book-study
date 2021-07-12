package com.example.movie.discount;

import com.example.movie.Money;
import com.example.movie.Screening;

public class NonDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
