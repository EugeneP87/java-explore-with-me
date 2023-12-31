package ru.practicum.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EndpointHitDto {

    private String app;
    private String uri;
    private String ip;
    private String timestamp;

}