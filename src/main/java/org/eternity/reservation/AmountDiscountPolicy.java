package org.eternity.reservation;

import org.eternity.generic.Money;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
