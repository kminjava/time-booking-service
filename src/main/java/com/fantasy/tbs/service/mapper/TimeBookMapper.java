package com.fantasy.tbs.service.mapper;

import com.fantasy.tbs.domain.TimeBooking;
import com.fantasy.tbs.domain.dto.TimeBookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TimeBookMapper {
    @Mapping(target = "booking", source = "timeStamp")
    TimeBooking toTimeBooking(TimeBookDTO timeBookDTO);
}
