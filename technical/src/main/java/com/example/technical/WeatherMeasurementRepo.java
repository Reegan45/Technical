package com.example.technical;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WeatherMeasurementRepo extends JpaRepository<WeatherMeasurementEntity,Long> {
    List<WeatherMeasurementEntity> findByTimesStamp(LocalDateTime start ,LocalDateTime end);
}
