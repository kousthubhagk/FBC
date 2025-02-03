package com.cars24.fbc.services;

import com.cars24.fbc.data.entities.AppointmentsUsingMongoEntity;

import java.util.List;
import java.util.Optional;

public interface AppointmentServices {
    List<AppointmentsUsingMongoEntity> getAllAppointments();
//    Optional<AppointmentsUsingMongoEntity> getAppointmentById(String id);
    AppointmentsUsingMongoEntity createAppointment(AppointmentsUsingMongoEntity appointmentsUsingMongoEntity);
}
