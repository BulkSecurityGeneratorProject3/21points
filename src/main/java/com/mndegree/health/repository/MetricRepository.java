package com.mndegree.health.repository;

import com.mndegree.health.domain.Metric;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Metric entity.
 */
public interface MetricRepository extends JpaRepository<Metric,Long> {

}
