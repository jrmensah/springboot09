package me.jerilynmensah.springboot09;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long>{
}
