package dao;

import model.Person;
import org.springframework.stereotype.Repository;

/**
 * Created by 14978 on 2017/6/25.
 */
@Repository("personMapper")
public interface PersonMapper {
    public void insert(Person person);
}
