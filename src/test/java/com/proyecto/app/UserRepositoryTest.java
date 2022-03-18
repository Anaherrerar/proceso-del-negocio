package com.proyecto.app;


import com.proyecto.app.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NOME)
@Rollback(value = false)
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repository;

    public void testCreateUser(){
        User user = new User();
        user.setEmail("aeherrerar@ufpso.edu.co");
        user.setPassword("Ana190199.");
        user.setFirstName("Ana");
        user.SetLastName("Herrera");

        User savedUser = repository.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertEquals(user.getEmail(), existUser.getEmail());


    }
}
