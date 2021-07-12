package com.example.movie.discount;

import com.example.movie.Money;
import com.example.movie.Screening;

/**
 * 할인 조건을 만족할 경우 일정 비율을 할인해주는 금액 할인 정책
 * */
public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
