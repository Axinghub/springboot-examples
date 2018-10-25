
package com.axing.repository;

import com.axing.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository {

	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

	void deleteMessage(Long id);

}
