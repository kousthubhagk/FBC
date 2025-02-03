package com.cars24.fbc.services.impl;

import com.cars24.fbc.data.dao.AppointmentsUsingMongoDao;
import com.cars24.fbc.data.dao.AppointmentsUsingMySQLDao;
import com.cars24.fbc.data.entities.AppointmentsUsingMongoEntity;
import com.cars24.fbc.services.AppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentServices {

    @Autowired
    private AppointmentsUsingMongoDao dao;

    @Override
    public List<AppointmentsUsingMongoEntity> getAllAppointments() {
        return dao.getAllAppointments();
    }

    @Override
    public AppointmentsUsingMongoEntity createAppointment(AppointmentsUsingMongoEntity appointmentsUsingMongoEntity) {
        return dao.createAppointment(appointmentsUsingMongoEntity);
    }
}
