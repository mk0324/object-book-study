package com.example.demo;

import com.example.movie.Money;
import com.example.movie.Movie;
import com.example.movie.discount.AmountDiscountPolicy;
import com.example.movie.discount.PercentDiscountPolicy;
import com.example.movie.discount.PeriodCondition;
import com.example.movie.discount.SequenceCondition;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;

public class DiscountPolicyTest {

    @Test
    void discountTest1() {
        Movie avatar = new Movie("아바타",
            Duration.ofMinutes(120),
            Money.wons(10000),
            new AmountDiscountPolicy(Money.wons(800),
                new SequenceCondition(1),
                new SequenceCondition(10),
                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
            ));

        // Assertions.assertThat();
    }

    @Test
    void discountTest2() {
        Movie titanic = new Movie("타이타닉",
            Duration.ofMinutes(180),
            Money.wons(11000),
            new PercentDiscountPolicy(0.1,
                new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                new SequenceCondition(2),
                new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
            ));

        // Assertions.assertThat();
    }

}
