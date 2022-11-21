package com.binar.schedule.repository;

import com.binar.schedule.model.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedules, Long> {

}
