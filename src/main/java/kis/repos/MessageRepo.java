//репозиторий который позволяет получить полный список полей, либо найти по индитификатору


package kis.repos;

import kis.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
