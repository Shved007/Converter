package com.company;

import java.math.BigDecimal;

public interface Converting {

    void uahToUsd(BigDecimal money);

    void uahToEur(BigDecimal money);

    void usdToUah(BigDecimal money);

    void usdToEur(BigDecimal money);

    void eurToUah(BigDecimal money);

    void eurToUsd(BigDecimal money);

    void convert() throws InterruptedException;

}
