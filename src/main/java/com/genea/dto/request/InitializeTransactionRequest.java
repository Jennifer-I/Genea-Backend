package com.genea.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter


public class InitializeTransactionRequest {
    private BigDecimal amount;
    private String email;
    private String reference;
}