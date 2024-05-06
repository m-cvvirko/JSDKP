package com.gft.achpayments.sinktools.repository;

import com.gft.achpayments.sinktools.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

}
