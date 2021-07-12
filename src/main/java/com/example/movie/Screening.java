package com.example.movie;

import java.time.LocalDateTime;

/**
 * Screening 클래스는 사용자들이 예매하는 대상인 '상영' 을 구현한다
 *
 * 인스턴스 변수의 가시성은 private, 메서드의 가시성은 public 으로 설정하여 객체의 속성에 직접 접근할 수 없도록 막고,
 * 적절한 public 메서드를 통해서만 내부 상태를 변경할 수 있도록 한다.
 * 경계의 명확성을 통해 객체의 자유를 보장한다
* */
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreening;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreening) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreening = whenScreening;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public LocalDateTime getStartTime() {
        return whenScreening;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
