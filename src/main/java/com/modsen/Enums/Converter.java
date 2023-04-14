package com.modsen.Enums;

import com.modsen.Records.Money;

public enum Converter {
    TO_DOLLARS {
        @Override
        public Money convert(Money money) {
            return money.currency().equals(Currency.USD) ? money : new Money(money.amount() / exRate, Currency.USD);
        }
    },
    TO_RUBLES {
        @Override
        public Money convert(Money money) {
            return money.currency().equals(Currency.RUB) ? money : new Money(money.amount() * exRate, Currency.RUB);
        }
    };

    // TODO: Брать конвертацию из конфига
    private static final double exRate = 76d;

    public abstract Money convert(Money money);
}
