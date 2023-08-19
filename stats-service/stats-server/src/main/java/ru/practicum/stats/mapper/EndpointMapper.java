package ru.practicum.stats.mapper;

import ru.practicum.common.EndpointHitDto;
import ru.practicum.stats.EndpointHit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EndpointMapper {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static EndpointHitDto toEndpointHitDto(EndpointHit endpointHit) {
        return new EndpointHitDto(
                endpointHit.getApp(),
                endpointHit.getUri(),
                endpointHit.getIp(),
                endpointHit.getTimestamp().format(dateTimeFormatter)
        );
    }

    public static EndpointHit toEndpointHit(EndpointHitDto endpointHitDto) throws DateTimeParseException {
        return new EndpointHit(
                endpointHitDto.getApp(),
                endpointHitDto.getUri(),
                endpointHitDto.getIp(),
                LocalDateTime.parse(endpointHitDto.getTimestamp(), dateTimeFormatter)
        );
    }

}