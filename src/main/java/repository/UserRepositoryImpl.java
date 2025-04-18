package repository;

import lombok.extern.slf4j.Slf4j;
import model.User;
import model.UserDTO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import util.Mapper;

import java.util.List;
import java.util.Optional;

@Slf4j
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void addUser(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        } catch (RuntimeException e) {
            log.error("Возникла ошибка при работе с базой данных " + e.getMessage());
        } catch (Exception e) {
            log.error("Возникла непредвиденная ошибка " + e);
        }
    }

    @Override
    public Optional<List<User>> getAllUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            List<User> users = session.createQuery("FROM User", User.class).list();
            transaction.commit();
            return Optional.of(users);
        } catch (RuntimeException e) {
            log.error("Возникла ошибка при обращении к базе данных " + e.getMessage());
            return Optional.empty();
        } catch (Exception e) {
            log.error("Возникла непредвиденная ошибка " + e);
            return Optional.empty();
        }
    }
}
