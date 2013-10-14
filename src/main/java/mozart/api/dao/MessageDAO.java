package mozart.api.dao;

import mozart.api.model.Message;
import mozart.core.db.AbstractDAO;

import org.springframework.stereotype.Component;

@Component
public class MessageDAO extends AbstractDAO<Message> {

	@Override
	public Class<Message> getModel() {
		return Message.class;
	}

}