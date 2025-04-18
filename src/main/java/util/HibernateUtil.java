package util;

import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
@Slf4j
public class HibernateUtil {
    // @Getter мне IDE предлагало сгенерировать геттер-аннотацию для SessionFactory,но он же
    // вроде генерит только для нестатических полей?
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.properties");
            configuration.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (RuntimeException e) {
            log.error("Произошла ошибка в инициализации сессии sessionFactory", e);
            throw new RuntimeException();
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
