package com.example.movie;

import com.example.movie.discount.DiscountPolicy;
import java.time.Duration;
/**
 * 상속과 다형성
 * 1. Movie 객체 내부에서는 어떤 할인 정책을 적용할 것인지 판단하지 않는다.
 * 오로지 DiscountPolicy 에만 의존하고 있으며, 실행시점에 구체적인 객체를 주입받고 구체 객체에 의존하게 된다.
 * 즉 코드 의존성과 실행시점 의존성은 다를 수 있다. 확장 가능한 객체 지향 설계가 가지는 특징이다.
 *
 * 2. 추상화의 장점
 * 추상화 계층만 따로 떼어 놓았을 때 요구 사항의 정책을 높은 수준에서 서술할 수 있다(어플리케이션의 협력 흐름)
 * -> 세부적인 내용을 무시한 채 정책을 쉽고 간단하게 표현할 수 있다
 * 추상화를 통해 설계를 유연하게 할 수 있다.
 * -> 기존 구조를 수정하지 않고 새로운 기능을 쉽게 추가/확장할 수 있다
 * */
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
