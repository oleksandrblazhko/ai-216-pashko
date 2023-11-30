package com.gleb.lab9.service;

import com.gleb.lab9.model.RequestFood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestFoodService extends JpaRepository<RequestFood, Long> {
}
