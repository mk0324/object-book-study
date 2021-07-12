package com.example.movie.discount;

import com.example.movie.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
