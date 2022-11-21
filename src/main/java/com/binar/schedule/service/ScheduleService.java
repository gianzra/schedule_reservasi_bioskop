package com.binar.schedule.service;

import com.binar.schedule.dto.ScheduleDTO;
import com.binar.schedule.model.Schedules;

import java.util.List;

public interface ScheduleService {

    Schedules create(Schedules schedules);
    Schedules update(Long schedule_id, Schedules schedules);
    Boolean delete(Long schedule_id);
    List<Schedules> findAll();
    Schedules findById(Long schedule_id);

    ScheduleDTO mapToDto(Schedules schedules);
    Schedules mapToEntity(ScheduleDTO scheduleDTO);

}
