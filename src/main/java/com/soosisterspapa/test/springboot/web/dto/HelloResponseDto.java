package com.soosisterspapa.test.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //
@RequiredArgsConstructor //
public class HelloResponseDto {

    private final String name="test";
    private final int amount=1000;

}
